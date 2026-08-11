package Jamiul_Huda.InsuranceAgentControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

public class AgentPerformanceReportController {

    @FXML
    private Label lblTo;

    @FXML
    private Label lblGraph;

    @FXML
    private TextArea txtSummary;

    @FXML
    private DatePicker dpFrom;

    @FXML
    private DatePicker dpTo;

    @FXML
    private Button btnGenerateReport;

    @FXML
    private TextArea txtGraph;

    @FXML
    private HBox dateBox;

    @FXML
    private Label lblTitle;

    @FXML
    private Label lblSummary;

    @FXML
    private Label lblFrom;

    @FXML
    private void generateReport(ActionEvent event) {

        if (dpFrom.getValue() == null || dpTo.getValue() == null) {
            txtSummary.setText("Please select both dates.");
            return;
        }

        txtSummary.setText(
                "Total Policies Sold : 20\n" +
                        "Total Premium : BDT 500000\n" +
                        "Commission : BDT 50000"
        );

        txtGraph.setText(
                "Week 1 : ****\n" +
                        "Week 2 : ******\n" +
                        "Week 3 : ********\n" +
                        "Week 4 : **********"
        );
    }

}