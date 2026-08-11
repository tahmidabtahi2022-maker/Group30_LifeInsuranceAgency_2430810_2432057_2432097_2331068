package Kazi_Tahmid_Abtahi.Model_Classes;

import java.io.Serializable;

public class Quote implements Serializable {

    private String policyType,smokerStatus,medicalHistory;
    private int policyTerm;
    private float coverageAmount,calculatedPremium;

    public Quote(String policyType, String smokerStatus, String medicalHistory, int policyTerm, float coverageAmount, float calculatedPremium) {
        this.policyType = policyType;
        this.smokerStatus = smokerStatus;
        this.medicalHistory = medicalHistory;
        this.policyTerm = policyTerm;
        this.coverageAmount = coverageAmount;
        this.calculatedPremium = calculatedPremium;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
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

    public int getPolicyTerm() {
        return policyTerm;
    }

    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }

    public float getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(float coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public float getCalculatedPremium() {
        return calculatedPremium;
    }

    public void setCalculatedPremium(float calculatedPremium) {
        this.calculatedPremium = calculatedPremium;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "policyType='" + policyType + '\'' +
                ", smokerStatus='" + smokerStatus + '\'' +
                ", medicalHistory='" + medicalHistory + '\'' +
                ", policyTerm=" + policyTerm +
                ", coverageAmount=" + coverageAmount +
                ", calculatedPremium=" + calculatedPremium +
                '}';
    }
}