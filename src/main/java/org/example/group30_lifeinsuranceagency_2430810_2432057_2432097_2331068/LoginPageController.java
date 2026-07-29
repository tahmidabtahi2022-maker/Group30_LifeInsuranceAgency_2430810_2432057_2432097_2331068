package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController
{
    @javafx.fxml.FXML
    private ComboBox<String> selectUserTypeCB;
    @javafx.fxml.FXML
    private PasswordField enterPasswordTF;
    @javafx.fxml.FXML
    private Label feedbackLabel;
    @javafx.fxml.FXML
    private TextField enterEmailAddressTF;

    @javafx.fxml.FXML
    public void initialize() {
        selectUserTypeCB.getItems().addAll("Customer","Accounts Officer"," Insurance Agent","Claims Officer","Branch manager","Beneficiary"," System Administrator","Customer Service Representative");
    }

    @javafx.fxml.FXML
    public void registerNewAccountOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Customer/registerCustomerAccountView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Metlife Agency");
        nextStage.setScene(scene);
        nextStage.show();
    }


    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {
        String email = enterEmailAddressTF.getText();
        String password = enterPasswordTF.getText();
        String selectedUser = selectUserTypeCB.getValue();

        if (selectedUser == null || email.isEmpty() || password.isEmpty()) {
            feedbackLabel.setText("Please select user type and enter email & password.");
            return;
        }

        String scenePath = "";
        if (selectedUser.equals("Customer")) {
            scenePath = "/Kazi_Tahmid_Abtahi/Customer/customerDashboardView.fxml";
        } else if (selectedUser.equals("Accounts Officer")) {
            scenePath = "/Kazi_Tahmid_Abtahi/Accounts_Officer/accountsOfficerDashboardView.fxml";
        } else {
            return;
        }

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(scenePath));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Metlife Agency");
        nextStage.setScene(scene);
        nextStage.show();
    }
}