package Jamiul_Huda.ClaimsOfficerControllers;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ClaimRejectionController {

    @FXML
    private TextField claimIdField;

    @FXML
    private TextField policyNumberField;

    @FXML
    private ComboBox<String> reasonComboBox;

    @FXML
    private TextArea notesArea;

    @FXML
    private Label statusLabel;

    @FXML
    public void initialize() {

        reasonComboBox.setItems(FXCollections.observableArrayList(
                "Pre-existing Condition Non-Disclosure",
                "Exclusion Clause Coverage Violation Code",
                "Policy Expired",
                "Fraudulent Documentation",
                "Incomplete Supporting Documents"
        ));

    }

    @FXML
    public void rejectClaim() {

        if (claimIdField.getText().trim().isEmpty()
                || policyNumberField.getText().trim().isEmpty()
                || reasonComboBox.getValue() == null
                || notesArea.getText().trim().isEmpty()) {

            statusLabel.setText("Please complete all required fields.");
            return;
        }

        statusLabel.setText(
                "Claim Rejected Successfully.\nStatus: Rejected"
        );

    }

    @FXML
    public void clearFields() {

        claimIdField.clear();
        policyNumberField.clear();
        reasonComboBox.getSelectionModel().clearSelection();
        notesArea.clear();
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