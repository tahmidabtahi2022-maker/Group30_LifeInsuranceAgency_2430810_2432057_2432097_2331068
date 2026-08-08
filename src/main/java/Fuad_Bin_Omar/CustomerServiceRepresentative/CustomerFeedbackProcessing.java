package Fuad_Bin_Omar.CustomerServiceRepresentative;

import java.time.LocalDate;

public class CustomerFeedbackProcessing {
    private String PolicyID, CustomerName, PriorityLevel, IssueCategory, ComplaintDescription, TicketID, Status;
    private LocalDate DateLogged;

    public CustomerFeedbackProcessing(String policyID, String customerName, String priorityLevel, String issueCategory, String complaintDescription, String ticketID, String status, LocalDate dateLogged) {
        PolicyID = policyID;
        CustomerName = customerName;
        PriorityLevel = priorityLevel;
        IssueCategory = issueCategory;
        ComplaintDescription = complaintDescription;
        TicketID = ticketID;
        Status = status;
        DateLogged = dateLogged;
    }

    public String getPolicyID() {
        return PolicyID;
    }

    public void setPolicyID(String policyID) {
        PolicyID = policyID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getPriorityLevel() {
        return PriorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        PriorityLevel = priorityLevel;
    }

    public String getIssueCategory() {
        return IssueCategory;
    }

    public void setIssueCategory(String issueCategory) {
        IssueCategory = issueCategory;
    }

    public String getComplaintDescription() {
        return ComplaintDescription;
    }

    public void setComplaintDescription(String complaintDescription) {
        ComplaintDescription = complaintDescription;
    }

    public String getTicketID() {
        return TicketID;
    }

    public void setTicketID(String ticketID) {
        TicketID = ticketID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getDateLogged() {
        return DateLogged;
    }

    public void setDateLogged(LocalDate dateLogged) {
        DateLogged = dateLogged;
    }

    @Override
    public String toString() {
        return "CustomerFeedbackProcessing{" +
                "PolicyID='" + PolicyID + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", PriorityLevel='" + PriorityLevel + '\'' +
                ", IssueCategory='" + IssueCategory + '\'' +
                ", ComplaintDescription='" + ComplaintDescription + '\'' +
                ", TicketID='" + TicketID + '\'' +
                ", Status='" + Status + '\'' +
                ", DateLogged=" + DateLogged +
                '}';
    }
}
