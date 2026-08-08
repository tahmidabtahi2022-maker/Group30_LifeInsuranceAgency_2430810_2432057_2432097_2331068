package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

public class ClaimRequest {
    private String claimId;
    private String beneficiaryId;
    private String policyId;
    private String claimType;
    private String submissionDate;
    private String claimStatus;
    private double claimAmount;
    private String remarks;

    public String getClaimId() {
        return claimId;
    }

    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public String getClaimType() {
        return claimType;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public void setBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "ClaimRequest{" +
                "claimId='" + claimId + '\'' +
                ", beneficiaryId='" + beneficiaryId + '\'' +
                ", policyId='" + policyId + '\'' +
                ", claimType='" + claimType + '\'' +
                ", submissionDate='" + submissionDate + '\'' +
                ", claimStatus='" + claimStatus + '\'' +
                ", claimAmount=" + claimAmount +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public ClaimRequest(String claimId, String beneficiaryId, String policyId, String claimType, String submissionDate, String claimStatus, double claimAmount, String remarks) {
        this.claimId = claimId;
        this.beneficiaryId = beneficiaryId;
        this.policyId = policyId;
        this.claimType = claimType;
        this.submissionDate = submissionDate;
        this.claimStatus = claimStatus;
        this.claimAmount = claimAmount;
        this.remarks = remarks;



    }
}
