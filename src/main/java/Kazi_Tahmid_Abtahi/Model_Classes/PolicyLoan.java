package Kazi_Tahmid_Abtahi.Model_Classes;

import java.io.Serializable;
import java.time.LocalDate;

public class PolicyLoan implements Serializable {
    private String customerId,loanId,policyId,status;
    private float loanAmount;
    private LocalDate requestDate;

    public PolicyLoan(String customerId, String loanId, String policyId, String status, float loanAmount, LocalDate requestDate) {
        this.customerId = customerId;
        this.loanId = loanId;
        this.policyId = policyId;
        this.status = status;
        this.loanAmount = loanAmount;
        this.requestDate = requestDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    @Override
    public String toString() {
        return "PolicyLoan{" +
                "customerId='" + customerId + '\'' +
                ", loanId='" + loanId + '\'' +
                ", policyId='" + policyId + '\'' +
                ", status='" + status + '\'' +
                ", loanAmount=" + loanAmount +
                ", requestDate=" + requestDate +
                '}';
    }
}
