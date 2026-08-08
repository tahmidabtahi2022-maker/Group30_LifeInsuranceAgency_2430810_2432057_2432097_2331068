package Fuad_Bin_Omar.CustomerServiceRepresentative;

public class CustomerProfileProcessing {
    public String CustomerName, CustomerID, ContactNumber, EmailAddress, PolicyNumber, ActivePlan, PolicyStatus, PolicyID ;

    public CustomerProfileProcessing(String customerName, String customerID, String contactNumber, String emailAddress, String policyNumber, String activePlan, String policyStatus, String policyID) {
        CustomerName = customerName;
        CustomerID = customerID;
        ContactNumber = contactNumber;
        EmailAddress = emailAddress;
        PolicyNumber = policyNumber;
        ActivePlan = activePlan;
        PolicyStatus = policyStatus;
        PolicyID = policyID;
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

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getPolicyNumber() {
        return PolicyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        PolicyNumber = policyNumber;
    }

    public String getActivePlan() {
        return ActivePlan;
    }

    public void setActivePlan(String activePlan) {
        ActivePlan = activePlan;
    }

    public String getPolicyStatus() {
        return PolicyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        PolicyStatus = policyStatus;
    }

    public String getPolicyID() {
        return PolicyID;
    }

    public void setPolicyID(String policyID) {
        PolicyID = policyID;
    }

    @Override
    public String toString() {
        return "CustomerProfileProcessing{" +
                "CustomerName='" + CustomerName + '\'' +
                ", CustomerID='" + CustomerID + '\'' +
                ", ContactNumber='" + ContactNumber + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                ", PolicyNumber='" + PolicyNumber + '\'' +
                ", ActivePlan='" + ActivePlan + '\'' +
                ", PolicyStatus='" + PolicyStatus + '\'' +
                ", PolicyID='" + PolicyID + '\'' +
                '}';
    }
}
