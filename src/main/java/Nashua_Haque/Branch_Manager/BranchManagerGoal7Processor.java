package Nashua_Haque.Branch_Manager;

public class BranchManagerGoal7Processor {

    private String feedbackId;
    private String customerName;
    private String policyNumber;
    private String branch;
    private String agentName;
    private String rating;
    private String feedbackDate;
    private String status;

    public BranchManagerGoal7Processor(String feedbackId,
                                       String customerName,
                                       String policyNumber,
                                       String branch,
                                       String agentName,
                                       String rating,
                                       String feedbackDate,
                                       String status) {

        this.feedbackId = feedbackId;
        this.customerName = customerName;
        this.policyNumber = policyNumber;
        this.branch = branch;
        this.agentName = agentName;
        this.rating = rating;
        this.feedbackDate = feedbackDate;
        this.status = status;
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(String feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}