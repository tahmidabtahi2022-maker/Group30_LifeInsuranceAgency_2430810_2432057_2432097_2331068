module org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068 to javafx.fxml;
    opens Kazi_Tahmid_Abtahi.CustomerControllers to javafx.fxml;
    opens Kazi_Tahmid_Abtahi.AccountsOfficerControllers to javafx.fxml;
    exports org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;
    exports Kazi_Tahmid_Abtahi.CustomerControllers;
    exports Kazi_Tahmid_Abtahi.AccountsOfficerControllers;
}