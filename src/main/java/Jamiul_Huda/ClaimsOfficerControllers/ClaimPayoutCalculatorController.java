package Jamiul_Huda.ClaimsOfficerControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ClaimPayoutCalculatorController {

    @FXML
    private TextField claimIdField;

    @FXML
    private TextField baseAmountField;

    @FXML
    private TextField exclusionField;

    @FXML
    private TextField balanceField;

    @FXML
    private Label baseLabel;

    @FXML
    private Label exclusionLabel;

    @FXML
    private Label balanceLabel;

    @FXML
    private Label totalLabel;

    @FXML
    private Label statusLabel;

    @FXML
    public void calculatePayout() {

        if (claimIdField.getText().trim().isEmpty()
                || baseAmountField.getText().trim().isEmpty()
                || exclusionField.getText().trim().isEmpty()
                || balanceField.getText().trim().isEmpty()) {

            statusLabel.setText("Please fill in all fields.");
            return;
        }

        try {

            double baseAmount = Double.parseDouble(baseAmountField.getText());
            double exclusions = Double.parseDouble(exclusionField.getText());
            double balance = Double.parseDouble(balanceField.getText());

            double total = baseAmount - exclusions - balance;

            if (total < 0) {
                total = 0;
            }

            if (total > baseAmount) {
                total = baseAmount;
            }

            baseLabel.setText("Base Sum Assured : " + baseAmount);
            exclusionLabel.setText("Policy Exclusions : " + exclusions);
            balanceLabel.setText("Outstanding Balance : " + balance);
            totalLabel.setText("Eligible Claim Payout : " + total);

            statusLabel.setText("Calculation Completed Successfully.");

        } catch (NumberFormatException e) {

            statusLabel.setText("Please enter valid numeric values.");

        }

    }

    @FXML
    public void clearFields() {

        claimIdField.clear();
        baseAmountField.clear();
        exclusionField.clear();
        balanceField.clear();

        baseLabel.setText("Base Sum Assured :");
        exclusionLabel.setText("Policy Exclusions :");
        balanceLabel.setText("Outstanding Balance :");
        totalLabel.setText("Eligible Claim Payout :");
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