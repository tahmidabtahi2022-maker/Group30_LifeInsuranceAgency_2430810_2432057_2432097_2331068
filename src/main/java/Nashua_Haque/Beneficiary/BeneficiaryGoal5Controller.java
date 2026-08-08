package Nashua_Haque.Beneficiary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class BeneficiaryGoal5Controller {

    @FXML
    private TextField claimTF;

    @FXML
    private TableColumn<BeneficiaryGoal5Processor,Integer> policyNumberTC;

    @FXML
    private TableColumn<BeneficiaryGoal5Processor,String> claimStatusTC;

    @FXML
    private TableColumn<BeneficiaryGoal5Processor,Integer> claimIdTC;

    @FXML
    private TableColumn<BeneficiaryGoal5Processor,String> claimTypeTC;

    @FXML
    private TableColumn<BeneficiaryGoal5Processor,String> beneficiaryNameTC;

    @FXML
    private ComboBox<String> statusCB;

    @FXML
    private TableView<BeneficiaryGoal5Processor> tableView;

    @FXML
    private TableColumn<BeneficiaryGoal5Processor,String> lastUpdatedTC;

    @FXML
    private DatePicker dateDP;

    @FXML
    private TableColumn<BeneficiaryGoal5Processor,Integer> beneficiaryIdTC;

    private ObservableList<BeneficiaryGoal5Processor> claimList;

    @FXML
    public void initialize() {

        claimList = FXCollections.observableArrayList();

        statusCB.setItems(FXCollections.observableArrayList(
                "Submitted",
                "Under Review",
                "Approved",
                "Rejected",
                "Paid"

        ));

        claimIdTC.setCellValueFactory(new PropertyValueFactory<>("claimId"));
        beneficiaryIdTC.setCellValueFactory(new PropertyValueFactory<>("beneficiaryId"));
        beneficiaryNameTC.setCellValueFactory(new PropertyValueFactory<>("beneficiaryName"));
        policyNumberTC.setCellValueFactory(new PropertyValueFactory<>("policyNumber"));
        claimTypeTC.setCellValueFactory(new PropertyValueFactory<>("claimType"));
        claimStatusTC.setCellValueFactory(new PropertyValueFactory<>("claimStatus"));
        lastUpdatedTC.setCellValueFactory(new PropertyValueFactory<>("lastUpdated"));

        claimList.addAll(
                new BeneficiaryGoal5Processor(101,1,"Nashua Haque",1001,"Death Claim","Submitted","2026-08-01"),
                new BeneficiaryGoal5Processor(102,2,"Rahim Ahmed",1002,"Medical Claim","Approved","2026-08-03"),
                new BeneficiaryGoal5Processor(103,3,"Karim Hasan",1003,"Accident Claim","Under Review","2026-08-05"),
                new BeneficiaryGoal5Processor(104,4,"Sara Akter",1004,"Death Claim","Paid","2026-08-06")
        );

        tableView.setItems(claimList);
    }

    @FXML
    public void searchOA(ActionEvent actionEvent) {

        ObservableList<BeneficiaryGoal5Processor> filtered =
                FXCollections.observableArrayList();

        for (BeneficiaryGoal5Processor claim : claimList) {

            boolean match = true;

            if (!claimTF.getText().isEmpty()) {
                match &= String.valueOf(claim.getClaimId())
                        .equals(claimTF.getText());
            }

            if (statusCB.getValue() != null) {
                match &= claim.getClaimStatus()
                        .equals(statusCB.getValue());
            }

            if (dateDP.getValue() != null) {
                match &= claim.getLastUpdated()
                        .equals(dateDP.getValue().toString());
            }

            if (match) {
                filtered.add(claim);
            }
        }

        tableView.setItems(filtered);
    }

    @FXML
    public void refreshOA(ActionEvent actionEvent) {

        tableView.setItems(claimList);

        claimTF.clear();
        statusCB.getSelectionModel().clearSelection();
        dateDP.setValue(null);
    }
}