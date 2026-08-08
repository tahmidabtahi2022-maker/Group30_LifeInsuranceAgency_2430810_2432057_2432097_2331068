package Nashua_Haque.Branch_Manager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class BranchManagerGoal2Controller {

    @FXML
    private TableColumn<BranchManagerGoal2Processor, Integer> policiesSoldTC;

    @FXML
    private TableColumn<BranchManagerGoal2Processor, String> performanceTC;

    @FXML
    private TableColumn<BranchManagerGoal2Processor, String> agentNameTC;

    @FXML
    private DatePicker toDateDP;

    @FXML
    private DatePicker fromDateDP;

    @FXML
    private TableView<BranchManagerGoal2Processor> tableView;

    @FXML
    private TableColumn<BranchManagerGoal2Processor, Integer> agentIdTC;

    @FXML
    private TableColumn<BranchManagerGoal2Processor, Double> totalSalesTC;

    @FXML
    private TableColumn<BranchManagerGoal2Processor, Double> commissionTC;

    private ObservableList<BranchManagerGoal2Processor> salesList;

    @FXML
    public void initialize() {

        salesList = FXCollections.observableArrayList();

        agentIdTC.setCellValueFactory(new PropertyValueFactory<>("agentId"));
        agentNameTC.setCellValueFactory(new PropertyValueFactory<>("agentName"));
        policiesSoldTC.setCellValueFactory(new PropertyValueFactory<>("policiesSold"));
        totalSalesTC.setCellValueFactory(new PropertyValueFactory<>("totalSales"));
        commissionTC.setCellValueFactory(new PropertyValueFactory<>("commission"));
        performanceTC.setCellValueFactory(new PropertyValueFactory<>("performance"));

        salesList.addAll(

                new BranchManagerGoal2Processor(
                        101,
                        "Rahim Ahmed",
                        25,
                        1500000,
                        150000,
                        "Excellent",
                        "2026-08-01"
                ),

                new BranchManagerGoal2Processor(
                        102,
                        "Karim Hasan",
                        18,
                        1000000,
                        100000,
                        "Good",
                        "2026-08-03"
                ),

                new BranchManagerGoal2Processor(
                        103,
                        "Nashua Haque",
                        12,
                        700000,
                        70000,
                        "Average",
                        "2026-08-06"
                )
        );

        tableView.setItems(salesList);
    }

    @FXML
    public void filterOA(ActionEvent actionEvent) {

        ObservableList<BranchManagerGoal2Processor> filtered =
                FXCollections.observableArrayList();

        for (BranchManagerGoal2Processor sale : salesList) {

            boolean match = true;

            if (fromDateDP.getValue() != null) {
                match &= sale.getSalesDate()
                        .compareTo(fromDateDP.getValue().toString()) >= 0;
            }

            if (toDateDP.getValue() != null) {
                match &= sale.getSalesDate()
                        .compareTo(toDateDP.getValue().toString()) <= 0;
            }

            if (match) {
                filtered.add(sale);
            }
        }

        tableView.setItems(filtered);
    }

    @FXML
    public void refreshOA(ActionEvent actionEvent) {

        tableView.setItems(salesList);

        fromDateDP.setValue(null);
        toDateDP.setValue(null);
    }
}