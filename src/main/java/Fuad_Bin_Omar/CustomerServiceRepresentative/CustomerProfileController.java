package Fuad_Bin_Omar.CustomerServiceRepresentative;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class CustomerProfileController
{
    @javafx.fxml.FXML
    private TextField EmailAddressTextfield;
    @javafx.fxml.FXML
    private TableColumn<CustomerProfileProcessing, String> PolicyNumberColumn;
    @javafx.fxml.FXML
    private TextField PolicyOrCustomerIDTextfield;
    @javafx.fxml.FXML
    private TextField PolicyNumberTextfield;
    @javafx.fxml.FXML
    private TableColumn<CustomerProfileProcessing, String> EmailAddressColumn;
    @javafx.fxml.FXML
    private TableColumn<CustomerProfileProcessing, String> ContactNumberColumn;
    @javafx.fxml.FXML
    private TextField CustomerNameTextfield;
    @javafx.fxml.FXML
    private TextField ContactNumberTextfield;
    @javafx.fxml.FXML
    private TextField CustomerIDTextfield;
    @javafx.fxml.FXML
    private TextField ActivePlanTextfield;
    @javafx.fxml.FXML
    private TableColumn<CustomerProfileProcessing, String> CustomerNameColumn;
    @javafx.fxml.FXML
    private TableColumn<CustomerProfileProcessing, String> ActivePlanColumn;
    @javafx.fxml.FXML
    private TableColumn<CustomerProfileProcessing, String> PolicyStatusColumn;
    @javafx.fxml.FXML
    private TextField PolicyStatusTextfield;
    @javafx.fxml.FXML
    private TableView<CustomerProfileProcessing> TableView;
    @javafx.fxml.FXML
    private TableColumn<CustomerProfileProcessing, String> CustomerIDColumn;

    private ArrayList<CustomerProfileProcessing> customerProfileList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        CustomerNameColumn.setCellValueFactory(new PropertyValueFactory<>("CustomerName"));
        CustomerIDColumn.setCellValueFactory(new PropertyValueFactory<>("CustomerID"));
        EmailAddressColumn.setCellValueFactory(new PropertyValueFactory<>("EmailAddress"));
        PolicyNumberColumn.setCellValueFactory(new PropertyValueFactory<>("PolicyNumber"));
        ActivePlanColumn.setCellValueFactory(new PropertyValueFactory<>("ActivePlan"));
        PolicyStatusColumn.setCellValueFactory(new PropertyValueFactory<>("PolicyStatus"));
        ContactNumberColumn.setCellValueFactory(new PropertyValueFactory<>("ContactNumber"));
    }

    @javafx.fxml.FXML
    public void RefreshButton(ActionEvent actionEvent) {

        TableView.getItems().clear();
    }

    @javafx.fxml.FXML
    public void SearchButton(ActionEvent actionEvent) {


        String policyID = PolicyOrCustomerIDTextfield.getText().trim();

        for (CustomerProfileProcessing c : customerProfileList) {

            if (c.getPolicyID().equalsIgnoreCase(policyID)) {

                TableView.getItems().clear();
                TableView.getItems().add(c);

                return;
            }
        }

        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText("Policy ID not found!");
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void ClearButton(ActionEvent actionEvent) {

            PolicyOrCustomerIDTextfield.clear();
            CustomerNameTextfield.clear();
            CustomerIDTextfield.clear();
            ContactNumberTextfield.clear();
            EmailAddressTextfield.clear();
            PolicyNumberTextfield.clear();
            ActivePlanTextfield.clear();
            PolicyStatusTextfield.clear();
    }

    @javafx.fxml.FXML
    public void ProfileAddButton(ActionEvent actionEvent) {

        // Validation
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

        if (PolicyNumberTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Policy Number is required!");
            a.showAndWait();
            return;
        }

        if (ActivePlanTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Active Plan is required!");
            a.showAndWait();
            return;
        }

        if (PolicyStatusTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Policy Status is required!");
            a.showAndWait();
            return;
        }

        if (PolicyOrCustomerIDTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Policy ID is required!");
            a.showAndWait();
            return;
        }


        // Create Instance
        CustomerProfileProcessing customer =
                new CustomerProfileProcessing(

                        CustomerNameTextfield.getText(),
                        CustomerIDTextfield.getText(),
                        ContactNumberTextfield.getText(),
                        EmailAddressTextfield.getText(),
                        PolicyNumberTextfield.getText(),
                        ActivePlanTextfield.getText(),
                        PolicyStatusTextfield.getText(),
                        PolicyOrCustomerIDTextfield.getText()
                );


        // Add to List
        customerProfileList.add(customer);

        // Add to TableView
        TableView.getItems().add(customer);


        // Success Message
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Customer profile added successfully.");
        a.showAndWait();
    }
}