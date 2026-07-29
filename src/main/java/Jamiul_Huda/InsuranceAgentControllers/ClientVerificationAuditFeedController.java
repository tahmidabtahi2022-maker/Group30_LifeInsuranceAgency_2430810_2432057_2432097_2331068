package Jamiul_Huda.InsuranceAgentControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientVerificationAuditFeedController {

    @FXML
    private TableColumn clientIdColumn;

    @FXML
    private TableColumn customerNameColumn;

    @FXML
    private TableColumn documentTypeColumn;

    @FXML
    private TableColumn statusColumn;

    @FXML
    private TableView documentTableView;

    @FXML
    private TextField clientIdTextField;

    @FXML
    private Button searchButton;

    @FXML
    private Button approveKYCButton;

    @FXML
    private Button markDeficientButton;

    @FXML
    private Button refreshButton;

    @FXML
    private Label notificationLabel;

    @FXML
    private ImageView nidImageView;

    @FXML
    private ImageView medicalReportImageView;

    private void switchScene(ActionEvent event, String fxml) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(fxml));

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));

        stage.show();
    }
    @FXML
    private void openDashboard(ActionEvent event) throws IOException {

        switchScene(event,
                "/Jamiul_Huda/InsuranceAgent/InsuranceAgentDashboardView.fxml");
    }


    @FXML
    private void searchClient(ActionEvent event) {

        if (clientIdTextField.getText().isEmpty()) {

            notificationLabel.setText("Please enter Client ID.");

        } else {

            notificationLabel.setText("Customer documents found.");

        }
    }



    @FXML
    private void approveKYC(ActionEvent event) {

        notificationLabel.setText("KYC Approved Successfully.");

    }

    @FXML
    private void markDeficient(ActionEvent event) {

        notificationLabel.setText("KYC Marked as Deficient.");

    }

    @FXML
    private void refreshTable(ActionEvent event) {

        documentTableView.refresh();

        notificationLabel.setText("Table Refreshed.");

    }

    @FXML
    public void initialize() {

        notificationLabel.setText("Waiting for Verification.");

    }

}