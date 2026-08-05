package Kazi_Tahmid_Abtahi.Model_Classes;

import java.io.Serializable;
import java.time.LocalDate;

public class Claim implements Serializable {
    private String claimId,policyId,claimType,status;
    private float payoutAmount;
    private LocalDate submissionDate;

    public Claim(String claimId, String policyId, String claimType, String status, float payoutAmount, LocalDate submissionDate) {
        this.claimId = claimId;
        this.policyId = policyId;
        this.claimType = claimType;
        this.status = status;
        this.payoutAmount = payoutAmount;
        this.submissionDate = submissionDate;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getPayoutAmount() {
        return payoutAmount;
    }

    public void setPayoutAmount(float payoutAmount) {
        this.payoutAmount = payoutAmount;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimId='" + claimId + '\'' +
                ", policyId='" + policyId + '\'' +
                ", claimType='" + claimType + '\'' +
                ", status='" + status + '\'' +
                ", payoutAmount=" + payoutAmount +
                ", submissionDate=" + submissionDate +
                '}';
    }
}
