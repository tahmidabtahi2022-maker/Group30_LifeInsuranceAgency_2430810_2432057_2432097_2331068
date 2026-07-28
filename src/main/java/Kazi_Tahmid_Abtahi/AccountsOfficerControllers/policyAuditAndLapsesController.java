package Kazi_Tahmid_Abtahi.AccountsOfficerControllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class policyAuditAndLapsesController
{
    @javafx.fxml.FXML
    private Label statusMessageLabel;
    @javafx.fxml.FXML
    private Label totalScannedLabel;
    @javafx.fxml.FXML
    private TableColumn policyIdTC;
    @javafx.fxml.FXML
    private Label lateFeesAppliedLabel;
    @javafx.fxml.FXML
    private TableView overduePoliciesTableView;
    @javafx.fxml.FXML
    private TableColumn daysOverdueTC;
    @javafx.fxml.FXML
    private TableColumn paymentDueDateTC;
    @javafx.fxml.FXML
    private Label policiesLapsedLabel;
    @javafx.fxml.FXML
    private TableColumn customerContactTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void runAuditScanButtonOnAction(ActionEvent actionEvent) {
    }
}