package Jamiul_Huda.InsuranceAgentControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateCustomerProfileController {

    @FXML
    private Label pageTitleLabel;

    @FXML
    private TextField nidTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private Button createProfileButton;

    @FXML
    private Label agentNameLabel;

    @FXML
    private Button logoutButton;

    @FXML
    private Button pendingRenewalsButton;

    @FXML
    private Button messagesButton;

    @FXML
    private Label statusLabel;

    @FXML
    private Button dashboardButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Button clearButton;

    @FXML
    private DatePicker dateOfBirthPicker;

    @FXML
    private TextField fullNameTextField;

    @FXML
    private Label mobileeNumberTextField;

    @FXML
    private TextField mobileNumberTextField;

    @FXML
    private Button clientPortfolioButton;

    @FXML
    private Button onboardProspectButton;

    @FXML
    private Label dashboardTitleLabel;



    private void switchScene(ActionEvent event, String fxml) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(fxml));

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));

        stage.show();
    }

    @FXML
    private void openDashboard(ActionEvent event) throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/InsuranceAgentDashboardView.fxml");
    }

    @FXML
    private void openClientPortfolio(ActionEvent event) throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/InsuranceAgentDashboardView.fxml");
    }

    @FXML
    private void openOnboardProspect(ActionEvent event) {

        statusLabel.setText("Already on Create Customer Profile page.");

    }

    @FXML
    private void openPendingRenewals(ActionEvent event) throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/ReviewTracker.fxml");
    }


    @FXML
    private void openMessages(ActionEvent event) throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/AgentRequestDocuments.fxml");
    }


    @FXML
    private void openSettings(ActionEvent event) throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/AgentPerformanceReport.fxml");
    }


    @FXML
    private void logout(ActionEvent event) {

        System.exit(0);

    }

    @FXML
    private void createProfile(ActionEvent event) {

        if (fullNameTextField.getText().isEmpty()
                || nidTextField.getText().isEmpty()
                || mobileNumberTextField.getText().isEmpty()
                || emailTextField.getText().isEmpty()
                || dateOfBirthPicker.getValue() == null) {

            statusLabel.setText("Please fill all fields.");

            return;
        }

        statusLabel.setText("Customer Profile Created Successfully!");

    }

    @FXML
    private void clearForm(ActionEvent event) {

        fullNameTextField.clear();
        nidTextField.clear();
        mobileNumberTextField.clear();
        emailTextField.clear();
        dateOfBirthPicker.setValue(null);

        statusLabel.setText("Form Cleared");

    }

}