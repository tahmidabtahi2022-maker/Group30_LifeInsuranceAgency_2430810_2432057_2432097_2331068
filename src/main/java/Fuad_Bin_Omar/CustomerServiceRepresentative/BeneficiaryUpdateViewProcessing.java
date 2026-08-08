package Fuad_Bin_Omar.CustomerServiceRepresentative;

public class BeneficiaryUpdateViewProcessing {
    private String BeneficiaryName, Relationship, DocumentType, PolicyID, SecurityID, StatusConfirmation, Remarks;
    private float AllocationPercentage, TotalAllocation;

    public BeneficiaryUpdateViewProcessing(String beneficiaryName, String relationship, String documentType, String policyID, String securityID, String statusConfirmation, String remarks, float allocationPercentage, float totalAllocation) {
        BeneficiaryName = beneficiaryName;
        Relationship = relationship;
        DocumentType = documentType;
        PolicyID = policyID;
        SecurityID = securityID;
        StatusConfirmation = statusConfirmation;
        Remarks = remarks;
        AllocationPercentage = allocationPercentage;
        TotalAllocation = totalAllocation;
    }


    public String getBeneficiaryName() {
        return BeneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        BeneficiaryName = beneficiaryName;
    }

    public String getRelationship() {
        return Relationship;
    }

    public void setRelationship(String relationship) {
        Relationship = relationship;
    }

    public String getDocumentType() {
        return DocumentType;
    }

    public void setDocumentType(String documentType) {
        DocumentType = documentType;
    }

    public String getPolicyID() {
        return PolicyID;
    }

    public void setPolicyID(String policyID) {
        PolicyID = policyID;
    }

    public String getSecurityID() {
        return SecurityID;
    }

    public void setSecurityID(String securityID) {
        SecurityID = securityID;
    }

    public String getStatusConfirmation() {
        return StatusConfirmation;
    }

    public void setStatusConfirmation(String statusConfirmation) {
        StatusConfirmation = statusConfirmation;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public float getAllocationPercentage() {
        return AllocationPercentage;
    }

    public void setAllocationPercentage(float allocationPercentage) {
        AllocationPercentage = allocationPercentage;
    }

    public float getTotalAllocation() {
        return TotalAllocation;
    }

    public void setTotalAllocation(float totalAllocation) {
        TotalAllocation = totalAllocation;
    }

    @Override
    public String toString() {
        return "BeneficiaryUpdateViewProcessing{" +
                "BeneficiaryName='" + BeneficiaryName + '\'' +
                ", Relationship='" + Relationship + '\'' +
                ", DocumentType='" + DocumentType + '\'' +
                ", PolicyID='" + PolicyID + '\'' +
                ", SecurityID='" + SecurityID + '\'' +
                ", StatusConfirmation='" + StatusConfirmation + '\'' +
                ", Remarks='" + Remarks + '\'' +
                ", AllocationPercentage=" + AllocationPercentage +
                ", TotalAllocation=" + TotalAllocation +
                '}';
    }
}
