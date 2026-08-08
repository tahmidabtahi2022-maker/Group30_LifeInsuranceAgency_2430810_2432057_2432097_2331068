package Kazi_Tahmid_Abtahi.AccountsOfficerControllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class manageLoanAndOperationsController
{
    @javafx.fxml.FXML
    private Label statusMessageLabel;
    @javafx.fxml.FXML
    private TableColumn totalCashValueTC;
    @javafx.fxml.FXML
    private TableColumn loanAppIdTC;
    @javafx.fxml.FXML
    private TableView pendingLoansTableView;
    @javafx.fxml.FXML
    private TableColumn policyIdTC;
    @javafx.fxml.FXML
    private TableColumn requestedAmountTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void approveAndFundLoanButtonOnAction(ActionEvent actionEvent) {
    }
}