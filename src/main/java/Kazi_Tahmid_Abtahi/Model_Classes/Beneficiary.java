package Kazi_Tahmid_Abtahi.Model_Classes;

import java.io.Serializable;

public class Beneficiary implements Serializable {
    private String policyId,policyType,beneficiaryName,relationship;
    private float allocationPercentage;

    public Beneficiary(String policyId, String policyType, String beneficiaryName, String relationship, float allocationPercentage) {
        this.policyId = policyId;
        this.policyType = policyType;
        this.beneficiaryName = beneficiaryName;
        this.relationship = relationship;
        this.allocationPercentage = allocationPercentage;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public float getAllocationPercentage() {
        return allocationPercentage;
    }

    public void setAllocationPercentage(float allocationPercentage) {
        this.allocationPercentage = allocationPercentage;
    }

    @Override
    public String toString() {
        return "Beneficiary{" +
                "policyId='" + policyId + '\'' +
                ", policyType='" + policyType + '\'' +
                ", beneficiaryName='" + beneficiaryName + '\'' +
                ", relationship='" + relationship + '\'' +
                ", allocationPercentage=" + allocationPercentage +
                '}';
    }
}