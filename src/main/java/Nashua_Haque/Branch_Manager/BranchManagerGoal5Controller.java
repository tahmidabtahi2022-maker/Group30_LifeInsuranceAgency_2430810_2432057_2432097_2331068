package Nashua_Haque.Branch_Manager;

import java.net.URL;
import java.time.LocalDate;
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

public class BranchManagerGoal5Controller implements Initializable {

    @FXML
    private ComboBox<String> branchCB;

    @FXML
    private ComboBox<String> statusCB;

    @FXML
    private DatePicker reportDateDP;

    @FXML
    private TableView<BranchManagerGoal5Processor> performanceTV;

    @FXML
    private TableColumn<BranchManagerGoal5Processor, String> branchIdTC;

    @FXML
    private TableColumn<BranchManagerGoal5Processor, String> branchNameTC;

    @FXML
    private TableColumn<BranchManagerGoal5Processor, String> managerNameTC;

    @FXML
    private TableColumn<BranchManagerGoal5Processor, String> totalPoliciesTC;

    @FXML
    private TableColumn<BranchManagerGoal5Processor, String> totalRevenueTC;

    @FXML
    private TableColumn<BranchManagerGoal5Processor, String> performanceStatusTC;

    @FXML
    private TableColumn<BranchManagerGoal5Processor, String> reportDateTC;

    private final ObservableList<BranchManagerGoal5Processor> performanceList =
            FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        branchCB.getItems().addAll(
                "Dhaka",
                "Chattogram",
                "Khulna",
                "Rajshahi",
                "Sylhet"
        );

        statusCB.getItems().addAll(
                "Excellent",
                "Good",
                "Average",
                "Poor"
        );

        branchIdTC.setCellValueFactory(new PropertyValueFactory<>("branchId"));
        branchNameTC.setCellValueFactory(new PropertyValueFactory<>("branchName"));
        managerNameTC.setCellValueFactory(new PropertyValueFactory<>("managerName"));
        totalPoliciesTC.setCellValueFactory(new PropertyValueFactory<>("totalPolicies"));
        totalRevenueTC.setCellValueFactory(new PropertyValueFactory<>("totalRevenue"));
        performanceStatusTC.setCellValueFactory(new PropertyValueFactory<>("performanceStatus"));
        reportDateTC.setCellValueFactory(new PropertyValueFactory<>("reportDate"));

        performanceList.addAll(
                new BranchManagerGoal5Processor(
                        "B001",
                        "Dhaka",
                        "Ahmed Hasan",
                        "1250",
                        "5,200,000",
                        "Excellent",
                        "2026-08-01"
                ),

                new BranchManagerGoal5Processor(
                        "B002",
                        "Chattogram",
                        "Nadia Akter",
                        "980",
                        "3,850,000",
                        "Good",
                        "2026-08-01"
                ),

                new BranchManagerGoal5Processor(
                        "B003",
                        "Khulna",
                        "Sabbir Rahman",
                        "720",
                        "2,450,000",
                        "Average",
                        "2026-08-01"
                )
        );

        performanceTV.setItems(performanceList);
    }

    @FXML
    void searchOA(ActionEvent event) {

        String branch = branchCB.getValue();
        String status = statusCB.getValue();
        LocalDate reportDate = reportDateDP.getValue();

        System.out.println("Branch : " + branch);
        System.out.println("Status : " + status);
        System.out.println("Date : " + reportDate);

        // Add filtering logic here if needed.
    }

    @FXML
    void clearOA(ActionEvent event) {

        branchCB.getSelectionModel().clearSelection();
        statusCB.getSelectionModel().clearSelection();
        reportDateDP.setValue(null);

        performanceTV.setItems(performanceList);
    }
}