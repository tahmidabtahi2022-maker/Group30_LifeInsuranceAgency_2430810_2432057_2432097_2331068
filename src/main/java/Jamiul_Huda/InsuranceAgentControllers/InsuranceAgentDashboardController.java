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

public class InsuranceAgentDashboardController {

    @FXML
    private Button logoutButton;

    @FXML
    private Button messagesButton;

    @FXML
    private Button clientPortfolioButton;

    @FXML
    private Label dashboardTitleLabel;

    @FXML
    private Label agentNameLabel;

    @FXML
    private Button pendingRenewalsButton;

    @FXML
    private Label statusLabel;

    @FXML
    private Button dashboardButton;

    @FXML
    private Button settingsButton;

    @FXML
    private TableColumn<?, ?> clientIdColumn;

    @FXML
    private Button searchButton;

    @FXML
    private Label renewalsDueLabel;

    @FXML
    private Label policyCountValueLabel;

    @FXML
    private Label totalClientsLabel;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private Label pendingInteractionsLabel;

    @FXML
    private TableColumn<?, ?> pendingInteractionColumn;

    @FXML
    private TableColumn<?, ?> policyCountColumn;

    @FXML
    private TextField searchClientTextField;

    @FXML
    private TableColumn<?, ?> renewalDeadlineColumn;

    @FXML
    private TableColumn<?, ?> clientNameColumn;

    @FXML
    private Label totalClientsValueLabel;

    @FXML
    private Label policyCountLabel;

    @FXML
    private Label clientPortfolioTitleLabel;

    @FXML
    private Label pendingInteractionsValueLabel;

    @FXML
    private Label renewalsDueValueLabel;

    @FXML
    private TableView<?> clientTableView;

    private void switchScene(ActionEvent event, String fxml) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(fxml));

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));

        stage.show();
    }

    @FXML
    private void openDashboard(ActionEvent event) {

    }


    @FXML
    private void openClientPortfolio(ActionEvent event) throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/CreateCustomerProfileView.fxml");
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
    private void searchClient(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Search");
        alert.setHeaderText(null);
        alert.setContentText("Search functionality will be implemented.");
        alert.showAndWait();

    }

}