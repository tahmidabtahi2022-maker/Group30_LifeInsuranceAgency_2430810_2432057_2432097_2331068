package Kazi_Tahmid_Abtahi.AccountsOfficerControllers;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class verifyPremiumsController
{
    @javafx.fxml.FXML
    private TableColumn bankReferenceNumberTC;
    @javafx.fxml.FXML
    private TableView unverifiedPaymentsTableView;
    @javafx.fxml.FXML
    private Label statusMessageLabel;
    @javafx.fxml.FXML
    private ComboBox statusCB;
    @javafx.fxml.FXML
    private TextField rejectionCommentTF;
    @javafx.fxml.FXML
    private TableColumn policyIdTC;
    @javafx.fxml.FXML
    private TableColumn customerIdTC;
    @javafx.fxml.FXML
    private TableColumn amountPaidTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void confirmVerificationButtonOnAction(ActionEvent actionEvent) {
    }
}