package Kazi_Tahmid_Abtahi.CustomerControllers;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class claimsAndSurrenderTrackingController
{
    @javafx.fxml.FXML
    private Label statusMessageLabel;
    @javafx.fxml.FXML
    private TableColumn claimIdTC;
    @javafx.fxml.FXML
    private TableView pastPayoutsTableView;
    @javafx.fxml.FXML
    private TableColumn payoutAmountTC;
    @javafx.fxml.FXML
    private ComboBox claimSelectCB;
    @javafx.fxml.FXML
    private TableColumn payoutDateTC;
    @javafx.fxml.FXML
    private TableColumn claimTypeTC;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn policyTypeTC;
    @javafx.fxml.FXML
    private Label payOutProcessProgressStatusLabel;
    @javafx.fxml.FXML
    private Label documentVerificationStatusLabel;
    @javafx.fxml.FXML
    private Label policyIntegrityValidationStatusLabel;
    @javafx.fxml.FXML
    private Label claimRequestSubmittedStatusLabel;
    @javafx.fxml.FXML
    private Label financeApprovalStatusLabel;

    public void receiveUserEmail(String email) {
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void downloadClaimHistorySummaryButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadClaimDetailsButtonOnAction(ActionEvent actionEvent) {
    }
}