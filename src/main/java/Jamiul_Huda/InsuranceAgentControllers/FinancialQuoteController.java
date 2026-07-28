package Jamiul_Huda.InsuranceAgentControllers;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FinancialQuoteController {
    @javafx.fxml.FXML
    private TextField protectionPeriodTextField;
    @javafx.fxml.FXML
    private TableColumn packageNameColumn;
    @javafx.fxml.FXML
    private Button generateRecommendationButton;
    @javafx.fxml.FXML
    private Button exportPdfButton;
    @javafx.fxml.FXML
    private BarChart comparisonBarChart;
    @javafx.fxml.FXML
    private Label notificationLabel;
    @javafx.fxml.FXML
    private TextField budgetTextField;
    @javafx.fxml.FXML
    private TextField dependentsCountTextField;
    @javafx.fxml.FXML
    private Button clearButton;
    @javafx.fxml.FXML
    private TableColumn maturityValueColumn;
    @javafx.fxml.FXML
    private TableColumn premiumColumn;
    @javafx.fxml.FXML
    private ComboBox riskAppetiteComboBox;
    @javafx.fxml.FXML
    private TableView recommendationTableView;
}
