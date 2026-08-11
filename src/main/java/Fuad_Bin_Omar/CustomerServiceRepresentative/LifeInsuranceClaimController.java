package Fuad_Bin_Omar.CustomerServiceRepresentative;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.ArrayList;

public class LifeInsuranceClaimController
{
    @javafx.fxml.FXML
    private TextField PolicyIDTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> ClaimTypeComboBox;
    @javafx.fxml.FXML
    private TextField UploadedFileTextfield;
    @javafx.fxml.FXML
    private TextField DocumentationProofTextfield;
    @javafx.fxml.FXML
    private TextField StatusTextfield;
    @javafx.fxml.FXML
    private TextField BankAccountNumberTextfield;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private TextField CustomerNameTextfield;
    @javafx.fxml.FXML
    private TextField BankNameTextfield;
    @javafx.fxml.FXML
    private TextField ClaimIDTextfield;

    private ArrayList<LifeInsuranceClaimProcessing> claimList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        ClaimTypeComboBox.getItems().addAll("Death Claim", "Maturity Claim", "Accidental Death Claim", "Critical Illness Claim");

    }

    @javafx.fxml.FXML
    public void ChooseFileButton(ActionEvent actionEvent) {

        FileChooser fileChooser = new FileChooser();

        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            UploadedFileTextfield.setText(selectedFile.getAbsolutePath());
        }
    }

    @javafx.fxml.FXML
    public void SubmitClaimButton(ActionEvent actionEvent) {

// Validation
        if (CustomerNameTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Customer Name is required!");
            a.showAndWait();
            return;
        }

        if (PolicyIDTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Policy ID is required!");
            a.showAndWait();
            return;
        }

        if (BankNameTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Bank Name is required!");
            a.showAndWait();
            return;
        }

        if (BankAccountNumberTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Bank Account Number is required!");
            a.showAndWait();
            return;
        }

        if (ClaimTypeComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select a Claim Type!");
            a.showAndWait();
            return;
        }

        if (DocumentationProofTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Documentation Proof is required!");
            a.showAndWait();
            return;
        }

        if (DatePicker.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select a Date!");
            a.showAndWait();
            return;
        }


        // Create Instance
        LifeInsuranceClaimProcessing claim =
                new LifeInsuranceClaimProcessing(

                        CustomerNameTextfield.getText(),
                        PolicyIDTextfield.getText(),
                        BankNameTextfield.getText(),
                        BankAccountNumberTextfield.getText(),
                        ClaimTypeComboBox.getValue(),
                        DocumentationProofTextfield.getText(),
                        UploadedFileTextfield.getText(),
                        ClaimIDTextfield.getText(),
                        "Pending",
                        DatePicker.getValue()
                );


        // Add to List
        claimList.add(claim);

        StatusTextfield.setText("Pending");


        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Life Insurance Claim submitted successfully.");
        a.showAndWait();

    }

    @javafx.fxml.FXML
    public void ClearButton(ActionEvent actionEvent) {

        CustomerNameTextfield.clear();
        PolicyIDTextfield.clear();
        BankNameTextfield.clear();
        BankAccountNumberTextfield.clear();
        DocumentationProofTextfield.clear();
        UploadedFileTextfield.clear();
        ClaimIDTextfield.clear();
        StatusTextfield.clear();

        ClaimTypeComboBox.getSelectionModel().clearSelection();
        DatePicker.setValue(null);
    }

    @javafx.fxml.FXML
    public void LookupButton(ActionEvent actionEvent) {

        String policyID = PolicyIDTextfield.getText().trim();

        for (LifeInsuranceClaimProcessing claim : claimList) {

            if (claim.getPolicyID().equalsIgnoreCase(policyID)) {

                CustomerNameTextfield.setText(claim.getCustomerName());
                BankNameTextfield.setText(claim.getBankName());
                BankAccountNumberTextfield.setText(claim.getBankAccountNumber());
                ClaimTypeComboBox.setValue(claim.getClaimType());
                DatePicker.setValue(claim.getDate());
                DocumentationProofTextfield.setText(claim.getDocumentationProof());
                UploadedFileTextfield.setText(claim.getUploadedFile());
                ClaimIDTextfield.setText(claim.getClaimID());
                StatusTextfield.setText(claim.getStatus());

                return;
            }
        }

        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText("Policy ID not found!");
        a.showAndWait();
    }
}