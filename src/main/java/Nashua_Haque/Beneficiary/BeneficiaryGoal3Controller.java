package Nashua_Haque.Beneficiary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class BeneficiaryGoal3Controller {

    @FXML
    private TextField beneficiaryIdTF;

    @FXML
    private TableColumn<BeneficiaryGoal3Processor,String> referenceTC;

    @FXML
    private TableColumn<BeneficiaryGoal3Processor,String> remarksTC;

    @FXML
    private TextField numberTF;

    @FXML
    private TableColumn<BeneficiaryGoal3Processor,Integer> policyNumberTc;

    @FXML
    private TableView<BeneficiaryGoal3Processor> tableView;

    @FXML
    private TableColumn<BeneficiaryGoal3Processor,Double> claimAmountTC;

    @FXML
    private DatePicker dateDP;

    @FXML
    private TableColumn<BeneficiaryGoal3Processor,Integer> beneficiaryIdTC;

    @FXML
    private TableColumn<BeneficiaryGoal3Processor,String> dateTC;

    private ObservableList<BeneficiaryGoal3Processor> claimList;

    @FXML
    public void initialize() {

        claimList = FXCollections.observableArrayList();

        beneficiaryIdTC.setCellValueFactory(new PropertyValueFactory<>("beneficiaryId"));
        policyNumberTc.setCellValueFactory(new PropertyValueFactory<>("policyNumber"));
        referenceTC.setCellValueFactory(new PropertyValueFactory<>("reference"));
        claimAmountTC.setCellValueFactory(new PropertyValueFactory<>("claimAmount"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        remarksTC.setCellValueFactory(new PropertyValueFactory<>("remarks"));

        claimList.add(new BeneficiaryGoal3Processor(
                1,
                1001,
                "REF-1001",
                250000,
                "07-08-2026",
                "Submitted"
        ));

        claimList.add(new BeneficiaryGoal3Processor(
                2,
                1002,
                "REF-1002",
                350000,
                "05-08-2026",
                "Under Review"
        ));

        tableView.setItems(claimList);
    }

    @FXML
    public void searchOA(ActionEvent event) {

        ObservableList<BeneficiaryGoal3Processor> filtered =
                FXCollections.observableArrayList();

        for(BeneficiaryGoal3Processor c : claimList){

            boolean match = true;

            if(!beneficiaryIdTF.getText().isEmpty()){
                match &= String.valueOf(c.getBeneficiaryId())
                        .equals(beneficiaryIdTF.getText());
            }

            if(!numberTF.getText().isEmpty()){
                match &= String.valueOf(c.getPolicyNumber())
                        .equals(numberTF.getText());
            }

            if(dateDP.getValue()!=null){
                match &= c.getDate()
                        .equals(dateDP.getValue().toString());
            }

            if(match){
                filtered.add(c);
            }
        }

        tableView.setItems(filtered);
    }

    @FXML
    public void refreshOA(ActionEvent event) {

        tableView.setItems(claimList);

        beneficiaryIdTF.clear();
        numberTF.clear();
        dateDP.setValue(null);

    }

    @FXML
    public void detailsOA(ActionEvent event) {

        BeneficiaryGoal3Processor selected =
                tableView.getSelectionModel().getSelectedItem();

        if(selected==null){

            new Alert(Alert.AlertType.WARNING,
                    "Select a claim first.")
                    .show();

            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setHeaderText("Claim Request");

        alert.setContentText(
                "Beneficiary ID : " + selected.getBeneficiaryId() +
                        "\nPolicy Number : " + selected.getPolicyNumber() +
                        "\nReference : " + selected.getReference() +
                        "\nClaim Amount : " + selected.getClaimAmount() +
                        "\nDate : " + selected.getDate() +
                        "\nRemarks : " + selected.getRemarks()
        );

        alert.show();

    }

    @FXML
    public void backOA(ActionEvent actionEvent) {
    }
}