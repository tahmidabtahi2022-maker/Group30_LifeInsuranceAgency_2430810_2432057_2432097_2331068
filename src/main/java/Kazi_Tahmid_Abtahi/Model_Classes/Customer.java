package Kazi_Tahmid_Abtahi.Model_Classes;

import org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068.User;

import java.time.LocalDate;

public class Customer extends User {
    private String phoneNumber;
    private float accumulatedPortfolioValue;

    public Customer(String userId, String fullName, String emailAddress, String password, LocalDate dateOfBirth, String phoneNumber, float accumulatedPortfolioValue) {
        super(userId, fullName, emailAddress, password, dateOfBirth);
        this.phoneNumber = phoneNumber;
        this.accumulatedPortfolioValue = accumulatedPortfolioValue;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getAccumulatedPortfolioValue() {
        return accumulatedPortfolioValue;
    }

    public void setAccumulatedPortfolioValue(float accumulatedPortfolioValue) {
        this.accumulatedPortfolioValue = accumulatedPortfolioValue;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", accumulatedPortfolioValue=" + accumulatedPortfolioValue +
                '}';
    }
}
