package Jamiul_Huda.ClaimsOfficerControllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;



public class PolicyValidityVerificationController {


    @FXML
    private TextField claimIdField;


    @FXML
    private TextField policyNumberField;


    @FXML
    private DatePicker claimDatePicker;


    @FXML
    private Label resultLabel;



    @FXML
    public void verifyPolicy(){


        String claimId = claimIdField.getText();
        String policyNumber = policyNumberField.getText();
        LocalDate claimDate = claimDatePicker.getValue();


        if(claimId.isEmpty() ||
                policyNumber.isEmpty() ||
                claimDate == null){

            resultLabel.setText(
                    "Please fill all information"
            );

            return;
        }


        String policyStatus = "Active - In Force";
        boolean premiumClear = true;


        LocalDate startDate =
                LocalDate.of(2025,1,1);


        LocalDate endDate =
                LocalDate.of(2030,12,31);



        if(policyStatus.equals("Active - In Force")
                && premiumClear
                && !claimDate.isBefore(startDate)
                && !claimDate.isAfter(endDate)){


            resultLabel.setText(
                    "Verification Complete: Base Policy Valid for Claim Evaluation"
            );


        }else{


            resultLabel.setText(
                    "Policy Verification Failed"
            );

        }


    }




    @FXML
    public void backDashboard(ActionEvent event)
            throws IOException {


        Parent root =
                FXMLLoader.load(
                        getClass()
                                .getResource(
                                        "/FXML/ClaimsOfficerDashboard.fxml"
                                )
                );


        Stage stage =
                (Stage)((Node)event.getSource())
                        .getScene()
                        .getWindow();


        stage.setScene(
                new Scene(root)
        );


        stage.show();

    }


}