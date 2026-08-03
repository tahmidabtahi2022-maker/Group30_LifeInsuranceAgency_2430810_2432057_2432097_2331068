package Kazi_Tahmid_Abtahi.CustomerControllers;

import Kazi_Tahmid_Abtahi.Model_Classes.Policy;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;

public class registerCustomerAccountController
{
    @javafx.fxml.FXML
    private TextField fullNameTF;
    @javafx.fxml.FXML
    private TextField phoneNumberTF;
    @javafx.fxml.FXML
    private TextField passwordTF;
    @javafx.fxml.FXML
    private DatePicker dateOfBirthDatePicker;
    @javafx.fxml.FXML
    private TextField confirmPasswordTF;
    @javafx.fxml.FXML
    private TextField emailAddressTF;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void registerAccountButtonOnAction(ActionEvent actionEvent) {
        //validate: all fields are filled, email format is valid, phone number is 11 digits
        // , passwords match, age is 18 or above

        if(fullNameTF.getText().isEmpty() || emailAddressTF.getText().isEmpty() || phoneNumberTF.getText().isEmpty() || passwordTF.getText().isEmpty() || confirmPasswordTF.getText().isEmpty() || dateOfBirthDatePicker.getValue().isAfter(LocalDate.now())){
            statusLabel.setText("Enter your registration information properly,some input data are missing");
            return;
        }
        LocalDate today = LocalDate.now();
        LocalDate validDate = LocalDate.of(today.getYear()-18,today.getMonth(),today.getDayOfMonth());
        if(!emailAddressTF.getText().contains("@") || !(phoneNumberTF.getText().length() == 11) || confirmPasswordTF.getText().equals(passwordTF.getText()) || dateOfBirthDatePicker.getValue().isAfter(validDate) || dateOfBirthDatePicker.getValue().equals(validDate)){
            statusLabel.setText("Enter your registration information properly, your credentials are not accurate");
            return;
        }

        for(Policy po : policyBinFile){
            if(emailAddressTF.getText().equals(po.getCustomerEmailAddress())){
                statusLabel.setText("Email Already Registered");
                return;
            }
        }



    }

    @javafx.fxml.FXML
    public void returnToLoginPageButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginPageView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Metlife Agency");
        nextStage.setScene(scene);
        nextStage.show();
    }
}