package Kazi_Tahmid_Abtahi.CustomerControllers;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class customerPortfolioController
{
    @javafx.fxml.FXML
    private TableView customerOwnedPolicyDataTableview;
    @javafx.fxml.FXML
    private ComboBox statusFilterCB;
    @javafx.fxml.FXML
    private ComboBox policyTypeFilterCB;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn policyIdTC;
    @javafx.fxml.FXML
    private TableColumn insuranceTypeTC;
    @javafx.fxml.FXML
    private TableColumn totalFaceValueTC;
    @javafx.fxml.FXML
    private TableColumn accumulatedCashValueTC;
    @javafx.fxml.FXML
    private TextField policyIdFilterTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void applyFiltersButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void resetFilterButtonOnAction(ActionEvent actionEvent) {
    }
}