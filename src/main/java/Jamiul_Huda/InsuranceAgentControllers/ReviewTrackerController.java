package Jamiul_Huda.InsuranceAgentControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ReviewTrackerController {

    @FXML
    private Label notificationLabel;

    @FXML
    private Button searchButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button refreshButton;

    @FXML
    private TextField applicationIdTextField;

    @FXML
    private TextField selectedStatusTextField;

    @FXML
    private TableView<?> reviewTableView;

    @FXML
    private TableColumn<?, ?> applicationIdColumn;

    @FXML
    private TableColumn<?, ?> customerNameColumn;

    @FXML
    private TableColumn<?, ?> submissionDateColumn;

    @FXML
    private TableColumn<?, ?> currentStatusColumn;

    @FXML
    private TableColumn<?, ?> underwriterNotesColumn;

    @FXML
    public void initialize() {

        selectedStatusTextField.setEditable(false);
        notificationLabel.setText("Ready");
    }

    @FXML
    private void search(ActionEvent event) {

        if (applicationIdTextField.getText().isEmpty()) {
            notificationLabel.setText("Enter Application ID.");
            return;
        }

        selectedStatusTextField.setText("Approved for Issuance");
        notificationLabel.setText("Application Found.");
    }

    @FXML
    private void refresh(ActionEvent event) {

        notificationLabel.setText("Review Status Refreshed.");
    }

    @FXML
    private void clear(ActionEvent event) {

        applicationIdTextField.clear();
        selectedStatusTextField.clear();

        notificationLabel.setText("Form Cleared.");
    }

}