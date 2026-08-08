package Fuad_Bin_Omar.SystemAdministratorController;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SystemAnnouncementsController
{
    @javafx.fxml.FXML
    private TextField AnnouncementTitleTextfield;
    @javafx.fxml.FXML
    private TextArea AnnouncementMessageTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> PriorityLevelComboBox;
    @javafx.fxml.FXML
    private DatePicker StartDatepicker;
    @javafx.fxml.FXML
    private DatePicker EndDatepicker;
    @javafx.fxml.FXML
    private ComboBox<String> AnnouncementTypeComboBox;
    @javafx.fxml.FXML
    private CheckBox ActiveCheckBox;

    @javafx.fxml.FXML
    public void initialize() {

        PriorityLevelComboBox.getItems().addAll("High", "Medium", "Low");
        AnnouncementTypeComboBox.getItems().addAll("General", "Maintenance", "Emergency", "Policy Update");

    }

    @javafx.fxml.FXML
    public void PublishAnnouncementButton(ActionEvent actionEvent) {



        if (AnnouncementTitleTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Announcement Title is required!");
            a.showAndWait();
            return;
        }

        if (AnnouncementMessageTextArea.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Announcement Message is required!");
            a.showAndWait();
            return;
        }

        if (AnnouncementTypeComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select Announcement Type!");
            a.showAndWait();
            return;
        }

        if (PriorityLevelComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select Priority Level!");
            a.showAndWait();
            return;
        }

        if (StartDatepicker.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select Start Date!");
            a.showAndWait();
            return;
        }

        if (EndDatepicker.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select End Date!");
            a.showAndWait();
            return;
        }


        SystemAnnouncementsProcessing announcement =
                new SystemAnnouncementsProcessing(

                        AnnouncementTitleTextfield.getText(),
                        AnnouncementMessageTextArea.getText(),
                        PriorityLevelComboBox.getValue(),
                        AnnouncementTypeComboBox.getValue(),
                        StartDatepicker.getValue(),
                        EndDatepicker.getValue(),
                        ActiveCheckBox.isSelected()
                );


        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Announcement published successfully.");
        a.showAndWait();


    }
}