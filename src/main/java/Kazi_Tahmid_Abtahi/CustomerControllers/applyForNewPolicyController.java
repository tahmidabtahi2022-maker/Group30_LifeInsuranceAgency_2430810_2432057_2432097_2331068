package Kazi_Tahmid_Abtahi.CustomerControllers;

import Kazi_Tahmid_Abtahi.Model_Classes.Customer;
import Kazi_Tahmid_Abtahi.Model_Classes.Policy;
import Kazi_Tahmid_Abtahi.Model_Classes.Quote;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068.AppendableObjectOutputStream;

import java.io.*;
import java.time.LocalDate;
import java.util.Random;

public class applyForNewPolicyController
{
    @javafx.fxml.FXML
    private Label confirmationStatusLabel;
    @javafx.fxml.FXML
    private TextArea policyAndQuoteDetailsTA;
    @javafx.fxml.FXML
    private CheckBox confirmPolicyDetailsCheckbox;

    private String customerId;
    private Policy pendingPolicy;

    public void receiveUserEmail(String email) {
        this.customerId = findCustomerId(email);
        if (this.customerId == null) {
            confirmationStatusLabel.setText("Could not find your customer account");
        }
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void confirmApplicationAndPayFirstPremiumButtonOnAction(ActionEvent actionEvent) {
        if (pendingPolicy == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("No quote details found");
            a.show();
            confirmationStatusLabel.setText("No quote details found");
            return;
        }

        if (this.customerId == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Customer account not found. Please log in again.");
            a.show();
            confirmationStatusLabel.setText("Customer account not found. Please log in again.");
            return;
        }

        if (!confirmPolicyDetailsCheckbox.isSelected()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please check the confirmation checkbox");
            a.show();
            confirmationStatusLabel.setText("Please check the confirmation checkbox");
            return;
        }

        String firstFourDigits = String.format("%04d", LocalDate.now().getYear());
        Random r = new Random();
        String lastFourDigits = String.format("%04d", r.nextInt(10000));
        String generatedPolicyId = firstFourDigits + lastFourDigits;

        pendingPolicy.setCustomerId(this.customerId);
        pendingPolicy.setPolicyId(generatedPolicyId);
        pendingPolicy.setStatus("Active");
        pendingPolicy.setNextDueDate(LocalDate.now().plusYears(1));

        savePolicyToBinFile(pendingPolicy);

        confirmationStatusLabel.setText("Application submitted successfully!" +  "Your new Policy ID is " + pendingPolicy.getPolicyId() + ". Policy Type: " + pendingPolicy.getPolicyType() +  ", Coverage: " + pendingPolicy.getCoverageAmount() + ", Annual Premium: " + pendingPolicy.getYearlyPremium() +  ". Your policy is now Active."
        );

        confirmPolicyDetailsCheckbox.setSelected(false);
        policyAndQuoteDetailsTA.setText("Application Submitted Successfully");

    }


    public void receiveQuoteDetails(Quote quote) {

        if (quote == null) {
            pendingPolicy = null;
            return;
        }

        pendingPolicy = new Policy(
                null,
                null,
                quote.getPolicyType(),
                "Pending",
                quote.getSmokerStatus(),
                quote.getMedicalHistory(),
                quote.getCoverageAmount(),
                quote.getCalculatedPremium(),
                0.00f,
                quote.getPolicyTerm(),
                null
        );

        policyAndQuoteDetailsTA.setText("Policy Type: " + quote.getPolicyType() + "\n" + "Policy Term: " + quote.getPolicyTerm() + " years\n" +  "Coverage Amount: " + quote.getCoverageAmount() + "\n" +  "Smoker Status: " + quote.getSmokerStatus() + "\n" +  "Medical History: " + quote.getMedicalHistory() + "\n" +  "Estimated Annual Premium: " + quote.getCalculatedPremium()
        );
    }

    private void savePolicyToBinFile(Policy policy) {
        try {
            File f = new File("PolicyInfo.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(policy);
            oos.close();
        } catch (Exception e) {
            //
        }
    }


    private String findCustomerId(String email) {
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
