package Kazi_Tahmid_Abtahi.Model_Classes;

import java.io.Serializable;
import java.time.LocalDate;

public class PremiumPayment implements Serializable {
    private String customerId,policyId,transactionId,paymentMethod,referenceNumber;
    private float amountPaid;
    private LocalDate paymentDate;

    public PremiumPayment(String customerId, String policyId, String transactionId, String paymentMethod, String referenceNumber, float amountPaid, LocalDate paymentDate) {
        this.customerId = customerId;
        this.policyId = policyId;
        this.transactionId = transactionId;
        this.paymentMethod = paymentMethod;
        this.referenceNumber = referenceNumber;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public float getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "PremiumPayment{" +
                "customerId='" + customerId + '\'' +
                ", policyId='" + policyId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", amountPaid=" + amountPaid +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
