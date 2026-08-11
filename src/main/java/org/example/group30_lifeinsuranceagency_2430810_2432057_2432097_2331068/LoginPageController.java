package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

import Kazi_Tahmid_Abtahi.CustomerControllers.customerDashboardController;
import Kazi_Tahmid_Abtahi.Model_Classes.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LoginPageController
{
    @javafx.fxml.FXML
    private ComboBox selectUserTypeCB;
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
    public void registerNewAccountOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {
        if (selectUserTypeCB.getValue() == null || enterEmailAddressTF.getText().isEmpty() || enterPasswordTF.getText().isEmpty()) {
            feedbackLabel.setText("Please select user type and enter email & password.");
            return;
        }

        if (selectUserTypeCB.getValue().equals("Customer")) {
            ArrayList<Customer> customerList = loadCustomersFromBinaryFile();

            Customer matchedCustomer = null;
            for (Customer c : customerList) {
                if (c.getEmailAddress().equals(enterEmailAddressTF.getText())) {
                    matchedCustomer = c;
                }
            }

            if (matchedCustomer == null) {
                feedbackLabel.setText("No account found. Please register first.");
                return;
            }

            if (!matchedCustomer.getPassword().equals(enterPasswordTF.getText())) {
                feedbackLabel.setText("Incorrect password.");
                return;
            }

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

    private ArrayList<Customer> loadCustomersFromBinaryFile(){
        ArrayList<Customer> customersList = new ArrayList<>();
        try{
            File f = new File("CustomerInfo.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                customersList.add((Customer) ois.readObject());
            }
        } catch (Exception e) {
            //
        }
        return customersList;
    }
}