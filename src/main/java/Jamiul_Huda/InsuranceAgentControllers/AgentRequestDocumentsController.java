package Jamiul_Huda.InsuranceAgentControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

public class AgentRequestDocumentsController {

    @FXML
    private TextField txtApplicationId;

    @FXML
    private Label lblMissingDocuments;

    @FXML
    private Button btnSendRequest;

    @FXML
    private Label lblApplicationId;

    @FXML
    private Label lblReason;

    @FXML
    private TextArea txtReason;

    @FXML
    private Label lblTitle;

    @FXML
    private HBox applicationIdBox;

    @FXML
    private Label lblStatus;

    @FXML
    private CheckBox chkSalarySlip;

    @FXML
    private CheckBox chkPhysicianLetter;

    @FXML
    public void initialize() {

        lblStatus.setText("Ready");
    }

    @FXML
    private void sendRequest(ActionEvent event) {

        if (txtApplicationId.getText().isEmpty()) {
            lblStatus.setText("Enter Application ID.");
            return;
        }

        if (!chkSalarySlip.isSelected() && !chkPhysicianLetter.isSelected()) {
            lblStatus.setText("Select at least one missing document.");
            return;
        }

        if (txtReason.getText().trim().length() < 10) {
            lblStatus.setText("Reason must contain at least 10 characters.");
            return;
        }

        lblStatus.setText("Document Requirement Alert Dispatched.");
    }
}