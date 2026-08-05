package Jamiul_Huda.ClaimsOfficerControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EvidenceRequestController {

    @FXML
    private TextField claimIdField;

    @FXML
    private TextField policyNumberField;

    @FXML
    private TextArea requestArea;

    @FXML
    private Label statusLabel;

    @FXML
    public void submitRequest() {

        String claimId = claimIdField.getText().trim();
        String policyNumber = policyNumberField.getText().trim();
        String request = requestArea.getText().trim();

        if (claimId.isEmpty() || policyNumber.isEmpty() || request.isEmpty()) {
            statusLabel.setText("Please fill in all fields.");
            return;
        }

        if (request.length() < 25) {
            statusLabel.setText("Request must contain at least 25 characters.");
            return;
        }

        statusLabel.setText(
                "Request Submitted Successfully.\n" +
                        "Status: Deferred - Awaiting Supporting Evidence Logs"
        );
    }

    @FXML
    public void clearFields() {

        claimIdField.clear();
        policyNumberField.clear();
        requestArea.clear();
        statusLabel.setText("");

    }

    @FXML
    public void backDashboard(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource("/FXML/ClaimsOfficerDashboard.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(new Scene(root));
        stage.show();

    }

}