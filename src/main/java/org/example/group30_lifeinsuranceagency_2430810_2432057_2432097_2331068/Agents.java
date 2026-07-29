package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

public class Agents {
    private String agentId;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String branchId;
    private int policiesSold;
    private String status;

    public String getAgentId() {
        return agentId;
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

    public String getBranchId() {
        return branchId;
    }

    public int getPoliciesSold() {
        return policiesSold;
    }

    public String getStatus() {
        return status;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
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

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public void setPoliciesSold(int policiesSold) {
        this.policiesSold = policiesSold;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Agents(String agentId, String fullName, String email, String phoneNumber, String branchId, int policiesSold, String status) {
        this.agentId = agentId;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.branchId = branchId;
        this.policiesSold = policiesSold;
        this.status = status;



    }
}
