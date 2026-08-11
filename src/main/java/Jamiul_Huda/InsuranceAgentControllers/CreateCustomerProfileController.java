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


public class CreateCustomerProfileController {


    // ================= FXML COMPONENTS =================


    @FXML
    private Label dashboardTitleLabel;

    @FXML
    private Label agentNameLabel;

    @FXML
    private Label statusLabel;


    @FXML
    private TextField fullNameTextField;

    @FXML
    private TextField nidTextField;

    @FXML
    private TextField mobileNumberTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private DatePicker dateOfBirthPicker;



    // ================= INITIALIZE =================


    @FXML
    public void initialize(){

        agentNameLabel.setText("Insurance Agent");

        statusLabel.setText(
                "Ready to Create Customer"
        );

    }



    // ================= CREATE PROFILE =================


    @FXML
    private void createProfile(ActionEvent event){


        String name =
                fullNameTextField.getText();


        String nid =
                nidTextField.getText();


        String mobile =
                mobileNumberTextField.getText();


        String email =
                emailTextField.getText();



        if(name.isEmpty()
                || nid.isEmpty()
                || mobile.isEmpty()
                || email.isEmpty()
                || dateOfBirthPicker.getValue()==null){


            statusLabel.setText(
                    "Please fill all customer information"
            );


            return;

        }



        /*
          Later you will connect your Customer Model
          and Database here.
        */


        statusLabel.setText(
                "Customer Profile Created Successfully"
        );


    }





    // ================= CLEAR FORM =================


    @FXML
    private void clearForm(ActionEvent event){


        fullNameTextField.clear();

        nidTextField.clear();

        mobileNumberTextField.clear();

        emailTextField.clear();

        dateOfBirthPicker.setValue(null);



        statusLabel.setText(
                "Form Cleared"
        );


    }




    // ================= OPEN DASHBOARD =================


    @FXML
    private void openDashboard(ActionEvent event){


        switchScene(
                event,
                "/Jamiul_Huda/InsuranceAgentViews/InsuranceAgentDashboard.fxml"
        );


    }




    // ================= BACK =================


    @FXML
    private void back(ActionEvent event){


        switchScene(
                event,
                "/Jamiul_Huda/InsuranceAgentViews/InsuranceAgentDashboard.fxml"
        );


    }




    // ================= LOGOUT =================


    @FXML
    private void logout(ActionEvent event){


        switchScene(
                event,
                "/Jamiul_Huda/InsuranceAgentViews/Login.fxml"
        );


    }





    // ================= SCENE SWITCH METHOD =================


    private void switchScene(
            ActionEvent event,
            String fxmlFile){


        try{


            Parent root =
                    FXMLLoader.load(
                            getClass()
                                    .getResource(fxmlFile)
                    );


            Stage stage =
                    (Stage)((Node)event.getSource())
                            .getScene()
                            .getWindow();



            Scene scene =
                    new Scene(root);



            stage.setScene(scene);

            stage.show();



        }
        catch(IOException e){


            e.printStackTrace();


            statusLabel.setText(
                    "Scene loading error"
            );


        }


    }



}