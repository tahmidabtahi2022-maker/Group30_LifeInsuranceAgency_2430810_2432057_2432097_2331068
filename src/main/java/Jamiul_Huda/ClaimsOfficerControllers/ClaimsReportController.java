package Jamiul_Huda.ClaimsOfficerControllers;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ClaimsReportController {

    @FXML
    private ComboBox<String> yearComboBox;

    @FXML
    private ComboBox<String> monthComboBox;

    @FXML
    private Label grossClaimsLabel;

    @FXML
    private Label rejectionLabel;

    @FXML
    private Label settlementLabel;

    @FXML
    private Label delayLabel;

    @FXML
    private BarChart<String, Number> barChart;

    @FXML
    private LineChart<String, Number> lineChart;

    @FXML
    public void initialize() {

        yearComboBox.setItems(FXCollections.observableArrayList(
                "2024",
                "2025",
                "2026"
        ));

        monthComboBox.setItems(FXCollections.observableArrayList(
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        ));

    }

    @FXML
    public void generateReport() {

        if (yearComboBox.getValue() == null || monthComboBox.getValue() == null) {
            grossClaimsLabel.setText("Please select Year and Month.");
            return;
        }

        int grossClaims = 45;
        double rejectionRate = 12.5;
        double settlementAmount = 1850000;
        double averageDelay = 6;

        grossClaimsLabel.setText("Gross Claims : " + grossClaims);
        rejectionLabel.setText("Rejection Rate : " + rejectionRate + "%");
        settlementLabel.setText("Settlement Amount : " + settlementAmount);
        delayLabel.setText("Average Delay : " + averageDelay + " Days");

        barChart.getData().clear();

        XYChart.Series<String, Number> barSeries = new XYChart.Series<>();
        barSeries.setName("Summary");

        barSeries.getData().add(new XYChart.Data<>("Claims", grossClaims));
        barSeries.getData().add(new XYChart.Data<>("Rejected", 6));
        barSeries.getData().add(new XYChart.Data<>("Approved", 39));

        barChart.getData().add(barSeries);

        lineChart.getData().clear();

        XYChart.Series<String, Number> lineSeries = new XYChart.Series<>();
        lineSeries.setName("Trend");

        lineSeries.getData().add(new XYChart.Data<>("Week 1", 8));
        lineSeries.getData().add(new XYChart.Data<>("Week 2", 11));
        lineSeries.getData().add(new XYChart.Data<>("Week 3", 13));
        lineSeries.getData().add(new XYChart.Data<>("Week 4", 13));

        lineChart.getData().add(lineSeries);

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