package Kazi_Tahmid_Abtahi.AccountsOfficerControllers;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class disburseFundsForClaimsController
{
    @javafx.fxml.FXML
    private TableColumn claimantNameTC;
    @javafx.fxml.FXML
    private TextField outgoingBankTransferIdTF;
    @javafx.fxml.FXML
    private TableView approvedClaimsTableView;
    @javafx.fxml.FXML
    private Label statusMessageLabel;
    @javafx.fxml.FXML
    private TableColumn claimIdTC;
    @javafx.fxml.FXML
    private TableColumn policyIdTC;
    @javafx.fxml.FXML
    private TableColumn approvedPayoutAmountTC;
    @javafx.fxml.FXML
    private DatePicker disbursalDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void confirmDisbursalButtonOnAction(ActionEvent actionEvent) {
    }
}