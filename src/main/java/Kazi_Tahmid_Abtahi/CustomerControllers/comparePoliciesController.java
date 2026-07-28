package Kazi_Tahmid_Abtahi.CustomerControllers;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class comparePoliciesController
{
    @javafx.fxml.FXML
    private TableColumn policyTypeTC;
    @javafx.fxml.FXML
    private ComboBox policyTypeCB;
    @javafx.fxml.FXML
    private TableColumn estimatedYearlyPremiumTC;
    @javafx.fxml.FXML
    private TableView policyComparisonTableview;
    @javafx.fxml.FXML
    private TableColumn maturityPayoutTC;
    @javafx.fxml.FXML
    private TextField targetYearlyBudgetTF;
    @javafx.fxml.FXML
    private TableColumn totalCoverageTC;
    @javafx.fxml.FXML
    private TextField policyDurationTF;
    @javafx.fxml.FXML
    private TextField desiredCoverageAmountTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void compareAndCalculateQuotesButtonOnAction(ActionEvent actionEvent) {
    }
}