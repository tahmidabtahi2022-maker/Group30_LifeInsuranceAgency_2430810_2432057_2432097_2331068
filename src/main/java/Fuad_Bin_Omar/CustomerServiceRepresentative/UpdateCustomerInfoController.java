package Fuad_Bin_Omar.CustomerServiceRepresentative;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class UpdateCustomerInfoController
{
    @javafx.fxml.FXML
    private TableColumn<UpdateCustomerInfoProcessing, String> AddressColumn;
    @javafx.fxml.FXML
    private TextField EmailAddressTextfield;
    @javafx.fxml.FXML
    private TextField PolicyOrCustomerIDTextfield;
    @javafx.fxml.FXML
    private TableColumn<UpdateCustomerInfoProcessing, String> EmailAddressColumn;
    @javafx.fxml.FXML
    private TableColumn<UpdateCustomerInfoProcessing, String> ContactNumberColumn;
    @javafx.fxml.FXML
    private TextField CustomerNameTextfield;
    @javafx.fxml.FXML
    private TextField ContactNumberTextfield;
    @javafx.fxml.FXML
    private TextField CustomerIDTextfield;
    @javafx.fxml.FXML
    private TableColumn<UpdateCustomerInfoProcessing, String> CustomerNameColumn;
    @javafx.fxml.FXML
    private DatePicker UpdateDatePicker;
    @javafx.fxml.FXML
    private TextArea AddressTextArea;
    @javafx.fxml.FXML
    private TableColumn<UpdateCustomerInfoProcessing, LocalDate> UpdateTimeColumn;
    @javafx.fxml.FXML
    private TableView<UpdateCustomerInfoProcessing> TableView;
    @javafx.fxml.FXML
    private TableColumn<UpdateCustomerInfoProcessing, String> CustomerIDColumn;


    private ArrayList<UpdateCustomerInfoProcessing> customerList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        CustomerNameColumn.setCellValueFactory(new PropertyValueFactory<>("CustomerName"));
        CustomerIDColumn.setCellValueFactory(new PropertyValueFactory<>("CustomerID"));
        EmailAddressColumn.setCellValueFactory(new PropertyValueFactory<>("EmailAddress"));
        AddressColumn.setCellValueFactory(new PropertyValueFactory<>("Address"));
        ContactNumberColumn.setCellValueFactory(new PropertyValueFactory<>("ContactNumber"));
        UpdateTimeColumn.setCellValueFactory(new PropertyValueFactory<>("UpdateDate"));
    }

    @javafx.fxml.FXML
    public void CommitUpdatedRecordButton(ActionEvent actionEvent) {

        if (CustomerNameTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Customer Name is required!");
            a.showAndWait();
            return;
        }

        if (CustomerIDTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Customer ID is required!");
            a.showAndWait();
            return;
        }

        if (UpdateDatePicker.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select Updated Date!");
            a.showAndWait();
            return;
        }


        // Create Instance
        UpdateCustomerInfoProcessing customer =
                new UpdateCustomerInfoProcessing(

                        CustomerNameTextfield.getText(),
                        CustomerIDTextfield.getText(),
                        EmailAddressTextfield.getText(),
                        AddressTextArea.getText(),
                        ContactNumberTextfield.getText(),
                        UpdateDatePicker.getValue()
                );


        // Add to TableView
        customerList.add(customer);
        TableView.getItems().add(customer);


        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Customer information updated successfully.");
        a.showAndWait();

    }

    @javafx.fxml.FXML
    public void SearchButton(ActionEvent actionEvent) {


        String customerID =
                PolicyOrCustomerIDTextfield.getText().trim();

        for (UpdateCustomerInfoProcessing customer : customerList) {

            if (customer.getCustomerID().equalsIgnoreCase(customerID)) {

                CustomerNameTextfield.setText(customer.getCustomerName());
                CustomerIDTextfield.setText(customer.getCustomerID());
                EmailAddressTextfield.setText(customer.getEmailAddress());
                AddressTextArea.setText(customer.getAddress());
                ContactNumberTextfield.setText(customer.getContactNumber());
                UpdateDatePicker.setValue(customer.getUpdateDate());

                TableView.getItems().clear();
                TableView.getItems().add(customer);

                return;
            }
        }


        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText("Customer ID not found!");
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void ClearFieldsButton(ActionEvent actionEvent) {



        PolicyOrCustomerIDTextfield.clear();
        CustomerNameTextfield.clear();
        CustomerIDTextfield.clear();
        ContactNumberTextfield.clear();
        EmailAddressTextfield.clear();
        AddressTextArea.clear();

        UpdateDatePicker.setValue(null);



    }

    @javafx.fxml.FXML
    public void ValidateDataInputsButton(ActionEvent actionEvent) {



        if (CustomerNameTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Customer Name is required!");
            a.showAndWait();
            return;
        }

        if (CustomerIDTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Customer ID is required!");
            a.showAndWait();
            return;
        }

        if (ContactNumberTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Contact Number is required!");
            a.showAndWait();
            return;
        }

        if (EmailAddressTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Email Address is required!");
            a.showAndWait();
            return;
        }

        if (AddressTextArea.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Address is required!");
            a.showAndWait();
            return;
        }

        if (UpdateDatePicker.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select Updated Date!");
            a.showAndWait();
            return;
        }

        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Data inputs are valid.");
        a.showAndWait();
    }
    }
