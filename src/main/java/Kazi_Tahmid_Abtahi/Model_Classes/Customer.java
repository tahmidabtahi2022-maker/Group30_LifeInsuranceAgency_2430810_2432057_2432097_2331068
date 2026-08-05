package Kazi_Tahmid_Abtahi.Model_Classes;

import org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068.User;

import java.io.Serializable;
import java.time.LocalDate;

public class Customer extends User implements Serializable {
    private float totalBalance;

    public Customer(String userId, String fullName, String emailAddress, String phoneNumber, String password, LocalDate dateOfBirth, float totalBalance) {
        super(userId, fullName, emailAddress, phoneNumber, password, dateOfBirth);
        this.totalBalance = totalBalance;
    }

    public float getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(float totalBalance) {
        this.totalBalance = totalBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "totalBalance=" + totalBalance +
                '}';
    }
}
