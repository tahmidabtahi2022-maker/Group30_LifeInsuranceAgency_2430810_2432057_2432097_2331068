package Jamiul_Huda.InsuranceAgentControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;

public class FinancialQuoteController {

    @FXML
    private TextField protectionPeriodTextField;

    @FXML
    private TableColumn packageNameColumn;

    @FXML
    private Button generateRecommendationButton;

    @FXML
    private Button exportPdfButton;

    @FXML
    private BarChart<String, Number> comparisonBarChart;

    @FXML
    private Label notificationLabel;

    @FXML
    private TextField budgetTextField;

    @FXML
    private TextField dependentsCountTextField;

    @FXML
    private Button clearButton;

    @FXML
    private TableColumn premiumColumn;

    @FXML
    private TableColumn maturityValueColumn;

    @FXML
    private ComboBox<String> riskAppetiteComboBox;

    @FXML
    private TableView recommendationTableView;

    @FXML
    public void initialize() {

        riskAppetiteComboBox.getItems().addAll(
                "Low",
                "Medium",
                "High"
        );
    }

    @FXML
    private void generateRecommendation(ActionEvent event) {

        if (budgetTextField.getText().isEmpty()
                || protectionPeriodTextField.getText().isEmpty()
                || dependentsCountTextField.getText().isEmpty()
                || riskAppetiteComboBox.getValue() == null) {

            notificationLabel.setText("Please fill all fields.");
            return;
        }

        comparisonBarChart.getData().clear();

        XYChart.Series<String, Number> premiumSeries = new XYChart.Series<>();
        premiumSeries.setName("Premium");

        premiumSeries.getData().add(new XYChart.Data<>("Basic", 1200));
        premiumSeries.getData().add(new XYChart.Data<>("Silver", 2200));
        premiumSeries.getData().add(new XYChart.Data<>("Gold", 3500));

        XYChart.Series<String, Number> maturitySeries = new XYChart.Series<>();
        maturitySeries.setName("Maturity");

        maturitySeries.getData().add(new XYChart.Data<>("Basic", 250000));
        maturitySeries.getData().add(new XYChart.Data<>("Silver", 500000));
        maturitySeries.getData().add(new XYChart.Data<>("Gold", 1000000));

        comparisonBarChart.getData().addAll(premiumSeries, maturitySeries);

        notificationLabel.setText("Recommendation Generated Successfully.");
    }

    @FXML
    private void exportPdf(ActionEvent event) {

        notificationLabel.setText("Recommendation Report exported successfully.");
    }

    @FXML
    private void clear(ActionEvent event) {

        budgetTextField.clear();
        protectionPeriodTextField.clear();
        dependentsCountTextField.clear();

        riskAppetiteComboBox.getSelectionModel().clearSelection();

        comparisonBarChart.getData().clear();

        notificationLabel.setText("Form Cleared.");
    }
}