package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

public class Customer {
    private String customerId;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String address;
    private String assignedAgentId;
    private String policyId;

    public String getCustomerId() {
        return customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getAssignedAgentId() {
        return assignedAgentId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAssignedAgentId(String assignedAgentId) {
        this.assignedAgentId = assignedAgentId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", assignedAgentId='" + assignedAgentId + '\'' +
                ", policyId='" + policyId + '\'' +
                '}';
    }

    public Customer(String customerId, String fullName, String email, String phoneNumber, String address, String assignedAgentId, String policyId) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.assignedAgentId = assignedAgentId;
        this.policyId = policyId;



    }
}
