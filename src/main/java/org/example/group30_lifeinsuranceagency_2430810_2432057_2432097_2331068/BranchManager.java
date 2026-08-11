package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

public class BranchManager {
    private String managerId;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String branchId;
    private String branchName;
    private String username;
    private String password;

    public String getManagerId() {
        return managerId;
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

    public String getBranchName() {
        return branchName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
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

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "BranchManager{" +
                "managerId='" + managerId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", branchId='" + branchId + '\'' +
                ", branchName='" + branchName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public BranchManager(String managerId, String fullName, String email, String phoneNumber, String branchId, String branchName, String username, String password) {
        this.managerId = managerId;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.branchId = branchId;
        this.branchName = branchName;
        this.username = username;
        this.password = password;



    }
}
