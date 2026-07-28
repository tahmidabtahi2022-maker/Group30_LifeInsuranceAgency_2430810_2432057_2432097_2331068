package Jamiul_Huda.InsuranceAgentControllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ReviewTrackerController {
    @javafx.fxml.FXML
    private Label notificationLabel;
    @javafx.fxml.FXML
    private Button searchButton;
    @javafx.fxml.FXML
    private Button clearButton;
    @javafx.fxml.FXML
    private TextField applicationIdTextField;
    @javafx.fxml.FXML
    private Button refreshButton;
    @javafx.fxml.FXML
    private TableColumn customerNameColumn;
    @javafx.fxml.FXML
    private TableColumn underwriterNotesColumn;
    @javafx.fxml.FXML
    private TextField selectedStatusTextField;
    @javafx.fxml.FXML
    private TableView reviewTableView;
    @javafx.fxml.FXML
    private TableColumn applicationIdColumn;
    @javafx.fxml.FXML
    private TableColumn currentStatusColumn;
    @javafx.fxml.FXML
    private TableColumn submissionDateColumn;
}
