package Fuad_Bin_Omar.CustomerServiceRepresentative;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class BeneficiaryUpdateViewController
{
    @javafx.fxml.FXML
    private TableColumn<BeneficiaryUpdateViewProcessing, String> BeneficiaryNameColumn;
    @javafx.fxml.FXML
    private TextArea RemarksTextArea;
    @javafx.fxml.FXML
    private TextField AllocationPercentageTextfield;
    @javafx.fxml.FXML
    private TextField SecurityIDTextfield;
    @javafx.fxml.FXML
    private TableView<BeneficiaryUpdateViewProcessing> Tableview;
    @javafx.fxml.FXML
    private TextField BeneficiaryNameTextfield;
    @javafx.fxml.FXML
    private TextField PolicyIDTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> RelationshipComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> DocumentTypeCombobox;
    @javafx.fxml.FXML
    private TableColumn<BeneficiaryUpdateViewProcessing, String> DocumentTypeColumn;
    @javafx.fxml.FXML
    private TableColumn<BeneficiaryUpdateViewProcessing, Float> TotalAllocationColumn;
    @javafx.fxml.FXML
    private TableColumn<BeneficiaryUpdateViewProcessing, String> ConfirmationColumn;
    @javafx.fxml.FXML
    private TableColumn<BeneficiaryUpdateViewProcessing, String> SecurityIDColumn;

    private ArrayList<BeneficiaryUpdateViewProcessing> beneficiaryList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<BeneficiaryUpdateViewProcessing, String> PolicyIDColumn;


    @javafx.fxml.FXML
    public void initialize() {
        RelationshipComboBox.getItems().addAll("Spouse", "Father", "Mother", "Son", "Daughter", "Brother", "Sister", "Other");
        DocumentTypeCombobox.getItems().addAll("National ID", "Passport", "Birth Certificate", "Driving License");

        BeneficiaryNameColumn.setCellValueFactory(new PropertyValueFactory<>("BeneficiaryName"));
        SecurityIDColumn.setCellValueFactory(new PropertyValueFactory<>("SecurityID"));
        TotalAllocationColumn.setCellValueFactory(new PropertyValueFactory<>("TotalAllocation"));
        DocumentTypeColumn.setCellValueFactory(new PropertyValueFactory<>("DocumentType"));
        ConfirmationColumn.setCellValueFactory(new PropertyValueFactory<>("StatusConfirmation"));
        PolicyIDColumn.setCellValueFactory(new PropertyValueFactory<>("PolicyID"));
    }

    @javafx.fxml.FXML
    public void RefreshButton(ActionEvent actionEvent) {
        Tableview.getItems().clear();
    }

    @javafx.fxml.FXML
    public void ProcessBeneficiaryButton(ActionEvent actionEvent) {

        // Validation
        if (PolicyIDTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Policy ID is required!");
            a.showAndWait();
            return;
        }

        if (BeneficiaryNameTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Beneficiary Name is required!");
            a.showAndWait();
            return;
        }

        if (RelationshipComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select a Relationship!");
            a.showAndWait();
            return;
        }

        if (DocumentTypeCombobox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select a Document Type!");
            a.showAndWait();
            return;
        }

        // Create Instance
        BeneficiaryUpdateViewProcessing beneficiary =
                new BeneficiaryUpdateViewProcessing(

                        BeneficiaryNameTextfield.getText(),
                        RelationshipComboBox.getValue(),
                        DocumentTypeCombobox.getValue(),
                        PolicyIDTextfield.getText(),
                        SecurityIDTextfield.getText(),
                        "Pending",
                        RemarksTextArea.getText(),
                        Float.parseFloat(AllocationPercentageTextfield.getText()),
                        Float.parseFloat(AllocationPercentageTextfield.getText())
                );

        // Add to TableView
        beneficiaryList.add(beneficiary);
        Tableview.getItems().add(beneficiary);


        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Beneficiary information added successfully.");
        a.showAndWait();

    }


    @javafx.fxml.FXML
    public void SearchButton(ActionEvent actionEvent) {
        String policyID = PolicyIDTextfield.getText().trim();

        for (BeneficiaryUpdateViewProcessing b : beneficiaryList) {

            if (b.getPolicyID().equalsIgnoreCase(policyID)) {

                Tableview.getItems().clear();
                Tableview.getItems().add(b);

                return;
            }
        }

        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText("Policy ID not found!");
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void ClearButton(ActionEvent actionEvent) {
        PolicyIDTextfield.clear();
        BeneficiaryNameTextfield.clear();
        SecurityIDTextfield.clear();
        AllocationPercentageTextfield.clear();
        RemarksTextArea.clear();

        RelationshipComboBox.getSelectionModel().clearSelection();
        DocumentTypeCombobox.getSelectionModel().clearSelection();
    }
}