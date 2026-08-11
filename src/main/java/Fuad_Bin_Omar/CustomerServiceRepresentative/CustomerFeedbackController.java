package Fuad_Bin_Omar.CustomerServiceRepresentative;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class CustomerFeedbackController
{
    @javafx.fxml.FXML
    private TableColumn<CustomerFeedbackProcessing, String> StatusColumn;
    @javafx.fxml.FXML
    private ComboBox<String> PriorityLevelComboBox;
    @javafx.fxml.FXML
    private TableView<CustomerFeedbackProcessing> Tableview;
    @javafx.fxml.FXML
    private TableColumn<CustomerFeedbackProcessing, String> IssueCategoryColumn;
    @javafx.fxml.FXML
    private TextField CustomerNameTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> IssueCategoryComboBox;
    @javafx.fxml.FXML
    private DatePicker DateLoggedPicker;
    @javafx.fxml.FXML
    private TextField PolicyIDTextfield;
    @javafx.fxml.FXML
    private TableColumn<CustomerFeedbackProcessing, String> TicketIDColumn;
    @javafx.fxml.FXML
    private TextArea ComplaintDescriptionTextArea;
    @javafx.fxml.FXML
    private TextField TicketIDTextfield;
    @javafx.fxml.FXML
    private TextField StatusTextfield;
    @javafx.fxml.FXML
    private TableColumn<CustomerFeedbackProcessing, String> PriorityLevelColumn;
    @javafx.fxml.FXML
    private TableColumn<CustomerFeedbackProcessing, LocalDate> DateLoggedColumn;

    private ArrayList<CustomerFeedbackProcessing> customerFeedbackList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        PriorityLevelComboBox.getItems().addAll("Low", "Medium", "High");
        IssueCategoryComboBox.getItems().addAll("Service", "Payment", "Policy", "Other");
        TicketIDColumn.setCellValueFactory(new PropertyValueFactory<>("TicketID"));
        IssueCategoryColumn.setCellValueFactory(new PropertyValueFactory<>("IssueCategory"));
        PriorityLevelColumn.setCellValueFactory(new PropertyValueFactory<>("PriorityLevel"));
        StatusColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));
        DateLoggedColumn.setCellValueFactory(new PropertyValueFactory<>("DateLogged"));

    }

    @javafx.fxml.FXML
    public void LogComplaintButton(ActionEvent actionEvent) {

        // Validation
        if (PolicyIDTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Policy ID is required!");
            a.showAndWait();
            return;
        }

        if (CustomerNameTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Customer Name is required!");
            a.showAndWait();
            return;
        }

        if (PriorityLevelComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select a Priority Level!");
            a.showAndWait();
            return;
        }

        if (IssueCategoryComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select an Issue Category!");
            a.showAndWait();
            return;
        }

        if (DateLoggedPicker.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select a Date!");
            a.showAndWait();
            return;
        }

        if (ComplaintDescriptionTextArea.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Complaint Description is required!");
            a.showAndWait();
            return;
        }

        if (TicketIDTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Ticket ID is required!");
            a.showAndWait();
            return;
        }

        if (StatusTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Status is required!");
            a.showAndWait();
            return;
        }


        // Create Instance
        CustomerFeedbackProcessing feedback =
                new CustomerFeedbackProcessing(

                        PolicyIDTextfield.getText(),
                        CustomerNameTextfield.getText(),
                        PriorityLevelComboBox.getValue(),
                        IssueCategoryComboBox.getValue(),
                        ComplaintDescriptionTextArea.getText(),
                        TicketIDTextfield.getText(),
                        StatusTextfield.getText(),
                        DateLoggedPicker.getValue()
                );


        // Add to TableView
        customerFeedbackList.add(feedback);
        Tableview.getItems().add(feedback);


        // Success Message
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Customer complaint logged successfully.");
        a.showAndWait();


    }

    @javafx.fxml.FXML
    public void RefreshButton(ActionEvent actionEvent) {
        Tableview.getItems().clear();
    }

    @javafx.fxml.FXML
    public void SearchButton(ActionEvent actionEvent) {
        String policyID = PolicyIDTextfield.getText().trim();

        for (CustomerFeedbackProcessing c : customerFeedbackList) {

            if (c.getPolicyID().equalsIgnoreCase(policyID)) {

                Tableview.getItems().clear();
                Tableview.getItems().add(c);

                return;
            }
        }
    }

    @javafx.fxml.FXML
    public void ClearButton(ActionEvent actionEvent) {

        PolicyIDTextfield.clear();
        CustomerNameTextfield.clear();
        TicketIDTextfield.clear();
        StatusTextfield.clear();
        ComplaintDescriptionTextArea.clear();

        PriorityLevelComboBox.getSelectionModel().clearSelection();
        IssueCategoryComboBox.getSelectionModel().clearSelection();

        DateLoggedPicker.setValue(null);

    }
}