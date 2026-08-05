package Jamiul_Huda.ClaimsOfficerControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ClaimApprovalController {

    @FXML
    private TextField claimIdField;

    @FXML
    private TextField policyNumberField;

    @FXML
    private CheckBox policyVerifiedCheckBox;

    @FXML
    private CheckBox documentsVerifiedCheckBox;

    @FXML
    private CheckBox payoutVerifiedCheckBox;

    @FXML
    private Label statusLabel;

    @FXML
    public void approveClaim() {

        if (claimIdField.getText().trim().isEmpty()
                || policyNumberField.getText().trim().isEmpty()) {

            statusLabel.setText("Please enter Claim ID and Policy Number.");
            return;
        }

        if (!policyVerifiedCheckBox.isSelected()
                || !documentsVerifiedCheckBox.isSelected()
                || !payoutVerifiedCheckBox.isSelected()) {

            statusLabel.setText("Complete all verification steps before approval.");
            return;
        }

        statusLabel.setText(
                "Claim Passed and Dispatched to Disbursements Queue"
        );
    }

    @FXML
    public void clearFields() {

        claimIdField.clear();
        policyNumberField.clear();

        policyVerifiedCheckBox.setSelected(false);
        documentsVerifiedCheckBox.setSelected(false);
        payoutVerifiedCheckBox.setSelected(false);

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