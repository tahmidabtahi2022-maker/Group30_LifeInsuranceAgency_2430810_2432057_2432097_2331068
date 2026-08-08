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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class BranchManagerGoal8Controller implements Initializable {

    @FXML
    private TextField targetAmountTF;

    @FXML
    private TextField targetValueTF;

    @FXML
    private ComboBox<String> targetTypeCB;

    @FXML
    private TableView<BranchManagerGoal8Processor> tableView;

    @FXML
    private TableColumn<BranchManagerGoal8Processor, String> targetIdTC;

    @FXML
    private TableColumn<BranchManagerGoal8Processor, String> branchTC;

    @FXML
    private TableColumn<BranchManagerGoal8Processor, String> targetTypeTC;

    @FXML
    private TableColumn<BranchManagerGoal8Processor, String> targetValueTC;

    @FXML
    private TableColumn<BranchManagerGoal8Processor, String> targetPeriodTC;

    @FXML
    private TableColumn<BranchManagerGoal8Processor, String> statusTC;

    @FXML
    private TableColumn<BranchManagerGoal8Processor, String> createdDateTC;

    private final ObservableList<BranchManagerGoal8Processor> targetList =
            FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        targetTypeCB.getItems().addAll(
                "Monthly Sales",
                "Quarterly Sales",
                "Yearly Sales",
                "Policy Sales",
                "Revenue Target"
        );

        targetIdTC.setCellValueFactory(new PropertyValueFactory<>("targetId"));
        branchTC.setCellValueFactory(new PropertyValueFactory<>("branch"));
        targetTypeTC.setCellValueFactory(new PropertyValueFactory<>("targetType"));
        targetValueTC.setCellValueFactory(new PropertyValueFactory<>("targetValue"));
        targetPeriodTC.setCellValueFactory(new PropertyValueFactory<>("targetPeriod"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        createdDateTC.setCellValueFactory(new PropertyValueFactory<>("createdDate"));

        targetList.addAll(

                new BranchManagerGoal8Processor(
                        "T001",
                        "Dhaka",
                        "Monthly Sales",
                        "500000",
                        "July 2026",
                        "Active",
                        "2026-07-01"
                ),

                new BranchManagerGoal8Processor(
                        "T002",
                        "Chattogram",
                        "Quarterly Sales",
                        "1200000",
                        "Q3 2026",
                        "Active",
                        "2026-07-05"
                ),

                new BranchManagerGoal8Processor(
                        "T003",
                        "Khulna",
                        "Revenue Target",
                        "800000",
                        "August 2026",
                        "Pending",
                        "2026-08-01"
                )

        );

        tableView.setItems(targetList);
    }

    @FXML
    void refreshOA(ActionEvent event) {

        targetAmountTF.clear();
        targetValueTF.clear();

        targetTypeCB.getSelectionModel().clearSelection();

        tableView.setItems(targetList);

        System.out.println("Sales target data refreshed.");
    }
}