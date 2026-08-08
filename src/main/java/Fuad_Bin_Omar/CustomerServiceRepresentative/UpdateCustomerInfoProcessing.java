package Fuad_Bin_Omar.CustomerServiceRepresentative;

import java.time.LocalDate;

public class UpdateCustomerInfoProcessing {
    private String CustomerName, CustomerID, EmailAddress, Address, ContactNumber;
    private LocalDate UpdateDate;

    public UpdateCustomerInfoProcessing(String customerName, String customerID, String emailAddress, String address, String contactNumber, LocalDate updateDate) {
        CustomerName = customerName;
        CustomerID = customerID;
        EmailAddress = emailAddress;
        Address = address;
        ContactNumber = contactNumber;
        UpdateDate = updateDate;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public LocalDate getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        UpdateDate = updateDate;
    }

    @Override
    public String toString() {
        return "UpdateCustomerInfoProcessing{" +
                "CustomerName='" + CustomerName + '\'' +
                ", CustomerID='" + CustomerID + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                ", Address='" + Address + '\'' +
                ", ContactNumber='" + ContactNumber + '\'' +
                ", UpdateDate=" + UpdateDate +
                '}';
    }
}
