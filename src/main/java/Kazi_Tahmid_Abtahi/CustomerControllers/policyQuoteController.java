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

    String customerEmail = "";
    public void receiveUserEmail(String email) {
        this.customerEmail = email;
    }

    private customerDashboardController dashboardController;
    public void receiveDashboardController(customerDashboardController dashboard) {
        this.dashboardController = dashboard;
    }


    @javafx.fxml.FXML
    public void initialize() {
        policyTypeCB.getItems().addAll("Life Insurance", "Health Insurance", "Term Insurance");
        policyTermCB.getItems().addAll(5, 10, 15, 20, 25, 30);

        ToggleGroup smokerTg = new ToggleGroup();
        smokerStatusYesRB.setToggleGroup(smokerTg);
        smokerStatusNoRB.setToggleGroup(smokerTg);


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
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Please fill up all required policy details properly.");
            myAlert.show();
            statusLabel.setText("Enter all the information");
            return;
        }

        if (!medicalHistoryConfirmationCheckbox.isSelected()) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Please confirm that your medical history information is correct.");
            myAlert.show();
            statusLabel.setText("Confirmation Check Required ");
            return;
        }

        if (Float.parseFloat(coverageAmountTF.getText()) <= 0) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Coverage Amount must be greater than zero.");
            myAlert.show();
            statusLabel.setText("Invalid Coverage Amount");
            return;
        }


        float coverageAmount = Float.parseFloat(coverageAmountTF.getText());

        if (coverageAmount <= 0) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Coverage Amount must be greater than zero.");
            myAlert.show();
            statusLabel.setText("Invalid Coverage Amount");
            return;
        }


        float baseFactor;
        if (policyTypeCB.getValue().contains("Life")) {
            baseFactor = 0.005f;
        } else if (policyTypeCB.getValue().contains("Term")) {
            baseFactor = 0.004f;
        }else{
            baseFactor = 0.002f;
        }

        float smokerFactor = 0.00f;
        if (smokerStatus.equals("Smoker")) {
            smokerFactor = 1.50f;
        }
        if(smokerStatus.equals("Non Smoker")){
            smokerFactor = 1.00f;
        }

        float termFactor = 1.0f + (policyTermCB.getValue() / 100.0f);
        float calculatedPremium = coverageAmount * baseFactor * smokerFactor * termFactor;

        calculatedQuotePriceLabel.setText("Calculated Quote price for the policy is:" + calculatedPremium);
        statusLabel.setText("Quote Calculated Successfully");

        Quote quote = new Quote(
                policyTypeCB.getValue(),
                smokerStatus,
                medicalHistoryTA.getText(),
                policyTermCB.getValue(),
                coverageAmount,
                calculatedPremium
        );

        dashboardController.receivePendingQuote(quote);


    }


}