package Fuad_Bin_Omar.SystemAdministratorController;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PremiumTemplateController
{
    @javafx.fxml.FXML
    private TextField WholeLifeBaseRateTextfield;
    @javafx.fxml.FXML
    private TextField OtherPremiumFactorsTextfield;
    @javafx.fxml.FXML
    private TextField TermLifeBaseRateTextfield;
    @javafx.fxml.FXML
    private Label NumericValuesLabel;
    @javafx.fxml.FXML
    private Label StatusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SaveNewSettingButton(ActionEvent actionEvent) {

        if (TermLifeBaseRateTextfield.getText().isEmpty() ||
                WholeLifeBaseRateTextfield.getText().isEmpty() ||
                OtherPremiumFactorsTextfield.getText().isEmpty()) {

            StatusLabel.setText("Please fill all fields!");
            return;
        }

        PremiumTemplateProcessing premium =
                new PremiumTemplateProcessing(

                        Float.parseFloat(TermLifeBaseRateTextfield.getText()),
                        Float.parseFloat(WholeLifeBaseRateTextfield.getText()),
                        Float.parseFloat(OtherPremiumFactorsTextfield.getText())
                );

        NumericValuesLabel.setText("Numeric values accepted.");
        StatusLabel.setText("Saved Successfully");

    }
}