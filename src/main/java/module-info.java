module org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068 {

    requires javafx.controls;
    requires javafx.fxml;

    exports org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;
    opens org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068 to javafx.fxml;

    exports Jamiul_Huda.InsuranceAgentControllers;
    opens Jamiul_Huda.InsuranceAgentControllers to javafx.fxml;

    exports Jamiul_Huda.ClaimsOfficerControllers;
    opens Jamiul_Huda.ClaimsOfficerControllers to javafx.fxml;

}