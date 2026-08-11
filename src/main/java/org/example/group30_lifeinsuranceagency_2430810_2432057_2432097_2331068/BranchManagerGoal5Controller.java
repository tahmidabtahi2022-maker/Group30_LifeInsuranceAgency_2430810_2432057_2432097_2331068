package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BranchManagerGoal5Controller
{
    @javafx.fxml.FXML
    private TableColumn<Branch, String> claimsTC;
    @javafx.fxml.FXML
    private TableColumn<Branch, String> performanceTC;
    @javafx.fxml.FXML
    private TableColumn<Branch, String> customersTC;
    @javafx.fxml.FXML
    private ComboBox<String> timePeriodCB;
    @javafx.fxml.FXML
    private TableColumn<Agents, Integer> revenueTC;
    @javafx.fxml.FXML
    private TableColumn<Branch, String> branchNameTC;
    @javafx.fxml.FXML
    private TableView<Branch> tableView;
    @javafx.fxml.FXML
    private TextField totalRevenueTF;
    @javafx.fxml.FXML
    private TableColumn<Agents, String> agentsTC;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private ComboBox<String> branchCB;
    @javafx.fxml.FXML
    private TableColumn<Branch, Integer> branchIdTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void refreshOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void resetOA(ActionEvent actionEvent) {
    }
}