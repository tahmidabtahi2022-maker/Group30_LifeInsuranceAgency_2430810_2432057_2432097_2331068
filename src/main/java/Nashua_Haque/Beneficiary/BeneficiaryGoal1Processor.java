package Nashua_Haque.Beneficiary;

public class BeneficiaryGoal1Processor {
    private int id;
    private String name;
    private String email;
    private int phone_number;
    private String gender;
    private String policy_refference;
    private String registration_status;

    public BeneficiaryGoal1Processor(int id, String name, String email, int phone_number, String gender, String policy_refference, String registration_status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.gender = gender;
        this.policy_refference = policy_refference;
        this.registration_status = registration_status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPolicy_refference() {
        return policy_refference;
    }

    public void setPolicy_refference(String policy_refference) {
        this.policy_refference = policy_refference;
    }

    public String getRegistration_status() {
        return registration_status;
    }

    public void setRegistration_status(String registration_status) {
        this.registration_status = registration_status;
    }

    @Override
    public String toString() {
        return "BeneficiaryGoal1Processor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number=" + phone_number +
                ", gender='" + gender + '\'' +
                ", policy_refference='" + policy_refference + '\'' +
                ", registration_status='" + registration_status + '\'' +
                '}';
    }
}
