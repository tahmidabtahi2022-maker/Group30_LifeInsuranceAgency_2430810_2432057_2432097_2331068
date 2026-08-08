package Nashua_Haque.Beneficiary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class BeneficiaryGoal1Controller {

    @FXML
    private TableColumn<BeneficiaryGoal1Processor, Integer> beneficiaryIdTC;

    @FXML
    private TableColumn<BeneficiaryGoal1Processor, String> emailTC;

    @FXML
    private TextField emailTF;

    @FXML
    private TableColumn<BeneficiaryGoal1Processor, String> fullNameTC;

    @FXML
    private ComboBox<String> genderCB;

    @FXML
    private TextField nameTF;

    @FXML
    private TableColumn<BeneficiaryGoal1Processor, Integer> phoneTC;

    @FXML
    private TextField phoneTF;

    @FXML
    private TableColumn<BeneficiaryGoal1Processor, String> policyReferenceTc;

    @FXML
    private TableColumn<BeneficiaryGoal1Processor, String> registrationStatusTC;

    @FXML
    private TableView<BeneficiaryGoal1Processor> tableView;

    private ObservableList<BeneficiaryGoal1Processor> beneficiaryList;

    private int id = 1;

    @FXML
    public void initialize() {

        beneficiaryList = FXCollections.observableArrayList();
        genderCB.getItems().addAll("Male","Female", "Others");

        beneficiaryIdTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        fullNameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailTC.setCellValueFactory(new PropertyValueFactory<>("email"));
        phoneTC.setCellValueFactory(new PropertyValueFactory<>("phone_number"));
        policyReferenceTc.setCellValueFactory(new PropertyValueFactory<>("policy_refference"));
        registrationStatusTC.setCellValueFactory(new PropertyValueFactory<>("registration_status"));

        tableView.setItems(beneficiaryList);
    }

    @FXML
    void registerOA(ActionEvent event) {

        if(nameTF.getText().isEmpty() || emailTF.getText().isEmpty() || phoneTF.getText().isEmpty() || genderCB.getValue()==null){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Fill up all fields.");
            alert.show();
            return;
        }

        try{

            int phone = Integer.parseInt(phoneTF.getText());

            String policyReference = "POL-" + id;

            BeneficiaryGoal1Processor beneficiary =
                    new BeneficiaryGoal1Processor(
                            id,
                            nameTF.getText(),
                            emailTF.getText(),
                            phone,
                            genderCB.getValue(),
                            policyReference,
                            "Registered"
                    );

            beneficiaryList.add(beneficiary);

            id++;

            clearFields();

        }catch(NumberFormatException e){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Phone number must be numeric.");
            alert.show();

        }

    }

    @FXML
    void clearOA(ActionEvent event) {
        clearFields();
    }

    private void clearFields(){

        nameTF.clear();
        emailTF.clear();
        phoneTF.clear();
        genderCB.getSelectionModel().clearSelection();

    }

}