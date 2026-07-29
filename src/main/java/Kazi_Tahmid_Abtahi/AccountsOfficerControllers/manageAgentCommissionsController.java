package Kazi_Tahmid_Abtahi.AccountsOfficerControllers;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class manageAgentCommissionsController
{
    @javafx.fxml.FXML
    private TableColumn policyTypeTC;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private TableColumn premiumCollectedTC;
    @javafx.fxml.FXML
    private Label statusMessageLabel;
    @javafx.fxml.FXML
    private TableColumn calculatedCommissionTC;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private ComboBox agentIdCB;
    @javafx.fxml.FXML
    private TableView agentCommissionsTableView;
    @javafx.fxml.FXML
    private TableColumn policyIdTC;
    @javafx.fxml.FXML
    private TableColumn commissionRateTC;
    @javafx.fxml.FXML
    private Label totalCommissionShowingLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void processCommissionPayoutButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadPoliciesAndCalculateButtonOnAction(ActionEvent actionEvent) {
    }
}