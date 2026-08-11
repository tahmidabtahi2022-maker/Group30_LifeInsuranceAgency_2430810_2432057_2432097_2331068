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

public class InsuranceAgentDashboardController {

    @FXML
    private Label dashboardTitleLabel;

    @FXML
    private Label agentNameLabel;

    @FXML
    private Label totalClientsValueLabel;

    @FXML
    private Label policyCountValueLabel;

    @FXML
    private Label renewalsDueValueLabel;

    @FXML
    private Label pendingInteractionsValueLabel;

    @FXML
    private Label statusLabel;

    @FXML
    private TextField searchClientTextField;

    @FXML
    private Button dashboardButton;

    @FXML
    private Button clientPortfolioButton;

    @FXML
    private Button pendingRenewalsButton;

    @FXML
    private Button messagesButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button searchButton;

    @FXML
    private TableView<?> clientTableView;

    @FXML
    private TableColumn<?, ?> clientIdColumn;

    @FXML
    private TableColumn<?, ?> clientNameColumn;

    @FXML
    private TableColumn<?, ?> policyCountColumn;

    @FXML
    private TableColumn<?, ?> renewalDeadlineColumn;

    @FXML
    private TableColumn<?, ?> pendingInteractionColumn;

    @FXML
    private TableColumn<?, ?> statusColumn;

    //==================================================
    // INITIALIZE
    //==================================================

    @FXML
    public void initialize() {

        dashboardTitleLabel.setText("Insurance Agent Dashboard");

        agentNameLabel.setText("Welcome, Insurance Agent");

        totalClientsValueLabel.setText("25");

        policyCountValueLabel.setText("40");

        renewalsDueValueLabel.setText("8");

        pendingInteractionsValueLabel.setText("5");

        statusLabel.setText("Dashboard Loaded Successfully.");

    }

    //==================================================
    // COMMON SCENE SWITCH
    //==================================================

    private void switchScene(ActionEvent event, String fxml)
            throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource(fxml));

        Stage stage = (Stage)
                ((Node) event.getSource())
                        .getScene()
                        .getWindow();

        stage.setScene(new Scene(root));

        stage.show();

    }

    //==================================================
    // DASHBOARD
    //==================================================

    @FXML
    private void openDashboard(ActionEvent event) {

        statusLabel.setText("Already on Dashboard.");

    }

    //==================================================
    // CREATE CUSTOMER PROFILE
    //==================================================

    @FXML
    private void openClientPortfolio(ActionEvent event)
            throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/CreateCustomerProfileView.fxml");

    }

    //==================================================
    // POLICY APPLICATION
    //==================================================

    @FXML
    private void openPolicyApplication(ActionEvent event)
            throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/PolicyApplication.fxml");

    }

    //==================================================
    // FINANCIAL QUOTE
    //==================================================

    @FXML
    private void openFinancialQuote(ActionEvent event)
            throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/FinancialQuote.fxml");

    }

    //==================================================
    // REVIEW TRACKER
    //==================================================

    @FXML
    private void openPendingRenewals(ActionEvent event)
            throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/ReviewTracker.fxml");

    }

    //==================================================
    // CLIENT VERIFICATION
    //==================================================

    @FXML
    private void openClientVerification(ActionEvent event)
            throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/ClientVerificationAuditFeed.fxml");

    }

    //==================================================
    // REQUEST DOCUMENTS
    //==================================================

    @FXML
    private void openMessages(ActionEvent event)
            throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/AgentRequestDocuments.fxml");

    }

    //==================================================
    // PERFORMANCE REPORT
    //==================================================

    @FXML
    private void openSettings(ActionEvent event)
            throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/AgentPerformanceReport.fxml");

    }

    //==================================================
    // SEARCH CUSTOMER
    //==================================================

    @FXML
    private void searchClient(ActionEvent event) {

        String keyword = searchClientTextField.getText().trim();

        if (keyword.isEmpty()) {

            statusLabel.setText("Enter Customer ID or Name.");

            return;

        }

        statusLabel.setText(
                "Searching for : " + keyword +
                        " (Database connection will be added later)");

    }

    //==================================================
    // LOGOUT
    //==================================================

    @FXML
    private void logout(ActionEvent event)
            throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource(
                        "/Jamiul_Huda/InsuranceAgent/Login.fxml"));

        Stage stage = (Stage)
                ((Node) event.getSource())
                        .getScene()
                        .getWindow();

        stage.setScene(new Scene(root));

        stage.setTitle("Insurance Agent Login");

        stage.show();

    }

}