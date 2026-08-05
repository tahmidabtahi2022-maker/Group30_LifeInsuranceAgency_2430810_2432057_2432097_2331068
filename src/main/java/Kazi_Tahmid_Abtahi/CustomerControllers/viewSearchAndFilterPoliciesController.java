package Kazi_Tahmid_Abtahi.CustomerControllers;

import Kazi_Tahmid_Abtahi.Model_Classes.PolicyPlan;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class viewSearchAndFilterPoliciesController
{
    @javafx.fxml.FXML
    private TableColumn<PolicyPlan,String> policyTypeTC;
    @javafx.fxml.FXML
    private TableColumn<PolicyPlan,Float> coverageAmountTC;
    @javafx.fxml.FXML
    private TableColumn<PolicyPlan,String> planNameTC;
    @javafx.fxml.FXML
    private ComboBox<String> filterPolicyTypeCB;
    @javafx.fxml.FXML
    private TextField searchPlanNameTF;
    @javafx.fxml.FXML
    private TableColumn<PolicyPlan,Integer> durationYearsTC;
    @javafx.fxml.FXML
    private TableView<PolicyPlan> availablePolicyPlansTableview;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<PolicyPlan,String> descriptionTC;

    ArrayList<PolicyPlan> planList;

    @javafx.fxml.FXML
    public void initialize() {
        filterPolicyTypeCB.getItems().addAll("Term Life", "Whole Life", "Endowment");

        coverageAmountTC.setCellValueFactory(new PropertyValueFactory<>("coverageAmount"));
        descriptionTC.setCellValueFactory(new PropertyValueFactory<>("description"));
        durationYearsTC.setCellValueFactory(new PropertyValueFactory<>("durationYears"));
        planNameTC.setCellValueFactory(new PropertyValueFactory<>("planName"));
        policyTypeTC.setCellValueFactory(new PropertyValueFactory<>("policyType"));

        planList = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void searchAndFilterButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void resetFiltersButtonOnAction(ActionEvent actionEvent) {
    }
}