package Kazi_Tahmid_Abtahi.Model_Classes;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Policy implements Serializable {
    private String policyId,customerId,policyType,status;
    private float coverageAmount,yearlyPremium,totalCashValue;
    private int policyTermYears;
    private LocalDate nextDueDate;

    public Policy(String policyId, String customerId, String policyType, String status, float coverageAmount, float yearlyPremium, float totalCashValue, int policyTermYears, LocalDate nextDueDate) {
        this.policyId = policyId;
        this.customerId = customerId;
        this.policyType = policyType;
        this.status = status;
        this.coverageAmount = coverageAmount;
        this.yearlyPremium = yearlyPremium;
        this.totalCashValue = totalCashValue;
        this.policyTermYears = policyTermYears;
        this.nextDueDate = nextDueDate;
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

    public float getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(float coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public float getYearlyPremium() {
        return yearlyPremium;
    }

    public void setYearlyPremium(float yearlyPremium) {
        this.yearlyPremium = yearlyPremium;
    }

    public float getTotalCashValue() {
        return totalCashValue;
    }

    public void setTotalCashValue(float totalCashValue) {
        this.totalCashValue = totalCashValue;
    }

    public int getPolicyTermYears() {
        return policyTermYears;
    }

    public void setPolicyTermYears(int policyTermYears) {
        this.policyTermYears = policyTermYears;
    }

    public LocalDate getNextDueDate() {
        return nextDueDate;
    }

    public void setNextDueDate(LocalDate nextDueDate) {
        this.nextDueDate = nextDueDate;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyId='" + policyId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", policyType='" + policyType + '\'' +
                ", status='" + status + '\'' +
                ", coverageAmount=" + coverageAmount +
                ", yearlyPremium=" + yearlyPremium +
                ", totalCashValue=" + totalCashValue +
                ", policyTermYears=" + policyTermYears +
                ", nextDueDate=" + nextDueDate +
                '}';
    }
}
