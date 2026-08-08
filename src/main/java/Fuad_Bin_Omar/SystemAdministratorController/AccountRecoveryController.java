package Fuad_Bin_Omar.SystemAdministratorController;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class AccountRecoveryController
{
    @javafx.fxml.FXML
    private TextField NewPasswordTextfield;
    @javafx.fxml.FXML
    private TextField RegisteredEmailAddressTextfield;
    @javafx.fxml.FXML
    private TextField ConfirmNewPasswordTextfield;
    @javafx.fxml.FXML
    private TextField VerificationCodeTextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackToLoginButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SendCodeButton(ActionEvent actionEvent) {

        if (RegisteredEmailAddressTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Registered Email Address is required!");
            a.showAndWait();
            return;
        }

        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Verification code sent successfully.");
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void ResetPasswordButton(ActionEvent actionEvent) {

        if (RegisteredEmailAddressTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Registered Email Address is required!");
            a.showAndWait();
            return;
        }

        if (VerificationCodeTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Verification Code is required!");
            a.showAndWait();
            return;
        }

        if (NewPasswordTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("New Password is required!");
            a.showAndWait();
            return;
        }

        if (ConfirmNewPasswordTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Confirm New Password is required!");
            a.showAndWait();
            return;
        }

        if (!NewPasswordTextfield.getText().equals(ConfirmNewPasswordTextfield.getText())) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Passwords do not match!");
            a.showAndWait();
            return;
        }


        // Create Instance
        AccountRecoveryProcessing account =
                new AccountRecoveryProcessing(

                        RegisteredEmailAddressTextfield.getText(),
                        VerificationCodeTextfield.getText(),
                        NewPasswordTextfield.getText(),
                        ConfirmNewPasswordTextfield.getText());


        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Password reset successfully.");
        a.showAndWait();
    }
}