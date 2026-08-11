package Fuad_Bin_Omar.SystemAdministratorController;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class RegisterEmployeeController
{
    @javafx.fxml.FXML
    private TextField EmployeeNameTextfield;
    @javafx.fxml.FXML
    private TextField TemporaryPasswordTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> AssignedRoleCombobox;
    @javafx.fxml.FXML
    private TextField OfficialEmailTextfield;

    @javafx.fxml.FXML
    public void initialize() {

        AssignedRoleCombobox.getItems().addAll("Admin", "Customer Service Representative", "Agent");
    }

    @javafx.fxml.FXML
    public void RegisterEmployeeAccountButton(ActionEvent actionEvent) {

        if (EmployeeNameTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Employee Name is required!");
            a.showAndWait();
            return;
        }

        if (OfficialEmailTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Official Email is required!");
            a.showAndWait();
            return;
        }

        if (TemporaryPasswordTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Temporary Password is required!");
            a.showAndWait();
            return;
        }

        if (AssignedRoleCombobox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select an Assigned Role!");
            a.showAndWait();
            return;
        }


        RegisterEmployeeProcessing employee =
                new RegisterEmployeeProcessing(

                        EmployeeNameTextfield.getText(),
                        OfficialEmailTextfield.getText(),
                        TemporaryPasswordTextfield.getText(),
                        AssignedRoleCombobox.getValue()
                );


        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Employee account registered successfully.");
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void GeneratePasswordButton(ActionEvent actionEvent) {

        TemporaryPasswordTextfield.setText("Temp1234");

    }
}