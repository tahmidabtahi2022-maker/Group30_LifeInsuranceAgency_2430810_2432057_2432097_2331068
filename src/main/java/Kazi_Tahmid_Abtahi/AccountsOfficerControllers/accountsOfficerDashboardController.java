package Kazi_Tahmid_Abtahi.AccountsOfficerControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068.HelloApplication;

import java.io.IOException;

public class accountsOfficerDashboardController
{

    @javafx.fxml.FXML
    private AnchorPane sceneSwitchingArea;
    @javafx.fxml.FXML
    private BorderPane accountsOfficerDashboardBorderpane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void verifyPremiumsButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Accounts_Officer/verifyPremiumPaymentsView.fxml"));
        accountsOfficerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void claimFundDisbursalsButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Accounts_Officer/disburseFundsForClaimsView.fxml"));
        accountsOfficerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void agentCommissionsButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Accounts_Officer/manageAgentCommisionsView.fxml"));
        accountsOfficerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void policyAuditAndLapsesButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Accounts_Officer/policyAuditAndLapseView.fxml"));
        accountsOfficerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void financialReportingButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Accounts_Officer/agencyFinancialPerformanceView.fxml"));
        accountsOfficerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void loanOperationsButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Accounts_Officer/manageLoanAndInterestOperationsView.fxml"));
        accountsOfficerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void corporateFundAllocationButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Accounts_Officer/corporateFundAllocationAndTaxView.fxml"));
        accountsOfficerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void masterTransactionLedgerButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Accounts_Officer/financialTransactionLedgerView.fxml"));
        accountsOfficerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void signOutButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginPageView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Metlife Agency");
        nextStage.setScene(scene);
        nextStage.show();
    }
}