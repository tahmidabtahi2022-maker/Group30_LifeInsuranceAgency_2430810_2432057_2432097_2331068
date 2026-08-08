package Nashua_Haque.Beneficiary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class BeneficiaryGoal4Controller {

    @FXML
    private TableColumn<BeneficiaryGoal4Processor, String> remarksTC2;

    @FXML
    private TableColumn<BeneficiaryGoal4Processor, String> remarksTC3;

    @FXML
    private TableColumn<BeneficiaryGoal4Processor, String> verifiedTC;

    @FXML
    private TableView<BeneficiaryGoal4Processor> tableView;

    @FXML
    private DatePicker dateDP;

    @FXML
    private TableColumn<BeneficiaryGoal4Processor, String> dateTC;

    @FXML
    private ComboBox<String> documentTypeCB;

    @FXML
    private TableColumn<BeneficiaryGoal4Processor, Double> sizeTC;

    @FXML
    private TableColumn<BeneficiaryGoal4Processor, String> fileFormatTC;

    @FXML
    private TextField claimTF;

    @FXML
    private TableColumn<BeneficiaryGoal4Processor, String> statusTC;

    @FXML
    private TableColumn<BeneficiaryGoal4Processor, String> fileNameTC;

    @FXML
    private ComboBox<String> uploadStatusCB;

    @FXML
    private TableColumn<BeneficiaryGoal4Processor, String> remarksTC1;

    private ObservableList<BeneficiaryGoal4Processor> documentList;

    @FXML
    public void initialize() {

        documentList = FXCollections.observableArrayList();

        documentTypeCB.setItems(FXCollections.observableArrayList(
                "Death Certificate",
                "National ID",
                "Medical Report",
                "Insurance Form"
        ));

        uploadStatusCB.setItems(FXCollections.observableArrayList(
                "Uploaded",
                "Pending"
        ));

        fileNameTC.setCellValueFactory(new PropertyValueFactory<>("fileName"));
        fileFormatTC.setCellValueFactory(new PropertyValueFactory<>("fileFormat"));
        sizeTC.setCellValueFactory(new PropertyValueFactory<>("size"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("uploadStatus"));
        verifiedTC.setCellValueFactory(new PropertyValueFactory<>("verified"));
        remarksTC1.setCellValueFactory(new PropertyValueFactory<>("remarks1"));
        remarksTC2.setCellValueFactory(new PropertyValueFactory<>("remarks2"));
        remarksTC3.setCellValueFactory(new PropertyValueFactory<>("remarks3"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));

        tableView.setItems(documentList);
    }

    @FXML
    public void uploadOA(ActionEvent event) {

        if (claimTF.getText().isEmpty()
                || documentTypeCB.getValue() == null
                || uploadStatusCB.getValue() == null
                || dateDP.getValue() == null) {

            new Alert(Alert.AlertType.ERROR,
                    "Please complete all fields.")
                    .show();
            return;
        }

        String fileName = "Claim_" + claimTF.getText() + ".pdf";

        BeneficiaryGoal4Processor document =
                new BeneficiaryGoal4Processor(
                        fileName,
                        "PDF",
                        2.5,
                        documentTypeCB.getValue(),
                        uploadStatusCB.getValue(),
                        "Pending",
                        "Waiting",
                        "-",
                        "-",
                        dateDP.getValue().toString()
                );

        documentList.add(document);

        claimTF.clear();
        documentTypeCB.getSelectionModel().clearSelection();
        uploadStatusCB.getSelectionModel().clearSelection();
        dateDP.setValue(null);

        new Alert(Alert.AlertType.INFORMATION,
                "Document uploaded successfully.")
                .show();
    }
}