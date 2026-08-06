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



public class PolicyApplicationController {



    // ================= HEADER =================


    @FXML
    private Label dashboardTitleLabel;


    @FXML
    private Label agentNameLabel;



    // ================= CUSTOMER SEARCH =================


    @FXML
    private TextField clientIdTextField;


    @FXML
    private Button searchButton;


    @FXML
    private TextField customerStatusTextField;




    // ================= POLICY DETAILS =================


    @FXML
    private ComboBox<String> insurancePackageComboBox;


    @FXML
    private TextField sumAssuredTextField;


    @FXML
    private TextField nomineeNameTextField;



    @FXML
    private ComboBox<String> healthCategoryComboBox;



    @FXML
    private TextField riskBaselineTextField;



    @FXML
    private TextField applicationStatusTextField;




    // ================= BUTTONS =================


    @FXML
    private Button calculateRiskButton;


    @FXML
    private Button submitProposalButton;


    @FXML
    private Button clearButton;



    @FXML
    private Label notificationLabel;





    // ================= INITIALIZE =================


    @FXML
    public void initialize(){


        agentNameLabel.setText(
                "Insurance Agent"
        );



        insurancePackageComboBox
                .getItems()
                .addAll(

                        "Life Insurance",
                        "Health Insurance",
                        "Vehicle Insurance",
                        "Family Protection Plan"

                );



        healthCategoryComboBox
                .getItems()
                .addAll(

                        "Low Risk",
                        "Medium Risk",
                        "High Risk"

                );



        applicationStatusTextField
                .setText(
                        "Draft"
                );



        notificationLabel.setText(
                "Ready to Submit Proposal"
        );


    }





    // ================= SEARCH CUSTOMER =================


    @FXML
    private void searchCustomer(ActionEvent event){


        String clientId =
                clientIdTextField.getText();



        if(clientId.isEmpty()){


            notificationLabel.setText(
                    "Enter Client ID"
            );


            return;

        }




        /*
            Temporary customer search.

            Later replace with:
            CustomerService.search(clientId)
        */



        if(clientId.equals("C001")){


            customerStatusTextField.setText(
                    "Active Customer"
            );


            notificationLabel.setText(
                    "Customer Found"
            );


        }
        else{


            customerStatusTextField.setText(
                    "Not Found"
            );


            notificationLabel.setText(
                    "Customer does not exist"
            );


        }


    }





    // ================= RISK CALCULATION =================


    @FXML
    private void calculateRisk(ActionEvent event){



        String health =
                healthCategoryComboBox.getValue();



        if(health == null){


            notificationLabel.setText(
                    "Select Health Category"
            );


            return;

        }



        String risk;



        switch(health){


            case "Low Risk":

                risk = "10%";

                break;



            case "Medium Risk":

                risk = "40%";

                break;



            case "High Risk":

                risk = "70%";

                break;



            default:

                risk = "Unknown";


        }



        riskBaselineTextField.setText(
                risk
        );



        notificationLabel.setText(
                "Risk Calculated Successfully"
        );


    }





    // ================= SUBMIT PROPOSAL =================


    @FXML
    private void submitProposal(ActionEvent event){



        if(clientIdTextField.getText().isEmpty()
                || insurancePackageComboBox.getValue()==null
                || sumAssuredTextField.getText().isEmpty()
                || nomineeNameTextField.getText().isEmpty()){


            notificationLabel.setText(
                    "Complete all information first"
            );


            return;

        }




        /*
            Later:
            Save Policy Application
            into database
        */



        applicationStatusTextField.setText(
                "Submitted"
        );



        notificationLabel.setText(
                "Proposal Submitted Successfully"
        );



    }





    // ================= CLEAR FORM =================


    @FXML
    private void clearForm(ActionEvent event){



        clientIdTextField.clear();


        customerStatusTextField.clear();


        insurancePackageComboBox
                .setValue(null);


        sumAssuredTextField.clear();


        nomineeNameTextField.clear();


        healthCategoryComboBox
                .setValue(null);


        riskBaselineTextField.clear();


        applicationStatusTextField
                .setText("Draft");



        notificationLabel.setText(
                "Form Cleared"
        );


    }





    // ================= DASHBOARD =================


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






    // ================= SCENE SWITCHING =================


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


            notificationLabel.setText(
                    "Scene loading failed"
            );


        }


    }



}