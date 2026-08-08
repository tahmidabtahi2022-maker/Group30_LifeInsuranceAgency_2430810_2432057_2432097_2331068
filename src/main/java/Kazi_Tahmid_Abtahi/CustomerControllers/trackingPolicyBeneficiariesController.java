package Kazi_Tahmid_Abtahi.CustomerControllers;

import Kazi_Tahmid_Abtahi.Model_Classes.Beneficiary;
import Kazi_Tahmid_Abtahi.Model_Classes.Customer;
import Kazi_Tahmid_Abtahi.Model_Classes.Policy;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.ArrayList;

public class trackingPolicyBeneficiariesController {
    @javafx.fxml.FXML
    private TableColumn<Beneficiary, String> policyTypeTC;
    @javafx.fxml.FXML
    private TextField policyIdUpdateTF;
    @javafx.fxml.FXML
    private TextField updateAllocationPercentageInputTF;
    @javafx.fxml.FXML
    private Label updateInformationStatusLabel;
    @javafx.fxml.FXML
    private TableView<Beneficiary> policybeneficiariesTableview;
    @javafx.fxml.FXML
    private TableColumn<Beneficiary, String> legalRelationshipTC;
    @javafx.fxml.FXML
    private TextField updateBeneficiaryNameInputTF;
    @javafx.fxml.FXML
    private TableColumn<Beneficiary, String> beneficiaryNameTC;
    @javafx.fxml.FXML
    private TableColumn<Beneficiary, String> policyIdTC;
    @javafx.fxml.FXML
    private TableColumn<Beneficiary, Float> allocationPercentageTC;
    @javafx.fxml.FXML
    private TextField updateBeneficiaryRelationshipInputTF;

    String userEmail;
    String customerId;
    ArrayList<Policy> customerPolicyList;

    String currentPolicyId;
    String currentPolicyType;
    ArrayList<Beneficiary> stagingBeneficiaryList;

    @javafx.fxml.FXML
    public void initialize() {
        customerPolicyList = new ArrayList<Policy>();
        stagingBeneficiaryList = new ArrayList<Beneficiary>();

        policyIdTC.setCellValueFactory(new PropertyValueFactory<>("policyId"));
        policyTypeTC.setCellValueFactory(new PropertyValueFactory<>("policyType"));
        beneficiaryNameTC.setCellValueFactory(new PropertyValueFactory<>("beneficiaryName"));
        legalRelationshipTC.setCellValueFactory(new PropertyValueFactory<>("relationship"));
        allocationPercentageTC.setCellValueFactory(new PropertyValueFactory<>("allocationPercentage"));
    }

    public void receiveUserEmail(String email) {
        this.userEmail = email;
        findCustomerId(email);
        loadCustomerPolicies();
    }


    @javafx.fxml.FXML
    public void saveBeneficiaryInformationsButtonOnActionS(ActionEvent actionEvent) {
        if (currentPolicyId == null) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Load a policy first");
            myAlert.show();
            return;
        }

