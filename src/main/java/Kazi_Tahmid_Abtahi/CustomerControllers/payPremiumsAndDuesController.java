package Kazi_Tahmid_Abtahi.CustomerControllers;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class payPremiumsAndDuesController
{
    @javafx.fxml.FXML
    private TableView customerPolicyDataTableview;
    @javafx.fxml.FXML
    private TextField selectedPolicyIdForPaymentTF;
    @javafx.fxml.FXML
    private ComboBox paymentMethodCB;
    @javafx.fxml.FXML
    private TextField enterPaymentAmountTF;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn policyIdTC;
    @javafx.fxml.FXML
    private TableColumn premiumDueAmountTC;
    @javafx.fxml.FXML
    private TableColumn nextDueDateTC;
    @javafx.fxml.FXML
    private TextField gatewayTransactionReferenceNumberTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void confirmAndPayPremiumButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DownloadTaxRecieptButtonOnAction(ActionEvent actionEvent) {
    }
}