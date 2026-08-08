package Kazi_Tahmid_Abtahi.CustomerControllers;

import Kazi_Tahmid_Abtahi.Model_Classes.Customer;
import Kazi_Tahmid_Abtahi.Model_Classes.Policy;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class customerPortfolioController
{
    @javafx.fxml.FXML
    private TableView<Policy> customerOwnedPolicyDataTableview;
    @javafx.fxml.FXML
    private TableColumn<Policy,String> policyTypeTC;
    @javafx.fxml.FXML
    private ComboBox<String> statusFilterCB;
    @javafx.fxml.FXML
    private ComboBox<String> policyTypeFilterCB;
    @javafx.fxml.FXML
    private TableColumn<Policy,String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<Policy,String> policyIdTC;
    @javafx.fxml.FXML
    private TextField policyIdFilterTF;
    @javafx.fxml.FXML
    private TableColumn<Policy,Float> coverageAmountTC;
    @javafx.fxml.FXML
    private TableColumn<Policy,Float> totalCashValueTC;

    private String userEmail;
    private final ArrayList<Policy> customerPolicyList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        statusFilterCB.getItems().addAll("Active", "Lapsed", "Matured");
        policyTypeFilterCB.getItems().addAll("Life Insurance", "Health Insurance", "Term Insurance");

        policyIdTC.setCellValueFactory(new PropertyValueFactory<>("policyId"));
        policyTypeTC.setCellValueFactory(new PropertyValueFactory<>("policyType"));
        coverageAmountTC.setCellValueFactory(new PropertyValueFactory<>("coverageAmount"));
        totalCashValueTC.setCellValueFactory(new PropertyValueFactory<>("totalCashValue"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @javafx.fxml.FXML
    public void applyFiltersButtonOnAction(ActionEvent actionEvent) {
        customerOwnedPolicyDataTableview.getItems().clear();

        for (Policy policy : customerPolicyList) {
            boolean matchesId = policy.getPolicyId().contains(policyIdFilterTF.getText());
            boolean matchesStatus = policy.getStatus().equals(statusFilterCB.getValue());
            boolean matchesType = policy.getPolicyType().equalsIgnoreCase(policyTypeFilterCB.getValue());

            if (matchesId && matchesStatus && matchesType) {
                customerOwnedPolicyDataTableview.getItems().add(policy);
            }
        }
    }

    @javafx.fxml.FXML
    public void resetFilterButtonOnAction(ActionEvent actionEvent) {
        policyIdFilterTF.clear();
        statusFilterCB.setValue(null);
        policyTypeFilterCB.setValue(null);

        customerOwnedPolicyDataTableview.getItems().clear();
        customerOwnedPolicyDataTableview.getItems().addAll(customerPolicyList);
    }

    public void receiveUserEmail(String email) {
        this.userEmail = email;
        loadCustomerPoliciesFromFile();
    }


    private void loadCustomerPoliciesFromFile() {
        customerPolicyList.clear();
        customerOwnedPolicyDataTableview.getItems().clear();

        try{
            File f = new File("PolicyInfo.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                Policy policy = (Policy) ois.readObject();
                if (policy.getCustomerId().equals(lookupCustomerId(this.userEmail)) || policy.getCustomerId().equals(this.userEmail)) {
                    customerPolicyList.add(policy);
                }
            }
        } catch (Exception e) {
            //
        }
        customerOwnedPolicyDataTableview.getItems().addAll(customerPolicyList);
    }

    private String lookupCustomerId(String email) {
        try {
            File f = new File("CustomerInfo.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                Customer c = (Customer) ois.readObject();
                if (c.getEmailAddress().equals(email)) {
                    return c.getUserId();
                }
            }
        } catch (Exception e) {
            //
        }
        return null;
    }
}