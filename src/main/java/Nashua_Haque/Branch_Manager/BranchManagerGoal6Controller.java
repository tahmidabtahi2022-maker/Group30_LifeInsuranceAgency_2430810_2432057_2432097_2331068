package Nashua_Haque.Branch_Manager;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class BranchManagerGoal6Controller implements Initializable {

    @FXML
    private ComboBox<String> repotTypeCB;

    @FXML
    private DatePicker fromDateDP;

    @FXML
    private DatePicker toDateDP;

    @FXML
    private TableView<BranchManagerGoal6Processor> tableView;

    @FXML
    private TableColumn<BranchManagerGoal6Processor, String> branchTC;

    @FXML
    private TableColumn<BranchManagerGoal6Processor, String> agentTC;

    @FXML
    private TableColumn<BranchManagerGoal6Processor, String> totalPremiumTC;

    @FXML
    private TableColumn<BranchManagerGoal6Processor, String> totalClaimsTC;

    @FXML
    private TableColumn<BranchManagerGoal6Processor, String> commissionTC;

    @FXML
    private TableColumn<BranchManagerGoal6Processor, String> statusTC1;

    @FXML
    private TableColumn<BranchManagerGoal6Processor, String> branchTC1;

    @FXML
    private TableColumn<BranchManagerGoal6Processor, String> agentIdTC1;

    private final ObservableList<BranchManagerGoal6Processor> reportList =
            FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        repotTypeCB.getItems().addAll(
                "Branch Performance Report",
                "Agent Performance Report",
                "Commission Report",
                "Claims Report"
        );

        branchTC.setCellValueFactory(
                new PropertyValueFactory<>("branch"));

        agentTC.setCellValueFactory(
                new PropertyValueFactory<>("agent"));

        totalPremiumTC.setCellValueFactory(
                new PropertyValueFactory<>("totalPremium"));

        totalClaimsTC.setCellValueFactory(
                new PropertyValueFactory<>("totalClaims"));

        commissionTC.setCellValueFactory(
                new PropertyValueFactory<>("commission"));

        statusTC1.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        branchTC1.setCellValueFactory(
                new PropertyValueFactory<>("branchCode"));

        agentIdTC1.setCellValueFactory(
                new PropertyValueFactory<>("agentId"));

        reportList.addAll(

                new BranchManagerGoal6Processor(
                        "Dhaka",
                        "Ahmed Hasan",
                        "250000",
                        "50000",
                        "15000",
                        "Approved",
                        "DHK01",
                        "A101"
                ),

                new BranchManagerGoal6Processor(
                        "Chattogram",
                        "Nadia Akter",
                        "180000",
                        "25000",
                        "12000",
                        "Pending",
                        "CTG02",
                        "A102"
                ),

                new BranchManagerGoal6Processor(
                        "Sylhet",
                        "Sabbir Rahman",
                        "220000",
                        "30000",
                        "13500",
                        "Approved",
                        "SYL03",
                        "A103"
                )
        );

        tableView.setItems(reportList);
    }

    @FXML
    void refreshOA(ActionEvent event) {

        repotTypeCB.getSelectionModel().clearSelection();
        fromDateDP.setValue(null);
        toDateDP.setValue(null);

        tableView.setItems(reportList);

        System.out.println("Report data refreshed.");
    }
}