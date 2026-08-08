package Fuad_Bin_Omar.SystemAdministratorController;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;

public class DatabaseBackupController
{
    @javafx.fxml.FXML
    private TitledPane BackupInformationTitledPane;
    @javafx.fxml.FXML
    private TextField BackupFileNameTextfield;
    @javafx.fxml.FXML
    private TextArea TextArea;
    @javafx.fxml.FXML
    private ComboBox CompressionComboBox;
    @javafx.fxml.FXML
    private TextField BackupLocationTextfield;
    @javafx.fxml.FXML
    private ComboBox DatatoBackupComboBox;
    @javafx.fxml.FXML
    private AnchorPane AnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BrowseButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CreateBackupButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackupHistoryButton(ActionEvent actionEvent) {
    }
}