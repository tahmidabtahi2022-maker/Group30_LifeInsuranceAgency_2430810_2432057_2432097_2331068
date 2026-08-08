package Nashua_Haque.Beneficiary;

public class BeneficiaryGoal2Processor {

    private int id;
    private String name;
    private int policy_number;
    private String policy_type;
    private String beneficiary_status;
    private double coverage_amount;
    private String registration_date;

    public BeneficiaryGoal2Processor(int id, String name,
                                     int policy_number,
                                     String policy_type,
                                     String beneficiary_status,
                                     double coverage_amount,
                                     String registration_date) {

        this.id = id;
        this.name = name;
        this.policy_number = policy_number;
        this.policy_type = policy_type;
        this.beneficiary_status = beneficiary_status;
        this.coverage_amount = coverage_amount;
        this.registration_date = registration_date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPolicy_number() {
        return policy_number;
    }

    public String getPolicy_type() {
        return policy_type;
    }

    public String getBeneficiary_status() {
        return beneficiary_status;
    }

    public double getCoverage_amount() {
        return coverage_amount;
    }

    public String getRegistration_date() {
        return registration_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPolicy_number(int policy_number) {
        this.policy_number = policy_number;
    }

    public void setPolicy_type(String policy_type) {
        this.policy_type = policy_type;
    }

    public void setBeneficiary_status(String beneficiary_status) {
        this.beneficiary_status = beneficiary_status;
    }

    public void setCoverage_amount(double coverage_amount) {
        this.coverage_amount = coverage_amount;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }
}