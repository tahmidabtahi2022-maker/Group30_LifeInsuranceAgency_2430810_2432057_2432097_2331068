package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class BranchManagerDashboardController
{

    @javafx.fxml.FXML
    private BorderPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
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

    @javafx.fxml.FXML
    public void customerSatisfactionDataBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BranchManagerGoal7.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void monitorSalesPerformanceBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BranchManagerGoal2.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void approveAgentRequestsBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BranchManagerGoal3.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void assignCustomersBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BranchManagerGoal4.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void viewAllAgentsBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BranchManagerGoal1.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void generateManagementReportsBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BranchManagerGoal6.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void setSalesTargetBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BranchManagerGoal8.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void viewBranchStatisticsBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("BranchManagerGoal5.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}