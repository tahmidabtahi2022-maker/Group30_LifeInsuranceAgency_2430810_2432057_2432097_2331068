package Kazi_Tahmid_Abtahi.CustomerControllers;

import Kazi_Tahmid_Abtahi.Model_Classes.Quote;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class policyQuoteController
{
    @javafx.fxml.FXML
    private RadioButton smokerStatusNoRB;
    @javafx.fxml.FXML
    private CheckBox medicalHistoryConfirmationCheckbox;
    @javafx.fxml.FXML
    private ComboBox<String> policyTypeCB;
    @javafx.fxml.FXML
    private Label calculatedQuotePriceLabel;
    @javafx.fxml.FXML
    private TextField coverageAmountTF;
    @javafx.fxml.FXML
    private ComboBox<Integer> policyTermCB;
    @javafx.fxml.FXML
    private TextArea medicalHistoryTA;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private RadioButton smokerStatusYesRB;

    @javafx.fxml.FXML
    public void initialize() {
        policyTypeCB.getItems().addAll("Life Insurance", "Health Insurance", "Term Insurance");
        policyTermCB.getItems().addAll(5, 10, 15, 20, 25, 30);

        ToggleGroup smokerTg = new ToggleGroup();
        smokerStatusYesRB.setToggleGroup(smokerTg);
        smokerStatusNoRB.setToggleGroup(smokerTg);
    }

    String customerEmail = "";
    public void receiveUserEmail(String email) {
        this.customerEmail = email;
    }

    private customerDashboardController dashboardController;
    public void receiveDashboardController(customerDashboardController dashboard) {
        this.dashboardController = dashboard;
    }

    @javafx.fxml.FXML
    public void calculatePremiumQuoteButtonOnAction(ActionEvent actionEvent) {
        String smokerStatus = "";
        if(smokerStatusYesRB.isSelected()){
            smokerStatus = "Smoker";
        }
        if(smokerStatusNoRB.isSelected()){
            smokerStatus = "Non Smoker";
        }

        if (coverageAmountTF.getText().isEmpty() || medicalHistoryTA.getText().isEmpty() || policyTypeCB.getValue() == null || policyTermCB.getValue() == null || (!smokerStatusYesRB.isSelected() && !smokerStatusNoRB.isSelected())) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please fill up all required policy details properly.");
            a.show();
            statusLabel.setText("Please fill up all required policy details properly.");
            return;
        }

        if (!medicalHistoryConfirmationCheckbox.isSelected()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please confirm that your medical history information is correct.");
            a.show();
            statusLabel.setText("Please confirm that your medical history information is correct.");
            return;
        }

        if (Float.parseFloat(coverageAmountTF.getText()) <= 0) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Coverage Amount must be greater than zero.");
            a.show();
            statusLabel.setText("Coverage Amount must be greater than zero");
            return;
        }


        float baseRate;
        if (policyTypeCB.getValue().contains("Life")) {
            baseRate = 5.0f;
        } else if (policyTypeCB.getValue().contains("Term")) {
            baseRate = 4.0f;
        } else {
            baseRate = 2.0f;
        }

        float calculatedPremium = (Float.parseFloat(coverageAmountTF.getText()) / 1000) * baseRate;

        calculatedQuotePriceLabel.setText("Calculated Quote price for the policy is:" + calculatedPremium + "Tk");
        statusLabel.setText("Quote Calculated Successfully");

        Quote quote = new Quote(
                policyTypeCB.getValue(),
                smokerStatus,
                medicalHistoryTA.getText(),
                policyTermCB.getValue(),
                Float.parseFloat(coverageAmountTF.getText()),
                calculatedPremium
        );

        dashboardController.receivePendingQuote(quote);

    }

}