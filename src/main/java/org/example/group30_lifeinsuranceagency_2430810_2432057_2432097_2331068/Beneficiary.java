package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

public class Beneficiary {
    private String beneficiaryId;
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String email;
    private String address;
    private String nationalId;
    private String relationshipToPolicyHolder;
    private String policyId;
    private String accountStatus;

    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getRelationshipToPolicyHolder() {
        return relationshipToPolicyHolder;
    }

    public String getPolicyId() {
        return policyId;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public void setRelationshipToPolicyHolder(String relationshipToPolicyHolder) {
        this.relationshipToPolicyHolder = relationshipToPolicyHolder;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "Beneficiary{" +
                "beneficiaryId='" + beneficiaryId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", relationshipToPolicyHolder='" + relationshipToPolicyHolder + '\'' +
                ", policyId='" + policyId + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }

    public Beneficiary(String beneficiaryId, String fullName, String dateOfBirth, String gender, String phoneNumber, String email, String address, String nationalId, String relationshipToPolicyHolder, String policyId, String accountStatus) {
        this.beneficiaryId = beneficiaryId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.nationalId = nationalId;
        this.relationshipToPolicyHolder = relationshipToPolicyHolder;
        this.policyId = policyId;
        this.accountStatus = accountStatus;



    }
}
