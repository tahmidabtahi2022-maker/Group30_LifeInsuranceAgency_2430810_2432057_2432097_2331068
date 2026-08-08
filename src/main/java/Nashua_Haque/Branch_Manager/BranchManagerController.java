package Nashua_Haque.Branch_Manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class BranchManagerController {

    @FXML
    private BorderPane mainPane;

    private void loadPage(String fxmlFile) {

        try {

            AnchorPane pane = FXMLLoader.load(
                    getClass().getResource(fxmlFile));

            mainPane.setCenter(pane);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void viewAllAgentsBOA(ActionEvent event) {

        loadPage("BranchManagerGoal1.fxml");

    }

    @FXML
    void monitorSalesPerformanceBOA(ActionEvent event) {

        loadPage("BranchManagerGoal2.fxml");

    }

    @FXML
    void approveAgentRequestsBOA(ActionEvent event) {

        loadPage("BranchManagerGoal3.fxml");

    }

    @FXML
    void assignCustomersBOA(ActionEvent event) {

        loadPage("BranchManagerGoal4.fxml");

    }

    @FXML
    void viewBranchStatisticsBOA(ActionEvent event) {

        loadPage("BranchManagerGoal5.fxml");

    }

    @FXML
    void generateManagementReportsBOA(ActionEvent event) {

        loadPage("BranchManagerGoal6.fxml");

    }

    @FXML
    void customerSatisfactionDataBOA(ActionEvent event) {

        loadPage("BranchManagerGoal7.fxml");

    }

    @FXML
    void setSalesTargetBOA(ActionEvent event) {

        loadPage("BranchManagerGoal8.fxml");

    }

}