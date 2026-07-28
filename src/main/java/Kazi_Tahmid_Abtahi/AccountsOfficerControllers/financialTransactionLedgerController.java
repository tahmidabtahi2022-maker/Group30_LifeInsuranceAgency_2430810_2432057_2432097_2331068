package Kazi_Tahmid_Abtahi.AccountsOfficerControllers;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class financialTransactionLedgerController
{
    @javafx.fxml.FXML
    private ComboBox transactionTypeCB;
    @javafx.fxml.FXML
    private TableView masterLedgerTableView;
    @javafx.fxml.FXML
    private TableColumn transactionTypeTC;
    @javafx.fxml.FXML
    private TableColumn amountTC;
    @javafx.fxml.FXML
    private TableColumn transactionDateTC;
    @javafx.fxml.FXML
    private Label statusMessageLabel;
    @javafx.fxml.FXML
    private TextField searchPolicyIdTF;
    @javafx.fxml.FXML
    private TableColumn transactionIdTC;
    @javafx.fxml.FXML
    private TableColumn policyIdTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void exportStatementButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterLedgerButtonOnAction(ActionEvent actionEvent) {
    }
}