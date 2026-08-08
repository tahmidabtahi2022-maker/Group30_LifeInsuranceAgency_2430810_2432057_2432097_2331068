package Nashua_Haque.Branch_Manager;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class BranchManagerGoal7Controller implements Initializable {

    @FXML
    private TextField customerNameTF;

    @FXML
    private ComboBox<String> branchCB;

    @FXML
    private ComboBox<String> surverPeriodCB;

    @FXML
    private TableView<BranchManagerGoal7Processor> tableView;

    @FXML
    private TableColumn<BranchManagerGoal7Processor, String> feedbackIdTC;

    @FXML
    private TableColumn<BranchManagerGoal7Processor, String> customerNameTC;

    @FXML
    private TableColumn<BranchManagerGoal7Processor, String> policyNumberTC;

    @FXML
    private TableColumn<BranchManagerGoal7Processor, String> branchTC;

    @FXML
    private TableColumn<BranchManagerGoal7Processor, String> agentNameTC;

    @FXML
    private TableColumn<BranchManagerGoal7Processor, String> ratingTC;

    @FXML
    private TableColumn<BranchManagerGoal7Processor, String> feedbackDateTC;

    @FXML
    private TableColumn<BranchManagerGoal7Processor, String> statusTC;

    private final ObservableList<BranchManagerGoal7Processor> feedbackList =
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

        surverPeriodCB.getItems().addAll(
                "Last 7 Days",
                "Last 30 Days",
                "Last 3 Months",
                "Last 6 Months",
                "Last Year"
        );

        feedbackIdTC.setCellValueFactory(new PropertyValueFactory<>("feedbackId"));
        customerNameTC.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        policyNumberTC.setCellValueFactory(new PropertyValueFactory<>("policyNumber"));
        branchTC.setCellValueFactory(new PropertyValueFactory<>("branch"));
        agentNameTC.setCellValueFactory(new PropertyValueFactory<>("agentName"));
        ratingTC.setCellValueFactory(new PropertyValueFactory<>("rating"));
        feedbackDateTC.setCellValueFactory(new PropertyValueFactory<>("feedbackDate"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

        feedbackList.addAll(

                new BranchManagerGoal7Processor(
                        "F001",
                        "Rahim Ahmed",
                        "P1001",
                        "Dhaka",
                        "Karim Hasan",
                        "5",
                        "2026-08-01",
                        "Reviewed"
                ),

                new BranchManagerGoal7Processor(
                        "F002",
                        "Nusrat Jahan",
                        "P1002",
                        "Chattogram",
                        "Mizan Rahman",
                        "4",
                        "2026-08-03",
                        "Pending"
                ),

                new BranchManagerGoal7Processor(
                        "F003",
                        "Sabbir Hossain",
                        "P1003",
                        "Khulna",
                        "Tanvir Islam",
                        "3",
                        "2026-08-05",
                        "Reviewed"
                )

        );

        tableView.setItems(feedbackList);
    }

    @FXML
    void filterApplyOA(ActionEvent event) {

        System.out.println("Customer : " + customerNameTF.getText());
        System.out.println("Branch : " + branchCB.getValue());
        System.out.println("Survey Period : " + surverPeriodCB.getValue());

        // Add filtering logic here.
    }

    @FXML
    void exportReportOA(ActionEvent event) {

        System.out.println("Export Report button clicked.");

        // Export report logic here.
    }

    @FXML
    void refreshOA(ActionEvent event) {

        customerNameTF.clear();
        branchCB.getSelectionModel().clearSelection();
        surverPeriodCB.getSelectionModel().clearSelection();

        tableView.setItems(feedbackList);

        System.out.println("Data refreshed.");
    }
}