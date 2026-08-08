package Nashua_Haque.Beneficiary;

public class BeneficiaryGoal5Processor {

    private int claimId;
    private int beneficiaryId;
    private String beneficiaryName;
    private int policyNumber;
    private String claimType;
    private String claimStatus;
    private String lastUpdated;

    public BeneficiaryGoal5Processor(int claimId,
                                     int beneficiaryId,
                                     String beneficiaryName,
                                     int policyNumber,
                                     String claimType,
                                     String claimStatus,
                                     String lastUpdated) {

        this.claimId = claimId;
        this.beneficiaryId = beneficiaryId;
        this.beneficiaryName = beneficiaryName;
        this.policyNumber = policyNumber;
        this.claimType = claimType;
        this.claimStatus = claimStatus;
        this.lastUpdated = lastUpdated;
    }

    public int getClaimId() {
        return claimId;
    }

    public int getBeneficiaryId() {
        return beneficiaryId;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getClaimType() {
        return claimType;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }
}