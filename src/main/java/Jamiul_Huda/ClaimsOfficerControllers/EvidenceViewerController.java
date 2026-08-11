package Jamiul_Huda.ClaimsOfficerControllers;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;



public class EvidenceViewerController {


    @FXML
    private TextField claimIdField;


    @FXML
    private ListView<String> evidenceList;


    @FXML
    private TextArea notesArea;


    @FXML
    private Label statusLabel;



    private ObservableList<String> evidence =
            FXCollections.observableArrayList();



    @FXML
    public void loadEvidence(){


        if(claimIdField.getText().isEmpty()){

            statusLabel.setText(
                    "Enter Claim Token ID"
            );

            return;
        }


        evidence.clear();


        evidence.add("Hospital Bills.pdf");
        evidence.add("Medical Treatment Records.pdf");
        evidence.add("Certified Death Certificate.pdf");


        evidenceList.setItems(evidence);


        statusLabel.setText(
                "Evidence Loaded Successfully"
        );

    }



    @FXML
    public void saveNotes(){


        if(notesArea.getText().isEmpty()){

            statusLabel.setText(
                    "Enter evaluation notes"
            );

            return;
        }


        statusLabel.setText(
                "Verification Notes Saved Successfully"
        );

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