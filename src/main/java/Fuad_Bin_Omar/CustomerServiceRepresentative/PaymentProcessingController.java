package Fuad_Bin_Omar.CustomerServiceRepresentative;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class PaymentProcessingController
{
    @javafx.fxml.FXML
    private TextField PolicyIDTextfield;
    @javafx.fxml.FXML
    private TableColumn<PaymentProcessingProcessing, String> ReceiptNumberColumn;
    @javafx.fxml.FXML
    private TableView<PaymentProcessingProcessing> Tableview;
    @javafx.fxml.FXML
    private TextField PaymentAmountTextfield;
    @javafx.fxml.FXML
    private TableColumn<PaymentProcessingProcessing, String> PremiumPeriodColumn;
    @javafx.fxml.FXML
    private ComboBox<String> PremiumPeriodComboBox;
    @javafx.fxml.FXML
    private TableColumn<PaymentProcessingProcessing, Float> PaymentAmountColumn;
    @javafx.fxml.FXML
    private TableColumn<PaymentProcessingProcessing, LocalDate> PaymentDateColumn;
    @javafx.fxml.FXML
    private DatePicker PaymentDatePicker;
    @javafx.fxml.FXML
    private TableColumn<PaymentProcessingProcessing, String> CustomerIDColumn;
    @javafx.fxml.FXML
    private Label ReceiptNumberLabel;
    @javafx.fxml.FXML
    private Label CurrentBalanceLabel;
    @javafx.fxml.FXML
    private Label PaymentConfirmationLabel;
    @javafx.fxml.FXML
    private Label UpdatedBalanceLabel;

    private ArrayList<PaymentProcessingProcessing> paymentList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        PremiumPeriodComboBox.getItems().addAll("Monthly", "Quarterly", "Half Yearly", "Yearly");

        CustomerIDColumn.setCellValueFactory(new PropertyValueFactory<>("CustomerID"));
        PaymentAmountColumn.setCellValueFactory(new PropertyValueFactory<>("PaymentAmount"));
        PremiumPeriodColumn.setCellValueFactory(new PropertyValueFactory<>("PremiumPeriod"));
        ReceiptNumberColumn.setCellValueFactory(new PropertyValueFactory<>("ReceiptNumber"));
        PaymentDateColumn.setCellValueFactory(new PropertyValueFactory<>("PaymentDate"));

    }

    @javafx.fxml.FXML
    public void RecordPaymentButton(ActionEvent actionEvent) {

        // Validation
        if (PolicyIDTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Customer ID / Policy ID is required!");
            a.showAndWait();
            return;
        }

        if (PaymentAmountTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Payment Amount is required!");
            a.showAndWait();
            return;
        }

        if (PremiumPeriodComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select a Premium Period!");
            a.showAndWait();
            return;
        }

        if (PaymentDatePicker.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select a Payment Date!");
            a.showAndWait();
            return;
        }


        // Create Instance
        PaymentProcessingProcessing payment =
                new PaymentProcessingProcessing(

                        PolicyIDTextfield.getText(),
                        PremiumPeriodComboBox.getValue(),
                        "",
                        "Confirmed",
                        Float.parseFloat(PaymentAmountTextfield.getText()),
                        PaymentDatePicker.getValue()
                );


// Add to TableView
        paymentList.add(payment);
        Tableview.getItems().add(payment);

        PaymentConfirmationLabel.setText("Confirmed");


        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Payment recorded successfully.");
        a.showAndWait();

}

    @javafx.fxml.FXML
    public void RefreshButton(ActionEvent actionEvent) {

        Tableview.getItems().clear();
    }

    @javafx.fxml.FXML
    public void SearchButton(ActionEvent actionEvent) {

        String policyID = PolicyIDTextfield.getText().trim();

        for (PaymentProcessingProcessing payment : paymentList) {

            if (payment.getCustomerID().equalsIgnoreCase(policyID)) {

                Tableview.getItems().clear();
                Tableview.getItems().add(payment);

                ReceiptNumberLabel.setText(payment.getReceiptNumber());
                PaymentConfirmationLabel.setText(payment.getPaymentConfirmation());

                return;
            }
        }


    }

    @javafx.fxml.FXML
    public void ClearButton(ActionEvent actionEvent) {

        PolicyIDTextfield.clear();
        PaymentAmountTextfield.clear();

        PremiumPeriodComboBox.getSelectionModel().clearSelection();
        PaymentDatePicker.setValue(null);

        CurrentBalanceLabel.setText("");
        ReceiptNumberLabel.setText("");
        UpdatedBalanceLabel.setText("");
        PaymentConfirmationLabel.setText("");
    }
    }
