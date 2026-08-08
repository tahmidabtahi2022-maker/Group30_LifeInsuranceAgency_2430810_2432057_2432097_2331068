package Nashua_Haque.Beneficiary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class BeneficiaryGoal2Controller {

    @FXML
    private TableColumn<BeneficiaryGoal2Processor, Integer> beneficiaryIdTC;

    @FXML
    private TableColumn<BeneficiaryGoal2Processor, String> beneficiaryNameTC;

    @FXML
    private TableColumn<BeneficiaryGoal2Processor, String> beneficiaryStatusTC;

    @FXML
    private TableColumn<BeneficiaryGoal2Processor, Double> coverageAmountTC;

    @FXML
    private TextField idTF;

    @FXML
    private TextField numberTF;

    @FXML
    private TableColumn<BeneficiaryGoal2Processor, Integer> policyNumberTc;

    @FXML
    private TableColumn<BeneficiaryGoal2Processor, String> policyTypeTC;

    @FXML
    private TableColumn<BeneficiaryGoal2Processor, String> registrationDateTC;

    @FXML
    private ComboBox<String> statusCB;

    @FXML
    private TableView<BeneficiaryGoal2Processor> tableView;

    private ObservableList<BeneficiaryGoal2Processor> beneficiaryList;

    @FXML
    public void initialize() {

        beneficiaryList = FXCollections.observableArrayList();

        statusCB.setItems(
                FXCollections.observableArrayList(
                        "Registered",
                        "Pending",
                        "Approved",
                        "Rejected"
                )
        );

        beneficiaryIdTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        beneficiaryNameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        policyNumberTc.setCellValueFactory(new PropertyValueFactory<>("policy_number"));
        policyTypeTC.setCellValueFactory(new PropertyValueFactory<>("policy_type"));
        beneficiaryStatusTC.setCellValueFactory(new PropertyValueFactory<>("beneficiary_status"));
        coverageAmountTC.setCellValueFactory(new PropertyValueFactory<>("coverage_amount"));
        registrationDateTC.setCellValueFactory(new PropertyValueFactory<>("registration_date"));

        beneficiaryList.add(new BeneficiaryGoal2Processor(
                1,
                "Nashua Haque",
                1001,
                "Life Insurance",
                "Registered",
                500000,
                "07-08-2026"
        ));

        beneficiaryList.add(new BeneficiaryGoal2Processor(
                2,
                "Rahim Ahmed",
                1002,
                "Health Insurance",
                "Approved",
                750000,
                "06-08-2026"
        ));

        beneficiaryList.add(new BeneficiaryGoal2Processor(
                3,
                "Karim Hasan",
                1003,
                "Term Life",
                "Pending",
                400000,
                "05-08-2026"
        ));

        tableView.setItems(beneficiaryList);
    }

    @FXML
    void searchOA(ActionEvent event) {

        String id = idTF.getText();
        String number = numberTF.getText();
        String status = statusCB.getValue();

        ObservableList<BeneficiaryGoal2Processor> filtered =
                FXCollections.observableArrayList();

        for (BeneficiaryGoal2Processor b : beneficiaryList) {

            boolean match = true;

            if (!id.isEmpty()) {
                match &= String.valueOf(b.getId()).equals(id);
            }

            if (!number.isEmpty()) {
                match &= String.valueOf(b.getPolicy_number()).equals(number);
            }

            if (status != null) {
                match &= b.getBeneficiary_status().equals(status);
            }

            if (match) {
                filtered.add(b);
            }
        }

        tableView.setItems(filtered);
    }

    @FXML
    void refreshOA(ActionEvent event) {

        tableView.setItems(beneficiaryList);

        idTF.clear();
        numberTF.clear();
        statusCB.getSelectionModel().clearSelection();
    }

    @FXML
    void detailsOA(ActionEvent event) {

        BeneficiaryGoal2Processor selected =
                tableView.getSelectionModel().getSelectedItem();

        if (selected == null) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Please select a beneficiary.");
            alert.show();

            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setHeaderText("Beneficiary Details");

        alert.setContentText(
                "ID : " + selected.getId() +
                        "\nName : " + selected.getName() +
                        "\nPolicy : " + selected.getPolicy_number() +
                        "\nPolicy Type : " + selected.getPolicy_type() +
                        "\nStatus : " + selected.getBeneficiary_status() +
                        "\nCoverage : " + selected.getCoverage_amount() +
                        "\nRegistration Date : " + selected.getRegistration_date()
        );

        alert.show();
    }
}