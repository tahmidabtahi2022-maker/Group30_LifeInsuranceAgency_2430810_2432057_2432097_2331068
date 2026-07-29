package Jamiul_Huda.InsuranceAgentControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class PolicyApplicationController {

    @FXML
    private Button searchButton;

    @FXML
    private TextField riskBaselineTextField;

    @FXML
    private TextField clientIdTextField;

    @FXML
    private TextField nomineeNameTextField;

    @FXML
    private TextField applicationStatusTextField;

    @FXML
    private Label notificationLabel;

    @FXML
    private Button calculateRiskButton;

    @FXML
    private TextField customerStatusTextField;

    @FXML
    private Button clearButton;

    @FXML
    private Button submitProposalButton;

    @FXML
    private ComboBox<String> insurancePackageComboBox;

    @FXML
    private TextField sumAssuredTextField;

    @FXML
    private ComboBox<String> healthCategoryComboBox;

    //===================== Scene Switch =====================

    private void switchScene(ActionEvent event, String fxml) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(fxml));

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));

        stage.show();
    }

    //===================== Dashboard =====================

    @FXML
    private void openDashboard(ActionEvent event) throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/InsuranceAgentDashboardView.fxml");
    }

    //===================== Review Tracker =====================

    @FXML
    private void openPendingRenewals(ActionEvent event) throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/ReviewTracker.fxml");
    }

    //===================== Request Documents =====================

    @FXML
    private void openMessages(ActionEvent event) throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/AgentRequestDocuments.fxml");
    }

    //===================== Performance Report =====================

    @FXML
    private void openSettings(ActionEvent event) throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/AgentPerformanceReport.fxml");
    }

    //===================== Logout =====================

    @FXML
    private void logout(ActionEvent event) {

        System.exit(0);

    }

    //===================== Search Customer =====================

    @FXML
    private void searchCustomer(ActionEvent event) {

        notificationLabel.setText("Customer Found.");

    }

    //===================== Calculate Risk =====================

    @FXML
    private void calculateRisk(ActionEvent event) {

        riskBaselineTextField.setText("Medium Risk");

        notificationLabel.setText("Risk Calculated.");

    }

    //===================== Submit Application =====================

    @FXML
    private void submitProposal(ActionEvent event) {

        applicationStatusTextField.setText("Pending Client Verification");

        notificationLabel.setText("Policy Application Submitted Successfully.");

    }

    //===================== Clear =====================

    @FXML
    private void clearForm(ActionEvent event) {

        clientIdTextField.clear();
        nomineeNameTextField.clear();
        sumAssuredTextField.clear();
        customerStatusTextField.clear();
        applicationStatusTextField.clear();
        riskBaselineTextField.clear();

        insurancePackageComboBox.getSelectionModel().clearSelection();
        healthCategoryComboBox.getSelectionModel().clearSelection();

        notificationLabel.setText("Form Cleared.");

    }


    @FXML
    public void initialize() {

        insurancePackageComboBox.getItems().addAll(
                "Basic Life Insurance",
                "Premium Life Insurance",
                "Family Protection Plan",
                "Senior Citizen Plan"
        );

        healthCategoryComboBox.getItems().addAll(
                "Low Risk",
                "Medium Risk",
                "High Risk"
        );

    }

}