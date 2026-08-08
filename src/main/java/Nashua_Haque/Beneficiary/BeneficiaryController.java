package Nashua_Haque.Beneficiary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class BeneficiaryController {

    @FXML
    private BorderPane mainPane;

    @FXML
    public void initialize() {

    }

    private void loadPage(String fxmlFile) {

        try {

            Parent root = FXMLLoader.load(
                    getClass().getResource(fxmlFile)
            );

            mainPane.setCenter(root);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void registerAccountBOA(ActionEvent event) {
        loadPage("BeneficiaryGoal1.fxml");
    }

    @FXML
    public void viewBeneficiaryStatusBOA(ActionEvent event) {
        loadPage("BeneficiaryGoal2.fxml");
    }

    @FXML
    public void submitClaimRequestBOA(ActionEvent event) {
        loadPage("BeneficiaryGoal3.fxml");
    }

    @FXML
    public void uploadDocumentsBOA(ActionEvent event) {
        loadPage("BeneficiaryGoal4.fxml");
    }

    @FXML
    public void trackClaimProgressBOA(ActionEvent event) {
        loadPage("BeneficiaryGoal5.fxml");
    }

    @FXML
    public void receiveNotificationsBOA(ActionEvent event) {
        loadPage("BeneficiaryGoal6.fxml");
    }

    @FXML
    public void viewClaimHistoryBOA(ActionEvent event) {
        loadPage("BeneficiaryGoal7.fxml");
    }

    @FXML
    public void updatePersonalDetailsBOA(ActionEvent event) {
        loadPage("BeneficiaryGoal8.fxml");
    }

}