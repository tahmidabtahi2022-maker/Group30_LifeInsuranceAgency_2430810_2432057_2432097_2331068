package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

public class CustomerFeedback {
    private String feedbackId;
    private String customerId;
    private String customerName;
    private int rating;

    public String getFeedbackId() {
        return feedbackId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRating() {
        return rating;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "CustomerFeedback{" +
                "customerName='" + customerName + '\'' +
                ", feedbackId='" + feedbackId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", rating=" + rating +
                '}';
    }

    public CustomerFeedback(String feedbackId, String customerId, String customerName, int rating) {
        this.feedbackId = feedbackId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.rating = rating;



    }
}
