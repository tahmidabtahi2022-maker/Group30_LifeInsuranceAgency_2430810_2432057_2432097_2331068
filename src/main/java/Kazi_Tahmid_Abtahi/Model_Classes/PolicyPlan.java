package Kazi_Tahmid_Abtahi.Model_Classes;

import java.io.Serializable;

public class PolicyPlan implements Serializable {
    private String planName,policyType,description;
    private float coverageAmount;
    private int durationYears;

    public PolicyPlan(String planName, String policyType, String description, float coverageAmount, int durationYears) {
        this.planName = planName;
        this.policyType = policyType;
        this.description = description;
        this.coverageAmount = coverageAmount;
        this.durationYears = durationYears;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(float coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public int getDurationYears() {
        return durationYears;
    }

    public void setDurationYears(int durationYears) {
        this.durationYears = durationYears;
    }

    @Override
    public String toString() {
        return "PolicyPlan{" +
                "planName='" + planName + '\'' +
                ", policyType='" + policyType + '\'' +
                ", description='" + description + '\'' +
                ", coverageAmount=" + coverageAmount +
                ", durationYears=" + durationYears +
                '}';
    }
}
