package Nashua_Haque.Beneficiary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class BeneficiaryGoal7Controller {

    @FXML
    private TableColumn<BeneficiaryGoal7Processor, String> currentStatusTC;

    @FXML
    private DatePicker toDP;

    @FXML
    private ComboBox<String> sortByCB;

    @FXML
    private TableColumn<BeneficiaryGoal7Processor, Integer> policyNumberTC;

    @FXML
    private TableColumn<BeneficiaryGoal7Processor, Integer> claimIdTC;

    @FXML
    private TextField totalClaimsTF;

    @FXML
    private TableView<BeneficiaryGoal7Processor> tableView;

    @FXML
    private TableColumn<BeneficiaryGoal7Processor, Double> claimAmountTC;

    @FXML
    private ComboBox<String> yearCB;

    @FXML
    private TableColumn<BeneficiaryGoal7Processor, Integer> processingTimeTC;

    @FXML
    private TableColumn<BeneficiaryGoal7Processor, String> branchTC;

    @FXML
    private DatePicker fromDP;

    private ObservableList<BeneficiaryGoal7Processor> claimHistoryList;

    @FXML
    public void initialize() {

        claimHistoryList = FXCollections.observableArrayList();

        yearCB.setItems(FXCollections.observableArrayList(
                "2024",
                "2025",
                "2026"
        ));

        sortByCB.setItems(FXCollections.observableArrayList(
                "Claim ID",
                "Claim Amount",
                "Processing Time"
        ));

        claimIdTC.setCellValueFactory(new PropertyValueFactory<>("claimId"));
        policyNumberTC.setCellValueFactory(new PropertyValueFactory<>("policyNumber"));
        claimAmountTC.setCellValueFactory(new PropertyValueFactory<>("claimAmount"));
        currentStatusTC.setCellValueFactory(new PropertyValueFactory<>("currentStatus"));
        processingTimeTC.setCellValueFactory(new PropertyValueFactory<>("processingTime"));
        branchTC.setCellValueFactory(new PropertyValueFactory<>("branch"));

        claimHistoryList.addAll(
                new BeneficiaryGoal7Processor(101,1001,250000,"Approved",10,"Dhaka","2026-08-01"),
                new BeneficiaryGoal7Processor(102,1002,150000,"Paid",7,"Khulna","2026-08-03"),
                new BeneficiaryGoal7Processor(103,1003,300000,"Rejected",12,"Satkhira","2026-08-05"),
                new BeneficiaryGoal7Processor(104,1004,400000,"Under Review",5,"Dhaka","2026-08-06")
        );

        tableView.setItems(claimHistoryList);
        totalClaimsTF.setText(String.valueOf(claimHistoryList.size()));
    }

    @FXML
    public void searchOA(ActionEvent event) {

        ObservableList<BeneficiaryGoal7Processor> filtered =
                FXCollections.observableArrayList();

        for (BeneficiaryGoal7Processor claim : claimHistoryList) {

            boolean match = true;

            if (yearCB.getValue() != null) {
                match &= claim.getClaimDate().startsWith(yearCB.getValue());
            }

            if (match) {
                filtered.add(claim);
            }
        }

        tableView.setItems(filtered);
        totalClaimsTF.setText(String.valueOf(filtered.size()));
    }

    @FXML
    public void filterOA(ActionEvent event) {

        ObservableList<BeneficiaryGoal7Processor> filtered =
                FXCollections.observableArrayList();

        for (BeneficiaryGoal7Processor claim : claimHistoryList) {

            boolean match = true;

            if (fromDP.getValue() != null) {
                match &= claim.getClaimDate().compareTo(fromDP.getValue().toString()) >= 0;
            }

            if (toDP.getValue() != null) {
                match &= claim.getClaimDate().compareTo(toDP.getValue().toString()) <= 0;
            }

            if (match) {
                filtered.add(claim);
            }
        }

        tableView.setItems(filtered);
        totalClaimsTF.setText(String.valueOf(filtered.size()));
    }

    @FXML
    public void refreshOA(ActionEvent event) {

        tableView.setItems(claimHistoryList);

        fromDP.setValue(null);
        toDP.setValue(null);

        yearCB.getSelectionModel().clearSelection();
        sortByCB.getSelectionModel().clearSelection();

        totalClaimsTF.setText(String.valueOf(claimHistoryList.size()));
    }
}