package Nashua_Haque.Branch_Manager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class BranchManagerGoal3Controller {

    @FXML
    private TableColumn<BranchManagerGoal3Processor, Integer> requestIdTC;

    @FXML
    private TableColumn<BranchManagerGoal3Processor, Integer> agentIdTC;

    @FXML
    private TableColumn<BranchManagerGoal3Processor, String> agentNameTC;

    @FXML
    private TableColumn<BranchManagerGoal3Processor, String> requestTypeTC;

    @FXML
    private TableColumn<BranchManagerGoal3Processor, String> requestDateTC;

    @FXML
    private TableColumn<BranchManagerGoal3Processor, String> statusTC;

    @FXML
    private ComboBox<String> statusCB;

    @FXML
    private ComboBox<String> requestTypeCB;

    @FXML
    private TableView<BranchManagerGoal3Processor> tableView;

    private ObservableList<BranchManagerGoal3Processor> requestList;

    @FXML
    public void initialize() {

        requestList = FXCollections.observableArrayList();

        statusCB.setItems(FXCollections.observableArrayList(
                "Pending",
                "Approved",
                "Rejected"
        ));

        requestTypeCB.setItems(FXCollections.observableArrayList(
                "Leave",
                "Transfer",
                "Policy Update",
                "Commission"
        ));

        requestIdTC.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        agentIdTC.setCellValueFactory(new PropertyValueFactory<>("agentId"));
        agentNameTC.setCellValueFactory(new PropertyValueFactory<>("agentName"));
        requestTypeTC.setCellValueFactory(new PropertyValueFactory<>("requestType"));
        requestDateTC.setCellValueFactory(new PropertyValueFactory<>("requestDate"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

        requestList.addAll(
                new BranchManagerGoal3Processor(1,101,"Rahim Ahmed","Leave","2026-08-01","Pending"),
                new BranchManagerGoal3Processor(2,102,"Karim Hasan","Transfer","2026-08-02","Pending"),
                new BranchManagerGoal3Processor(3,103,"Nashua Haque","Commission","2026-08-04","Approved")
        );

        tableView.setItems(requestList);
    }

    @FXML
    public void approveOA(ActionEvent event) {

        BranchManagerGoal3Processor selected =
                tableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            new Alert(Alert.AlertType.WARNING,
                    "Please select a request.")
                    .show();
            return;
        }

        selected.setStatus("Approved");
        tableView.refresh();

        new Alert(Alert.AlertType.INFORMATION,
                "Request approved successfully.")
                .show();
    }

    @FXML
    public void rejectOA(ActionEvent event) {

        BranchManagerGoal3Processor selected =
                tableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            new Alert(Alert.AlertType.WARNING,
                    "Please select a request.")
                    .show();
            return;
        }

        selected.setStatus("Rejected");
        tableView.refresh();

        new Alert(Alert.AlertType.INFORMATION,
                "Request rejected successfully.")
                .show();
    }

    @FXML
    public void refreshOA(ActionEvent event) {

        ObservableList<BranchManagerGoal3Processor> filtered =
                FXCollections.observableArrayList();

        for (BranchManagerGoal3Processor request : requestList) {

            boolean match = true;

            if (statusCB.getValue() != null) {
                match &= request.getStatus().equals(statusCB.getValue());
            }

            if (requestTypeCB.getValue() != null) {
                match &= request.getRequestType().equals(requestTypeCB.getValue());
            }

            if (match) {
                filtered.add(request);
            }
        }

        tableView.setItems(filtered);

        if (statusCB.getValue() == null && requestTypeCB.getValue() == null) {
            tableView.setItems(requestList);
        }
    }
}