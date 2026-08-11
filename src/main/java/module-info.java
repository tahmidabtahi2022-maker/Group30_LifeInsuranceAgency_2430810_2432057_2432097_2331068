module org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068 {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    opens org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068 to javafx.fxml;
    opens Kazi_Tahmid_Abtahi.CustomerControllers to javafx.fxml;
    opens Kazi_Tahmid_Abtahi.AccountsOfficerControllers to javafx.fxml;
    opens Fuad_Bin_Omar.SystemAdministratorController to javafx.fxml;

    exports org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;
    exports Fuad_Bin_Omar.SystemAdministratorController;

    exports Jamiul_Huda.InsuranceAgentControllers;
    opens Jamiul_Huda.InsuranceAgentControllers to javafx.fxml;

    exports Jamiul_Huda.ClaimsOfficerControllers;
    opens Jamiul_Huda.ClaimsOfficerControllers to javafx.fxml;

}