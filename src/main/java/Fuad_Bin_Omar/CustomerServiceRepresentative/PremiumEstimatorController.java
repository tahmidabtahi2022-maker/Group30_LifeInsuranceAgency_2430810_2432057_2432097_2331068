package Fuad_Bin_Omar.CustomerServiceRepresentative;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class PremiumEstimatorController
{
    @javafx.fxml.FXML
    private TableColumn<PremiumEstimatorProcessing, Float> MonthlyPremiumColumn;
    @javafx.fxml.FXML
    private ComboBox<String> HealthStatusComboBox;
    @javafx.fxml.FXML
    private TableColumn<PremiumEstimatorProcessing, String> HealthStatusColumn;
    @javafx.fxml.FXML
    private TableColumn<PremiumEstimatorProcessing, Float> CoverageAmountColumn;
    @javafx.fxml.FXML
    private TextField MonthlyPremiumTextfield;
    @javafx.fxml.FXML
    private TextField CoverageAmountTextfield;
    @javafx.fxml.FXML
    private TableView<PremiumEstimatorProcessing> Tableview;
    @javafx.fxml.FXML
    private TableColumn<PremiumEstimatorProcessing, LocalDate> DateofBirthColumn;
    @javafx.fxml.FXML
    private TextField AnnualPremiumTextfield;
    @javafx.fxml.FXML
    private TableColumn<PremiumEstimatorProcessing, Float> AnnualPremiumColumn;
    @javafx.fxml.FXML
    private DatePicker BirthDatePicker;

    @javafx.fxml.FXML
    public void initialize() {

        HealthStatusComboBox.getItems().addAll("Good", "Average", "Poor");


        DateofBirthColumn.setCellValueFactory(new PropertyValueFactory<>("DateofBirth"));
        CoverageAmountColumn.setCellValueFactory(new PropertyValueFactory<>("CoverageAmount"));
        HealthStatusColumn.setCellValueFactory(new PropertyValueFactory<>("HealthStatus"));
        MonthlyPremiumColumn.setCellValueFactory(new PropertyValueFactory<>("MonthlyPremium"));
        AnnualPremiumColumn.setCellValueFactory(new PropertyValueFactory<>("AnnualPremium"));

    }

    @javafx.fxml.FXML
    public void ClearButton(ActionEvent actionEvent) {

        CoverageAmountTextfield.clear();
        MonthlyPremiumTextfield.clear();
        AnnualPremiumTextfield.clear();

        HealthStatusComboBox.getSelectionModel().clearSelection();
        BirthDatePicker.setValue(null);

    }

    @javafx.fxml.FXML
    public void GeneratePremiumQuoteButton(ActionEvent actionEvent) {

        Alert a = new Alert(Alert.AlertType.INFORMATION);

        a.setContentText(
                "Date of Birth: " + BirthDatePicker.getValue() +
                        "\nCoverage Amount: " + CoverageAmountTextfield.getText() +
                        "\nHealth Status: " + HealthStatusComboBox.getValue() +
                        "\nMonthly Premium: " + MonthlyPremiumTextfield.getText() +
                        "\nAnnual Premium: " + AnnualPremiumTextfield.getText()
        );

        a.showAndWait();

    }

    @javafx.fxml.FXML
    public void ExportQuoteButton(ActionEvent actionEvent) {

        // Validation
        if (BirthDatePicker.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select Date of Birth!");
            a.showAndWait();
            return;
        }

        if (CoverageAmountTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Coverage Amount is required!");
            a.showAndWait();
            return;
        }

        if (HealthStatusComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select Health Status!");
            a.showAndWait();
            return;
        }


        float coverageAmount =
                Float.parseFloat(CoverageAmountTextfield.getText());

        float annualPremium = coverageAmount * 0.01f;
        float monthlyPremium = annualPremium / 12;


        MonthlyPremiumTextfield.setText(
                String.valueOf(monthlyPremium));

        AnnualPremiumTextfield.setText(
                String.valueOf(annualPremium));


        // Create Instance
        PremiumEstimatorProcessing premium =
                new PremiumEstimatorProcessing(

                        HealthStatusComboBox.getValue(),
                        coverageAmount,
                        monthlyPremium,
                        annualPremium,
                        BirthDatePicker.getValue()
                );


        // Add to TableView
        Tableview.getItems().add(premium);


        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Premium quote generated successfully.");
        a.showAndWait();

    }
}