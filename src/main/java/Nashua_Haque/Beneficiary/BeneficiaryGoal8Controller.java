package Nashua_Haque.Beneficiary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class BeneficiaryGoal8Controller {

    @FXML
    private TableColumn<BeneficiaryGoal8Processor, String> updatedByTC;

    @FXML
    private CheckBox receiveMailCheckBox;

    @FXML
    private TextField emailTF;

    @FXML
    private TableColumn<BeneficiaryGoal8Processor, String> fieldNameTC;

    @FXML
    private ComboBox<String> genderCB;

    @FXML
    private TableColumn<BeneficiaryGoal8Processor, String> previousValueTC;

    @FXML
    private ComboBox<String> bloodGroupCB;

    @FXML
    private TableView<BeneficiaryGoal8Processor> tableView;

    @FXML
    private TableColumn<BeneficiaryGoal8Processor, String> updatedValueTC;

    @FXML
    private TableColumn<BeneficiaryGoal8Processor, String> updatedDateTC;

    @FXML
    private TextField occupationTF;

    private ObservableList<BeneficiaryGoal8Processor> updateList;

    @FXML
    public void initialize() {

        updateList = FXCollections.observableArrayList();

        genderCB.setItems(FXCollections.observableArrayList(
                "Male",
                "Female",
                "Other"
        ));

        bloodGroupCB.setItems(FXCollections.observableArrayList(
                "A+","A-","B+","B-",
                "AB+","AB-","O+","O-"
        ));

        fieldNameTC.setCellValueFactory(new PropertyValueFactory<>("fieldName"));
        previousValueTC.setCellValueFactory(new PropertyValueFactory<>("previousValue"));
        updatedValueTC.setCellValueFactory(new PropertyValueFactory<>("updatedValue"));
        updatedByTC.setCellValueFactory(new PropertyValueFactory<>("updatedBy"));
        updatedDateTC.setCellValueFactory(new PropertyValueFactory<>("updatedDate"));

        tableView.setItems(updateList);
    }

    @FXML
    public void resetOA(ActionEvent actionEvent) {

        if(emailTF.getText().isEmpty()
                || occupationTF.getText().isEmpty()
                || genderCB.getValue()==null
                || bloodGroupCB.getValue()==null){

            new Alert(Alert.AlertType.ERROR,
                    "Please fill all fields.")
                    .show();
            return;
        }

        updateList.clear();

        updateList.add(new BeneficiaryGoal8Processor(
                "Email",
                "old@email.com",
                emailTF.getText(),
                "Beneficiary",
                LocalDate.now().toString()
        ));

        updateList.add(new BeneficiaryGoal8Processor(
                "Occupation",
                "Student",
                occupationTF.getText(),
                "Beneficiary",
                LocalDate.now().toString()
        ));

        updateList.add(new BeneficiaryGoal8Processor(
                "Gender",
                "Not Set",
                genderCB.getValue(),
                "Beneficiary",
                LocalDate.now().toString()
        ));

        updateList.add(new BeneficiaryGoal8Processor(
                "Blood Group",
                "Unknown",
                bloodGroupCB.getValue(),
                "Beneficiary",
                LocalDate.now().toString()
        ));

        updateList.add(new BeneficiaryGoal8Processor(
                "Receive Mail",
                "No",
                receiveMailCheckBox.isSelected() ? "Yes" : "No",
                "Beneficiary",
                LocalDate.now().toString()
        ));

        tableView.refresh();

        new Alert(Alert.AlertType.INFORMATION,
                "Personal details updated successfully.")
                .show();
    }

    @FXML
    public void cancelOA(ActionEvent actionEvent) {

        emailTF.clear();
        occupationTF.clear();

        genderCB.getSelectionModel().clearSelection();
        bloodGroupCB.getSelectionModel().clearSelection();

        receiveMailCheckBox.setSelected(false);

        tableView.getItems().clear();
    }
}