package Fuad_Bin_Omar.CustomerServiceRepresentative;

import java.time.LocalDate;

public class LifeInsuranceClaimProcessing {
    private String CustomerName, PolicyID, BankName, BankAccountNumber, ClaimType, DocumentationProof, UploadedFile, ClaimID, Status;
    private LocalDate Date;

    public LifeInsuranceClaimProcessing(String customerName, String policyID, String bankName, String bankAccountNumber, String claimType, String documentationProof, String uploadedFile, String claimID, String status, LocalDate date) {
        CustomerName = customerName;
        PolicyID = policyID;
        BankName = bankName;
        BankAccountNumber = bankAccountNumber;
        ClaimType = claimType;
        DocumentationProof = documentationProof;
        UploadedFile = uploadedFile;
        ClaimID = claimID;
        Status = status;
        Date = date;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getPolicyID() {
        return PolicyID;
    }

    public void setPolicyID(String policyID) {
        PolicyID = policyID;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public String getBankAccountNumber() {
        return BankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        BankAccountNumber = bankAccountNumber;
    }

    public String getClaimType() {
        return ClaimType;
    }

    public void setClaimType(String claimType) {
        ClaimType = claimType;
    }

    public String getDocumentationProof() {
        return DocumentationProof;
    }

    public void setDocumentationProof(String documentationProof) {
        DocumentationProof = documentationProof;
    }

    public String getUploadedFile() {
        return UploadedFile;
    }

    public void setUploadedFile(String uploadedFile) {
        UploadedFile = uploadedFile;
    }

    public String getClaimID() {
        return ClaimID;
    }

    public void setClaimID(String claimID) {
        ClaimID = claimID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "LifeInsuranceClaimProcessing{" +
                "CustomerName='" + CustomerName + '\'' +
                ", PolicyID='" + PolicyID + '\'' +
                ", BankName='" + BankName + '\'' +
                ", BankAccountNumber='" + BankAccountNumber + '\'' +
                ", ClaimType='" + ClaimType + '\'' +
                ", DocumentationProof='" + DocumentationProof + '\'' +
                ", UploadedFile='" + UploadedFile + '\'' +
                ", ClaimID='" + ClaimID + '\'' +
                ", Status='" + Status + '\'' +
                ", Date=" + Date +
                '}';
    }
}
