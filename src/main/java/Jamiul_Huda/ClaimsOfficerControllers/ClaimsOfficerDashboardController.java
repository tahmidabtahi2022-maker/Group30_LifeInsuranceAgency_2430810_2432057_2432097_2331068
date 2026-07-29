package Jamiul_Huda.ClaimsOfficerControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

    @FXML
    private Button goal1Button;

    @FXML
    private Button goal2Button;

    @FXML
    private Button goal3Button;

    @FXML
    private Button goal4Button;

    @FXML
    private Button goal5Button;

    @FXML
    private Button goal6Button;

    @FXML
    private Button goal7Button;

    @FXML
    private Button goal8Button;

    @FXML
    private Button logoutButton;


    // ---------- Common Scene Loader ----------

    private void loadScene(ActionEvent event, String fxmlFile) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));

        stage.show();
    }


    // ---------- Goal 1 ----------

    @FXML
    private void openGoal1(ActionEvent event) throws IOException {

        loadScene(event,
                "/Jamiul_Huda/ClaimsOfficer/PendingClaimsQueueView.fxml");
    }


    // ---------- Goal 2 ----------

    @FXML
    private void openGoal2(ActionEvent event) throws IOException {

        loadScene(event,
                "/Jamiul_Huda/ClaimsOfficer/ClaimVerificationView.fxml");
    }


    // ---------- Goal 3 ----------

    @FXML
    private void openGoal3(ActionEvent event) throws IOException {

        loadScene(event,
                "/Jamiul_Huda/ClaimsOfficer/ClaimApprovalView.fxml");
    }


    // ---------- Goal 4 ----------

    @FXML
    private void openGoal4(ActionEvent event) throws IOException {

        loadScene(event,
                "/Jamiul_Huda/ClaimsOfficer/ClaimHistoryView.fxml");
    }


    // ---------- Goal 5 ----------

    @FXML
    private void openGoal5(ActionEvent event) throws IOException {

        loadScene(event,
                "/Jamiul_Huda/ClaimsOfficer/ClaimPaymentView.fxml");
    }


    // ---------- Goal 6 ----------

    @FXML
    private void openGoal6(ActionEvent event) throws IOException {

        loadScene(event,
                "/Jamiul_Huda/ClaimsOfficer/ClaimReportsView.fxml");
    }


    // ---------- Goal 7 ----------

    @FXML
    private void openGoal7(ActionEvent event) throws IOException {

        loadScene(event,
                "/Jamiul_Huda/ClaimsOfficer/ClaimNotificationsView.fxml");
    }


    // ---------- Goal 8 ----------

    @FXML
    private void openGoal8(ActionEvent event) throws IOException {

        loadScene(event,
                "/Jamiul_Huda/ClaimsOfficer/ClaimSettingsView.fxml");
    }


    // ---------- Logout ----------

    @FXML
    private void logout(ActionEvent event) {

        statusLabel.setText("Logout Successful.");

    }

}