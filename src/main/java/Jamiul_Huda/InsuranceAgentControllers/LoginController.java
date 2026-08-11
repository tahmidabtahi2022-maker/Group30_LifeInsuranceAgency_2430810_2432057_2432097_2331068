package Jamiul_Huda.InsuranceAgentControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label statusLabel;

    @FXML
    private Button loginButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button exitButton;

    @FXML
    private void login(ActionEvent event) throws IOException {

        String username = usernameTextField.getText().trim();
        String password = passwordField.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {

            statusLabel.setText("Please enter username and password.");
            return;
        }

        // Demo Login
        if (username.equals("agent") && password.equals("1234")) {

            Parent root = FXMLLoader.load(
                    getClass().getResource(
                            "/Jamiul_Huda/InsuranceAgent/InsuranceAgentDashboardView.fxml"));

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.setTitle("Insurance Agent Dashboard");
            stage.show();

        } else {

            statusLabel.setText("Invalid Username or Password.");

        }
    }

    @FXML
    private void clearFields(ActionEvent event) {

        usernameTextField.clear();
        passwordField.clear();

        statusLabel.setText("Fields Cleared.");

    }

    @FXML
    private void exit(ActionEvent event) {

        System.exit(0);

    }

}