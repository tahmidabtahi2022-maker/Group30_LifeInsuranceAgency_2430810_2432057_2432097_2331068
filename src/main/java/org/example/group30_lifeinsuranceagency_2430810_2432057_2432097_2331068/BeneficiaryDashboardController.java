package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class BeneficiaryDashboardController
{
    @javafx.fxml.FXML
    private BorderPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void receiveNotificationsBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BranchManagerGoal6.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void registerAccountBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BranchManagerGoal1.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void uploadDocumentsBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BranchManagerGoal4.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void submitClaimRequestBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BeneficiaryGoal3.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void viewClaimHistoryBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BeneficiaryGoal7.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void trackClaimProgressBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BeneficiaryGoal5.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void updatePersonalDetailsBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BeneficiaryGoal8.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void viewBeneficiaryStatusBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BeneficiaryGoal2.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadFxmlParentToBorderPaneCenter(String fxmlName){
        try {
            FXMLLoader nextFxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlName));
            mainPane.setCenter(nextFxmlLoader.load());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}