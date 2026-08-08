package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

import Kazi_Tahmid_Abtahi.CustomerControllers.customerDashboardController;
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
        selectUserTypeCB.getItems().addAll("Customer","Accounts Officer","Insurance Agent","Claims Officer","Branch manager","Beneficiary","System Administrator","Customer Service Representative");
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
        if (selectUserTypeCB.getValue() == null || enterEmailAddressTF.getText().isEmpty() || enterPasswordTF.getText().isEmpty()) {
            feedbackLabel.setText("Please select user type and enter email & password.");
            return;
        }

        if (selectUserTypeCB.getValue().equals("Customer")) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Customer/customerDashboardView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Metlife Agency");
            nextStage.setScene(scene);
            customerDashboardController nextController = fxmlLoader.getController();
            nextController.receiveUserEmailFromLoginController(enterEmailAddressTF.getText());
            nextStage.show();

        }
        if (selectUserTypeCB.getValue().equals("Accounts Officer")) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Accounts_Officer/accountsOfficerDashboardView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Metlife Agency");
            nextStage.setScene(scene);
            nextStage.show();
        }

    }
}