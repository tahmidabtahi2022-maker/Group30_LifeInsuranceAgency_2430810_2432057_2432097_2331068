package Nashua_Haque.Beneficiary;

public class BeneficiaryGoal7Processor {

    private int claimId;
    private int policyNumber;
    private double claimAmount;
    private String currentStatus;
    private int processingTime;
    private String branch;
    private String claimDate;

    public BeneficiaryGoal7Processor(int claimId,
                                     int policyNumber,
                                     double claimAmount,
                                     String currentStatus,
                                     int processingTime,
                                     String branch,
                                     String claimDate) {

        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.currentStatus = currentStatus;
        this.processingTime = processingTime;
        this.branch = branch;
        this.claimDate = claimDate;
    }

    public int getClaimId() {
        return claimId;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public String getBranch() {
        return branch;
    }

    public String getClaimDate() {
        return claimDate;
    }
}