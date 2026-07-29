package Jamiul_Huda.InsuranceAgentControllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class AgentRequestDocumentsController {
    @javafx.fxml.FXML
    private TextField txtApplicationId;
    @javafx.fxml.FXML
    private Label lblMissingDocuments;
    @javafx.fxml.FXML
    private Button btnSendRequest;
    @javafx.fxml.FXML
    private Label lblApplicationId;
    @javafx.fxml.FXML
    private Label lblReason;
    @javafx.fxml.FXML
    private TextArea txtReason;
    @javafx.fxml.FXML
    private Label lblTitle;
    @javafx.fxml.FXML
    private HBox applicationIdBox;
    @javafx.fxml.FXML
    private Label lblStatus;
    @javafx.fxml.FXML
    private CheckBox chkSalarySlip;
    @javafx.fxml.FXML
    private CheckBox chkPhysicianLetter;
}
