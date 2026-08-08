package Nashua_Haque.Beneficiary;

public class BeneficiaryGoal3Processor {

    private int beneficiaryId;
    private int policyNumber;
    private String reference;
    private double claimAmount;
    private String date;
    private String remarks;

    public BeneficiaryGoal3Processor(int beneficiaryId,
                                     int policyNumber,
                                     String reference,
                                     double claimAmount,
                                     String date,
                                     String remarks) {

        this.beneficiaryId = beneficiaryId;
        this.policyNumber = policyNumber;
        this.reference = reference;
        this.claimAmount = claimAmount;
        this.date = date;
        this.remarks = remarks;
    }

    public int getBeneficiaryId() {
        return beneficiaryId;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getReference() {
        return reference;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public String getDate() {
        return date;
    }

    public String getRemarks() {
        return remarks;
    }
}