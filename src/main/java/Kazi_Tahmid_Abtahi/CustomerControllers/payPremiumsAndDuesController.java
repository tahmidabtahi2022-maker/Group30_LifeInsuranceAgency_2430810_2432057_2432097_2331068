package Kazi_Tahmid_Abtahi.CustomerControllers;

import Kazi_Tahmid_Abtahi.Model_Classes.Customer;
import Kazi_Tahmid_Abtahi.Model_Classes.Policy;
import Kazi_Tahmid_Abtahi.Model_Classes.PremiumPayment;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068.AppendableObjectOutputStream;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class payPremiumsAndDuesController
{

    @javafx.fxml.FXML
    private TableView<Policy> customerPolicyDataTableview;
    @javafx.fxml.FXML
    private TextField selectedPolicyIdForPaymentTF;
    @javafx.fxml.FXML
    private ComboBox<String> paymentMethodCB;
    @javafx.fxml.FXML
    private TextField enterPaymentAmountTF;
    @javafx.fxml.FXML
    private TableColumn<Policy, String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<Policy, String> policyIdTC;
    @javafx.fxml.FXML
    private TableColumn<Policy, Float> premiumDueAmountTC;
    @javafx.fxml.FXML
    private TableColumn<Policy, LocalDate> nextDueDateTC;
    @javafx.fxml.FXML
    private TextField gatewayTransactionReferenceNumberTF;
    @javafx.fxml.FXML
    private Label statusLabel;

    String customerId = "";

    ArrayList<Policy> pendingPolicies;

    @javafx.fxml.FXML
    public void initialize() {
        pendingPolicies = new ArrayList<Policy>();
        paymentMethodCB.getItems().addAll("Bank Transfer", "Card", "Mobile Financial Service");

        policyIdTC.setCellValueFactory(new PropertyValueFactory<>("policyId"));
        premiumDueAmountTC.setCellValueFactory(new PropertyValueFactory<>("yearlyPremium"));
        nextDueDateTC.setCellValueFactory(new PropertyValueFactory<>("nextDueDate"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("displayStatus"));
    }

    public void receiveUserEmail(String email) {
        this.customerId = lookupCustomerId(email);
        loadPendingPremiums();
    }

    public void loadPendingPremiums() {
        customerPolicyDataTableview.getItems().clear();
        pendingPolicies = new ArrayList<Policy>();

        ArrayList<Policy> allPolicies = new ArrayList<Policy>();
        try {
            File f = new File("PolicyInfo.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                allPolicies.add((Policy) ois.readObject());
            }
        } catch (Exception e) {
            //
        }

        for (Policy p : allPolicies) {
            if (p.getCustomerId() != null && p.getCustomerId().equals(customerId)) {
                if (p.getNextDueDate() != null && p.getNextDueDate().isBefore(LocalDate.now())) {
                    p.setDisplayStatus("Overdue");
                } else {
                    p.setDisplayStatus("Pending");
                }

                pendingPolicies.add(p);
                customerPolicyDataTableview.getItems().add(p);
            }
        }
    }

    @javafx.fxml.FXML
    public void confirmAndPayPremiumButtonOnAction(ActionEvent actionEvent) {

        if (selectedPolicyIdForPaymentTF.getText().isEmpty() || gatewayTransactionReferenceNumberTF.getText().isEmpty() || enterPaymentAmountTF.getText().isEmpty() || paymentMethodCB.getValue() == null) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Please fill in the Policy ID, payment method, reference number, and amount.");
            myAlert.show();
            statusLabel.setText("Status: Please fill up all required fields.");
            return;
        }

        Policy targetPolicy = null;
        for (Policy p : pendingPolicies) {
            if (p.getPolicyId().equals(selectedPolicyIdForPaymentTF.getText())) {
                targetPolicy = p;
            }
        }
        if (targetPolicy == null) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("That Policy ID was not found in your pending premiums list.");
            myAlert.show();
            statusLabel.setText("Status: Policy ID not found.");
            return;
        }


        if (Float.parseFloat(enterPaymentAmountTF.getText()) != targetPolicy.getYearlyPremium()) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Payment amount must exactly match the due premium of " + targetPolicy.getYearlyPremium());
            myAlert.show();
            statusLabel.setText("Status: Payment amount does not match the due premium.");
            return;
        }

        String firstFourDigits = String.format("%04d", LocalDate.now().getYear());
        Random r = new Random();
        String lastSixDigits = String.format("%06d", r.nextInt(1000000));
        String generatedTransactionId = firstFourDigits + lastSixDigits;

        PremiumPayment payment = new PremiumPayment(
                customerId,
                targetPolicy.getPolicyId(),
                generatedTransactionId,
                paymentMethodCB.getValue(),
                gatewayTransactionReferenceNumberTF.getText(),
                Float.parseFloat(enterPaymentAmountTF.getText()),
                LocalDate.now()
        );

        savePaymentToBinFile(payment);

        targetPolicy.setNextDueDate(targetPolicy.getNextDueDate().plusYears(1));
        updatePolicyInFile(targetPolicy);

        Alert myAlert = new Alert(Alert.AlertType.INFORMATION);
        myAlert.setContentText("Payment successful! Transaction Receipt Number: " + generatedTransactionId);
        myAlert.show();
        statusLabel.setText("Status: Payment successful. Receipt Number: " + generatedTransactionId);

        selectedPolicyIdForPaymentTF.clear();
        gatewayTransactionReferenceNumberTF.clear();
        enterPaymentAmountTF.clear();
        paymentMethodCB.setValue(null);

        loadPendingPremiums();
    }

    private void savePaymentToBinFile(PremiumPayment payment) {
        try {
            File f = new File("PaymentInfo.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(payment);
            oos.close();
        } catch (Exception e) {
            statusLabel.setText("Status: Could not save the payment record.");
        }
    }

    private void updatePolicyInFile(Policy updatedPolicy) {
        ArrayList<Policy> allPolicies = new ArrayList<Policy>();
        try {
            File f = new File("PolicyInfo.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                allPolicies.add((Policy) ois.readObject());
            }
        } catch (Exception e) {
            // reached end of file
        }

        ArrayList<Policy> newPolicyList = new ArrayList<Policy>();
        for (Policy p : allPolicies) {
            if (p.getPolicyId().equals(updatedPolicy.getPolicyId())) {
                newPolicyList.add(updatedPolicy);
            } else {
                newPolicyList.add(p);
            }
        }

        try {
            FileOutputStream fos = new FileOutputStream("PolicyInfo.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Policy p : newPolicyList) {
                oos.writeObject(p);
            }
            oos.close();
        } catch (Exception e) {
            statusLabel.setText("Status: Could not update the policy record.");
        }
    }

    private String lookupCustomerId(String email) {
        try {
            File f = new File("CustomerInfo.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                Customer c = (Customer) ois.readObject();
                if (c.getEmailAddress().equals(email)) {
                    return c.getUserId();
                }
            }
        } catch (Exception e) {
            //
        }
        return null;
    }
}