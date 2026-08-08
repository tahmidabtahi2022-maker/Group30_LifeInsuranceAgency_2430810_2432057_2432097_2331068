package Nashua_Haque.Branch_Manager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class BranchManagerGoal4Controller {

    @FXML
    private ComboBox<String> priorityCB;

    @FXML
    private TableColumn<BranchManagerGoal4Processor, Integer> customerIdTC;

    @FXML
    private TableColumn<BranchManagerGoal4Processor, String> priorityTC;

    @FXML
    private TableColumn<BranchManagerGoal4Processor, Integer> agentIdTC;

    @FXML
    private ComboBox<String> agentCB;

    @FXML
    private TableView<BranchManagerGoal4Processor> tableView;

    @FXML
    private TableColumn<BranchManagerGoal4Processor, String> assignmentDateTC;

    @FXML
    private TextField customerIdTF;

    @FXML
    private TableColumn<BranchManagerGoal4Processor, String> customerNameTC;

    @FXML
    private TableColumn<BranchManagerGoal4Processor, String> agentNameTC;

    private ObservableList<BranchManagerGoal4Processor> assignmentList;

    @FXML
    public void initialize() {

        assignmentList = FXCollections.observableArrayList();

        agentCB.setItems(FXCollections.observableArrayList(
                "101 - Rahim Ahmed",
                "102 - Karim Hasan",
                "103 - Nashua Haque"
        ));

        priorityCB.setItems(FXCollections.observableArrayList(
                "High",
                "Medium",
                "Low"
        ));

        customerIdTC.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        customerNameTC.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        agentIdTC.setCellValueFactory(new PropertyValueFactory<>("agentId"));
        agentNameTC.setCellValueFactory(new PropertyValueFactory<>("agentName"));
        priorityTC.setCellValueFactory(new PropertyValueFactory<>("priority"));
        assignmentDateTC.setCellValueFactory(new PropertyValueFactory<>("assignmentDate"));

        tableView.setItems(assignmentList);
    }

    @FXML
    public void assignOA(ActionEvent event) {

        if (customerIdTF.getText().isEmpty()
                || agentCB.getValue() == null
                || priorityCB.getValue() == null) {

            new Alert(Alert.AlertType.ERROR,
                    "Please complete all fields.")
                    .show();
            return;
        }

        String[] agentInfo = agentCB.getValue().split(" - ");

        int agentId = Integer.parseInt(agentInfo[0]);
        String agentName = agentInfo[1];

        int customerId = Integer.parseInt(customerIdTF.getText());

        BranchManagerGoal4Processor assignment =
                new BranchManagerGoal4Processor(
                        customerId,
                        "Customer " + customerId,
                        agentId,
                        agentName,
                        priorityCB.getValue(),
                        LocalDate.now().toString()
                );

        assignmentList.add(assignment);

        customerIdTF.clear();
        agentCB.getSelectionModel().clearSelection();
        priorityCB.getSelectionModel().clearSelection();

        new Alert(Alert.AlertType.INFORMATION,
                "Customer assigned successfully.")
                .show();
    }

    @FXML
    public void refreshOA(ActionEvent event) {

        tableView.setItems(assignmentList);

        customerIdTF.clear();
        agentCB.getSelectionModel().clearSelection();
        priorityCB.getSelectionModel().clearSelection();
    }
}