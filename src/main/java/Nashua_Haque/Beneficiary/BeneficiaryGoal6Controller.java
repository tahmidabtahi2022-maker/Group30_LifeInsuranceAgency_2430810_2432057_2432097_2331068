package Nashua_Haque.Beneficiary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class BeneficiaryGoal6Controller {

    @FXML
    private TableColumn<BeneficiaryGoal6Processor, String> timeTC;

    @FXML
    private TableColumn<BeneficiaryGoal6Processor, String> titleTC;

    @FXML
    private ComboBox<String> filterCB;

    @FXML
    private TableColumn<BeneficiaryGoal6Processor, String> typeTC;

    @FXML
    private TextField priorityTF;

    @FXML
    private TableColumn<BeneficiaryGoal6Processor, String> statusTC;

    @FXML
    private TableView<BeneficiaryGoal6Processor> tableView;

    @FXML
    private DatePicker dateDP;

    @FXML
    private TableColumn<BeneficiaryGoal6Processor, Integer> beneficiaryIdTC;

    @FXML
    private TableColumn<BeneficiaryGoal6Processor, String> dateTC;

    @FXML
    private TableColumn<BeneficiaryGoal6Processor, Integer> notificationIdTC;

    private ObservableList<BeneficiaryGoal6Processor> notificationList;

    @FXML
    public void initialize() {

        notificationList = FXCollections.observableArrayList();

        filterCB.setItems(FXCollections.observableArrayList(
                "All",
                "Claim",
                "Policy",
                "Payment",
                "General"
        ));

        notificationIdTC.setCellValueFactory(new PropertyValueFactory<>("notificationId"));
        beneficiaryIdTC.setCellValueFactory(new PropertyValueFactory<>("beneficiaryId"));
        titleTC.setCellValueFactory(new PropertyValueFactory<>("title"));
        typeTC.setCellValueFactory(new PropertyValueFactory<>("type"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeTC.setCellValueFactory(new PropertyValueFactory<>("time"));

        notificationList.addAll(

                new BeneficiaryGoal6Processor(
                        1,101,
                        "Claim Submitted",
                        "Claim",
                        "Unread",
                        "2026-08-07",
                        "10:00 AM",
                        "High"
                ),

                new BeneficiaryGoal6Processor(
                        2,101,
                        "Policy Approved",
                        "Policy",
                        "Read",
                        "2026-08-06",
                        "02:30 PM",
                        "Medium"
                ),

                new BeneficiaryGoal6Processor(
                        3,102,
                        "Payment Received",
                        "Payment",
                        "Unread",
                        "2026-08-05",
                        "09:15 AM",
                        "Low"
                )
        );

        tableView.setItems(notificationList);
    }

    @FXML
    public void refreshOA(ActionEvent actionEvent) {

        tableView.setItems(notificationList);

        priorityTF.clear();
        filterCB.getSelectionModel().clearSelection();
        dateDP.setValue(null);
    }

    @FXML
    public void viewOA(ActionEvent actionEvent) {

        ObservableList<BeneficiaryGoal6Processor> filtered =
                FXCollections.observableArrayList();

        for (BeneficiaryGoal6Processor n : notificationList) {

            boolean match = true;

            if (filterCB.getValue() != null &&
                    !filterCB.getValue().equals("All")) {

                match &= n.getType().equals(filterCB.getValue());
            }

            if (!priorityTF.getText().isEmpty()) {

                match &= n.getPriority().equalsIgnoreCase(priorityTF.getText());
            }

            if (dateDP.getValue() != null) {

                match &= n.getDate().equals(dateDP.getValue().toString());
            }

            if (match) {
                filtered.add(n);
            }
        }

        tableView.setItems(filtered);

        BeneficiaryGoal6Processor selected =
                tableView.getSelectionModel().getSelectedItem();

        if (selected != null) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setHeaderText("Notification");

            alert.setContentText(
                    "Notification ID : " + selected.getNotificationId() +
                            "\nBeneficiary ID : " + selected.getBeneficiaryId() +
                            "\nTitle : " + selected.getTitle() +
                            "\nType : " + selected.getType() +
                            "\nStatus : " + selected.getStatus() +
                            "\nDate : " + selected.getDate() +
                            "\nTime : " + selected.getTime() +
                            "\nPriority : " + selected.getPriority()
            );

            alert.show();
        }
    }
}