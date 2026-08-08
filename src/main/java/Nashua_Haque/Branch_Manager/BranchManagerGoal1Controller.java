package Nashua_Haque.Branch_Manager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class BranchManagerGoal1Controller {

    @FXML
    private TableColumn<BranchManagerGoal1Processor, String> agentNameTC;

    @FXML
    private TableColumn<BranchManagerGoal1Processor, String> dataJoinedTC;

    @FXML
    private TableColumn<BranchManagerGoal1Processor, String> emailTC;

    @FXML
    private TableColumn<BranchManagerGoal1Processor, String> statusTC;

    @FXML
    private ComboBox<String> statusCB;

    @FXML
    private TableView<BranchManagerGoal1Processor> tableView;

    @FXML
    private TableColumn<BranchManagerGoal1Processor, Integer> agentIdTC;

    @FXML
    private TableColumn<BranchManagerGoal1Processor, String> departmentTC;

    @FXML
    private TableColumn<BranchManagerGoal1Processor, String> phoneTC;

    @FXML
    private ComboBox<String> branchLevelCB;

    @FXML
    private DatePicker joiningDateDP;

    @FXML
    private TableColumn<BranchManagerGoal1Processor, String> actionsTC;

    private ObservableList<BranchManagerGoal1Processor> agentList;

    @FXML
    public void initialize() {

        agentList = FXCollections.observableArrayList();

        branchLevelCB.setItems(FXCollections.observableArrayList(
                "Level 1",
                "Level 2",
                "Level 3"
        ));

        statusCB.setItems(FXCollections.observableArrayList(
                "Active",
                "Inactive"
        ));

        agentIdTC.setCellValueFactory(new PropertyValueFactory<>("agentId"));
        agentNameTC.setCellValueFactory(new PropertyValueFactory<>("agentName"));
        emailTC.setCellValueFactory(new PropertyValueFactory<>("email"));
        phoneTC.setCellValueFactory(new PropertyValueFactory<>("phone"));
        departmentTC.setCellValueFactory(new PropertyValueFactory<>("department"));
        dataJoinedTC.setCellValueFactory(new PropertyValueFactory<>("dateJoined"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        actionsTC.setCellValueFactory(new PropertyValueFactory<>("action"));

        agentList.addAll(

                new BranchManagerGoal1Processor(
                        101,
                        "Rahim Ahmed",
                        "rahim@gmail.com",
                        "01711111111",
                        "Sales",
                        "2025-01-10",
                        "Active",
                        "View"
                ),

                new BranchManagerGoal1Processor(
                        102,
                        "Karim Hasan",
                        "karim@gmail.com",
                        "01822222222",
                        "Marketing",
                        "2025-03-15",
                        "Inactive",
                        "View"
                ),

                new BranchManagerGoal1Processor(
                        103,
                        "Nashua Haque",
                        "nashua@gmail.com",
                        "01933333333",
                        "Sales",
                        "2026-02-01",
                        "Active",
                        "View"
                )
        );

        tableView.setItems(agentList);
    }

    @FXML
    public void searchOA(ActionEvent actionEvent) {

        ObservableList<BranchManagerGoal1Processor> filtered =
                FXCollections.observableArrayList();

        for (BranchManagerGoal1Processor agent : agentList) {

            boolean match = true;

            if (statusCB.getValue() != null) {
                match &= agent.getStatus().equals(statusCB.getValue());
            }

            if (joiningDateDP.getValue() != null) {
                match &= agent.getDateJoined()
                        .equals(joiningDateDP.getValue().toString());
            }

            if (match) {
                filtered.add(agent);
            }
        }

        tableView.setItems(filtered);
    }

    @FXML
    public void clearOA(ActionEvent actionEvent) {

        statusCB.getSelectionModel().clearSelection();
        branchLevelCB.getSelectionModel().clearSelection();
        joiningDateDP.setValue(null);

        tableView.setItems(agentList);
    }

    @FXML
    public void backOA(ActionEvent actionEvent) {
    }
}