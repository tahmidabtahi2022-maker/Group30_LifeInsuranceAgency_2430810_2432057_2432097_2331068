package Kazi_Tahmid_Abtahi.Model_Classes;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Policy implements Serializable {
    private String policyId, customerId, policyType, status, smokerStatus, medicalHistory;
    private float coverageAmount, yearlyPremium, totalCashValue;
    private int policyTerm;
    private LocalDate nextDueDate;
    private ArrayList<Beneficiary> beneficiaryList;

    public Policy(String policyId, String customerId, String policyType, String status, String smokerStatus, String medicalHistory, float coverageAmount, float yearlyPremium, float totalCashValue, int policyTerm, LocalDate nextDueDate) {
        this.policyId = policyId;
        this.customerId = customerId;
        this.policyType = policyType;
        this.status = status;
        this.smokerStatus = smokerStatus;
        this.medicalHistory = medicalHistory;
        this.coverageAmount = coverageAmount;
        this.yearlyPremium = yearlyPremium;
        this.totalCashValue = totalCashValue;
        this.policyTerm = policyTerm;
        this.nextDueDate = nextDueDate;
        this.beneficiaryList = new ArrayList<>();
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

    public String getSmokerStatus() {
        return smokerStatus;
    }

    public void setSmokerStatus(String smokerStatus) {
        this.smokerStatus = smokerStatus;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
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

    public int getPolicyTerm() {
        return policyTerm;
    }

    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }

    public LocalDate getNextDueDate() {
        return nextDueDate;
    }

    public void setNextDueDate(LocalDate nextDueDate) {
        this.nextDueDate = nextDueDate;
    }

    String displayStatus;

    public String getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public ArrayList<Beneficiary> getBeneficiaryList() {
        return beneficiaryList;
    }

    public void setBeneficiaryList(ArrayList<Beneficiary> beneficiaryList) {
        this.beneficiaryList = beneficiaryList;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyId='" + policyId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", policyType='" + policyType + '\'' +
                ", status='" + status + '\'' +
                ", smokerStatus='" + smokerStatus + '\'' +
                ", medicalHistory='" + medicalHistory + '\'' +
                ", coverageAmount=" + coverageAmount +
                ", yearlyPremium=" + yearlyPremium +
                ", totalCashValue=" + totalCashValue +
                ", policyTerm=" + policyTerm +
                ", nextDueDate=" + nextDueDate +
                '}';
    }
}