        if (stagingBeneficiaryList.isEmpty()) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Add at least one beneficiary before saving");
            myAlert.show();
            return;
        }

        float total = 0;
        for (Beneficiary b : stagingBeneficiaryList ) {
            total += b.getAllocationPercentage();
        }

        if (total < 99.99f || total > 100.01f) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Total allocation must equal exactly 100%. Current total: " + total + "%");
            myAlert.show();
            return;
        }

        ArrayList<Policy> allPolicies = new ArrayList<Policy>();
        try {
            File f = new File("PolicyInfo.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                allPolicies.add((Policy) ois.readObject());
            }
        } catch (Exception e) {
            // end of file reached, or file doesn't exist yet
        }

        boolean found = false;
        for (Policy p : allPolicies) {
            if (p.getPolicyId().equals(currentPolicyId)) {
                p.setBeneficiaryList(new ArrayList<Beneficiary>(stagingBeneficiaryList));
                found = true;
                break;
            }
        }

        if (!found) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Could not find that policy in storage to save against");
            myAlert.show();
            return;
        }

        try {
            File f = new File("PolicyInfo.bin");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Policy p : allPolicies) {
                oos.writeObject(p);
            }
            oos.close();
        } catch (Exception e) {
            updateInformationStatusLabel.setText("Status: failed to save changes.");
            return;
        }

        updateInformationStatusLabel.setText("Beneficiary information successfully saved.");

        loadCustomerPolicies();

        policybeneficiariesTableview.getItems().clear();
        for (Beneficiary b : stagingBeneficiaryList) {
            policybeneficiariesTableview.getItems().add(b);
        }

        currentPolicyId = null;
        currentPolicyType = null;
        stagingBeneficiaryList = new ArrayList<Beneficiary>();
        policyIdUpdateTF.clear();

    }

    @javafx.fxml.FXML
    public void addBeneficiaryToListButtonOnAction(ActionEvent actionEvent) {
        if (currentPolicyId == null) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Load a policy first");
            myAlert.show();
            return;
        }

        String name = updateBeneficiaryNameInputTF.getText();
        String relationship = updateBeneficiaryRelationshipInputTF.getText();
        String allocationText = updateAllocationPercentageInputTF.getText();

        //validation - no field left empty
        if (name.isEmpty() || relationship.isEmpty() || allocationText.isEmpty()) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Fill up the beneficiary form properly");
            myAlert.show();
            return;
        }

        float allocation;
        try {
            allocation = Float.parseFloat(allocationText);
        } catch (Exception e) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Allocation percentage must be a number");
            myAlert.show();
            return;
        }
        if (allocation < 1 || allocation > 100) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Allocation percentage must be between 1 and 100");
            myAlert.show();
            return;
        }

        float prospectiveTotal = 0;
        for (Beneficiary b : stagingBeneficiaryList ) {
            prospectiveTotal += b.getAllocationPercentage();
        }
        if (prospectiveTotal > 100.01f) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("That would push the total over 100%");
            myAlert.show();
            return;
        }

        Beneficiary newBeneficiary = new Beneficiary(currentPolicyId, currentPolicyType, name, relationship, allocation);
        stagingBeneficiaryList.add(newBeneficiary);
        policybeneficiariesTableview.getItems().add(newBeneficiary);

        float total = 0;
        for (Beneficiary b : stagingBeneficiaryList ) {
            total += b.getAllocationPercentage();
        }
        updateInformationStatusLabel.setText("Status: beneficiary added to list. Current total: " + total + "%.");

        updateBeneficiaryNameInputTF.clear();
        updateBeneficiaryRelationshipInputTF.clear();
        updateAllocationPercentageInputTF.clear();
    }

    @javafx.fxml.FXML
    public void loadPolicyBeneficiaryInformationsButtonOnAction(ActionEvent actionEvent) {
        String policyId = policyIdUpdateTF.getText();

        //validation
        if (policyId.isEmpty()) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Enter a policy id first");
            myAlert.show();
            return;
        }

        //verification - policy id belongs to this customer
        Policy targetPolicy = null;
        for (Policy p : customerPolicyList) {
            if (p.getPolicyId().equals(policyId)) {
                targetPolicy = p;
                break;
            }
        }
        if (targetPolicy == null) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("That policy id is not one of your policies");
            myAlert.show();
            return;
        }

        currentPolicyId = policyId;
        currentPolicyType = targetPolicy.getPolicyType();
        stagingBeneficiaryList = new ArrayList<Beneficiary>();
        if (targetPolicy.getBeneficiaryList() != null) {
            stagingBeneficiaryList.addAll(targetPolicy.getBeneficiaryList());
        }

        policybeneficiariesTableview.getItems().clear();
        for (Beneficiary b : stagingBeneficiaryList) {
            policybeneficiariesTableview.getItems().add(b);
        }

        float total = 0;
        for (Beneficiary b : stagingBeneficiaryList ) {
            total += b.getAllocationPercentage();
        }

        updateInformationStatusLabel.setText("Status: loaded policy " + policyId + " for editing. "
                + stagingBeneficiaryList.size() + " existing beneficiary row(s), current total " + total + "%.");
    }



    public void findCustomerId(String email) {
        try {
            File f = new File("CustomerInfo.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                Customer c = (Customer) ois.readObject();
                if (c.getEmailAddress().equalsIgnoreCase(email)) {
                    customerId = c.getUserId();
                    break;
                }
            }
        } catch (Exception e) {
            // end of file reached, or file doesn't exist yet
        }
    }

    public void loadCustomerPolicies() {
        customerPolicyList.clear();
        try {
            File f = new File("PolicyInfo.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                Policy p = (Policy) ois.readObject();
                if (customerId != null && p.getCustomerId().equals(customerId)) {
                    customerPolicyList.add(p);
                }
            }
        } catch (Exception e) {
            // end of file reached, or file doesn't exist yet
        }
    }
}