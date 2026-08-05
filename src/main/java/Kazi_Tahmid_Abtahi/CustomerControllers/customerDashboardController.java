package Kazi_Tahmid_Abtahi.CustomerControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068.HelloApplication;

import java.io.IOException;

public class customerDashboardController
{

    @javafx.fxml.FXML
    private AnchorPane sceneSwitchingArea;
    @javafx.fxml.FXML
    private BorderPane customerDashboardBorderpane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void comparePoliciesButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Customer/viewSearchAndFilterPoliciesView.fxml"));
        customerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void applyForNewPolicyButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Customer/applyNewPolicyView.fxml"));
        customerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void payPremiumAndDuesButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Customer/payPremiumsAndDuesView.fxml"));
        customerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void myPortfolioDashboardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Customer/customerPortfolioView.fxml"));
        customerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void manageBeneficiariesButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Customer/TrackingPolicyBeneficiariesView.fxml"));
        customerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void policyLoanAndSettingsButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Customer/policyLoanAndAPL.fxml"));
        customerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void claimsAndSurrenderTrackingButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Kazi_Tahmid_Abtahi/Customer/claimsAndSurrenderTrackingView.fxml"));
        customerDashboardBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void signOutButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginPageView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Metlife Agency");
        nextStage.setScene(scene);
        nextStage.show();
    }
}