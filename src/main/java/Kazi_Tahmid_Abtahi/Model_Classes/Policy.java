package Kazi_Tahmid_Abtahi.Model_Classes;

import java.time.LocalDate;

public class Policy {
    private String policyId,customerId,policyType,status;
    private float accumulatedCashValue;
    private LocalDate nextDueDate;
    private boolean aplEnabled;

    public Policy(String policyId, String customerId, String customerEmailAddress,String policyType, String status, float accumulatedCashValue, LocalDate nextDueDate, boolean aplEnabled) {
        this.policyId = policyId;
        this.customerId = customerId;
        this.policyType = policyType;
        this.status = status;
        this.accumulatedCashValue = accumulatedCashValue;
        this.nextDueDate = nextDueDate;
        this.aplEnabled = aplEnabled;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getAccumulatedCashValue() {
        return accumulatedCashValue;
    }

    public void setAccumulatedCashValue(float accumulatedCashValue) {
        this.accumulatedCashValue = accumulatedCashValue;
    }

    public LocalDate getNextDueDate() {
        return nextDueDate;
    }

    public void setNextDueDate(LocalDate nextDueDate) {
        this.nextDueDate = nextDueDate;
    }

    public boolean isAplEnabled() {
        return aplEnabled;
    }



    public void setAplEnabled(boolean aplEnabled) {
        this.aplEnabled = aplEnabled;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyId='" + policyId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", policyType='" + policyType + '\'' +
                ", status='" + status + '\'' +
                ", accumulatedCashValue=" + accumulatedCashValue +
                ", nextDueDate=" + nextDueDate +
                ", aplEnabled=" + aplEnabled +
                '}';
    }
}
