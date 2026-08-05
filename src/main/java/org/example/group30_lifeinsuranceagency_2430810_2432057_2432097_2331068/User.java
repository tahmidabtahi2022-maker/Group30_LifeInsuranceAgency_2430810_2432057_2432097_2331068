package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class User implements Serializable {
    private String userId, fullName,emailAddress,password;
    private LocalDate dateOfBirth;

    public User(String userId, String fullName, String emailAddress, String password, LocalDate dateOfBirth) {
        this.userId = userId;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
