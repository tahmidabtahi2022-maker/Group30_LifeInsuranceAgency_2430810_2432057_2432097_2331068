package Fuad_Bin_Omar.SystemAdministratorController;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class ManageAccountsController
{
    @javafx.fxml.FXML
    private TextField EmailTextfield;
    @javafx.fxml.FXML
    private TableColumn<ManageAccountsProcessing, Integer> SerialNumberColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageAccountsProcessing, String> StatusColumn;
    @javafx.fxml.FXML
    private ComboBox<String> RoleFilterComboBox;
    @javafx.fxml.FXML
    private TableColumn<ManageAccountsProcessing, String> EmailColumn;
    @javafx.fxml.FXML
    private TextField SerialNumberTextfield;
    @javafx.fxml.FXML
    private TextField SearchAccountTextfield;
    @javafx.fxml.FXML
    private TableColumn<ManageAccountsProcessing, String> RoleFilterColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageAccountsProcessing, String> FullNameColumn;
    @javafx.fxml.FXML
    private ComboBox<String> StatusFilterComboBox;
    @javafx.fxml.FXML
    private TextField FullNameTextfield;
    @javafx.fxml.FXML
    private TableView<ManageAccountsProcessing> TableView;

    private ArrayList<ManageAccountsProcessing> accountList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {


        RoleFilterComboBox.getItems().addAll("Admin", "Customer Service Representative", "Agent", "Customer");
        StatusFilterComboBox.getItems().addAll("ACTIVE", "DISABLED");

        FullNameColumn.setCellValueFactory(new PropertyValueFactory<>("FullName"));
        SerialNumberColumn.setCellValueFactory(new PropertyValueFactory<>("SerialNumber"));
        StatusColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));
        RoleFilterColumn.setCellValueFactory(new PropertyValueFactory<>("RoleFilter"));
        EmailColumn.setCellValueFactory(new PropertyValueFactory<>("Email"));

    }

    @javafx.fxml.FXML
    public void AddNewAccountButton(ActionEvent actionEvent) {

        if (FullNameTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Full Name is required!");
            a.showAndWait();
            return;
        }

        if (SerialNumberTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Serial Number is required!");
            a.showAndWait();
            return;
        }

        if (EmailTextfield.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Email is required!");
            a.showAndWait();
            return;
        }

        if (RoleFilterComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select a Role!");
            a.showAndWait();
            return;
        }

        if (StatusFilterComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select a Status!");
            a.showAndWait();
            return;
        }


        ManageAccountsProcessing account =
                new ManageAccountsProcessing(

                        FullNameTextfield.getText(),
                        StatusFilterComboBox.getValue(),
                        RoleFilterComboBox.getValue(),
                        EmailTextfield.getText(),
                        Integer.parseInt(SerialNumberTextfield.getText())
                );


        accountList.add(account);
        TableView.getItems().add(account);


        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("New account added successfully.");
        a.showAndWait();



    }

    @javafx.fxml.FXML
    public void DeactivateAccountButton(ActionEvent actionEvent) {
    }
}