package Kazi_Tahmid_Abtahi.Model_Classes;

import org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068.User;

import java.io.Serializable;
import java.time.LocalDate;

public class Beneficiary extends User implements Serializable {
    private String policyId,relationship;
    private float allocationPercentage;

    public Beneficiary(String userId, String fullName, String emailAddress, String phoneNumber, String password, LocalDate dateOfBirth, String policyId, String relationship, float allocationPercentage) {
        super(userId, fullName, emailAddress, phoneNumber, password, dateOfBirth);
        this.policyId = policyId;
        this.relationship = relationship;
        this.allocationPercentage = allocationPercentage;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
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
                ", relationship='" + relationship + '\'' +
                ", allocationPercentage=" + allocationPercentage +
                '}';
    }
}
