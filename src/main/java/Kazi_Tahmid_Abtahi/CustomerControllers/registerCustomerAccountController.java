package Kazi_Tahmid_Abtahi.CustomerControllers;

import Kazi_Tahmid_Abtahi.Model_Classes.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068.AppendableObjectOutputStream;
import org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068.HelloApplication;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

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

    ArrayList<Customer> customerList;

    @javafx.fxml.FXML
    public void initialize() {
        customerList = new ArrayList<>();
        loadCustomersFromBinaryFile();


    }

    @javafx.fxml.FXML
    public void registerAccountButtonOnAction(ActionEvent actionEvent) {

        if(fullNameTF.getText().isEmpty() || emailAddressTF.getText().isEmpty() || phoneNumberTF.getText().isEmpty() || passwordTF.getText().isEmpty() || confirmPasswordTF.getText().isEmpty() || dateOfBirthDatePicker.getValue() == null){
            statusLabel.setText("Enter your registration information properly,some input data are missing");
            return;
        }
        if(!emailAddressTF.getText().contains("@") || !(phoneNumberTF.getText().length() == 11) || !confirmPasswordTF.getText().equals(passwordTF.getText())  || dateOfBirthDatePicker.getValue().isAfter(LocalDate.now())){
            statusLabel.setText("Enter your registration information properly, your given information contains mistakes");
            return;
        }

        for(Customer cus: customerList){
            if(emailAddressTF.getText().equals(cus.getEmailAddress())){
                statusLabel.setText("Email already registered. Please use a different email");
                return;
            }
        }

        String firstFourDigits = String.format("%04d", LocalDate.now().getYear());
        Random r = new Random();
        String lastSixDigits = String.format("%06d", r.nextInt(1000000));
        String generatedCustomerId = firstFourDigits + lastSixDigits;

        Customer cu = new Customer(
                generatedCustomerId,
                fullNameTF.getText(),
                emailAddressTF.getText(),
                passwordTF.getText(),
                dateOfBirthDatePicker.getValue(),
                phoneNumberTF.getText(),
                0.00f
        );

        customerList.add(cu);
        saveCustomerToBinFile(cu);
        statusLabel.setText("New customer account registration successful");

        fullNameTF.clear();
        emailAddressTF.clear();
        phoneNumberTF.clear();
        passwordTF.clear();
        confirmPasswordTF.clear();
        dateOfBirthDatePicker.setValue(null);
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

    private void saveCustomerToBinFile(Customer customer){
        try{
            File f = new File("CustomerInfo.Bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(customer);
            oos.close();
        }catch (Exception e){
            //
        }

    }

    public void loadCustomersFromBinaryFile(){
        try{
            File f = new File("CustomerInfo.Bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true){
                customerList.add((Customer) ois.readObject());

            }
        } catch (Exception e) {
            //
        }
    }

}