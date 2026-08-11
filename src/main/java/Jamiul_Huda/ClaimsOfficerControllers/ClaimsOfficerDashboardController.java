package Jamiul_Huda.ClaimsOfficerControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ClaimsOfficerDashboardController {

    @FXML
    private Label dashboardTitleLabel;

    @FXML
    private Label officerNameLabel;

    @FXML
    private Label statusLabel;

    private void switchScene(ActionEvent event, String fxmlFile) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/FXML/" + fxmlFile));

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void openGoal1(ActionEvent event) throws IOException {
        switchScene(event, "PendingClaimsQueue.fxml");
    }

    @FXML
    public void openGoal2(ActionEvent event) throws IOException {
        switchScene(event, "PolicyValidityVerification.fxml");
    }

    @FXML
    public void openGoal3(ActionEvent event) throws IOException {
        switchScene(event, "EvidenceViewer.fxml");
    }

    @FXML
    public void openGoal4(ActionEvent event) throws IOException {
        switchScene(event, "EvidenceRequest.fxml");
    }

    @FXML
    public void openGoal5(ActionEvent event) throws IOException {
        switchScene(event, "ClaimPayoutCalculator.fxml");
    }

    @FXML
    public void openGoal6(ActionEvent event) throws IOException {
        switchScene(event, "ClaimApproval.fxml");
    }

    @FXML
    public void openGoal7(ActionEvent event) throws IOException {
        switchScene(event, "ClaimRejection.fxml");
    }

    @FXML
    public void openGoal8(ActionEvent event) throws IOException {
        switchScene(event, "ClaimsReport.fxml");
    }

    @FXML
    public void logout(ActionEvent event) throws IOException {
        switchScene(event, "Login.fxml");
    }

}