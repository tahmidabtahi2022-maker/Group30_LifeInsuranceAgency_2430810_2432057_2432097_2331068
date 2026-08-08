package Fuad_Bin_Omar.CustomerServiceRepresentative;

import java.time.LocalDate;

public class PaymentProcessingProcessing {
    private String CustomerID, PremiumPeriod, ReceiptNumber, PaymentConfirmation;
    private float PaymentAmount;
    private LocalDate PaymentDate;

    public PaymentProcessingProcessing(String customerID, String premiumPeriod, String receiptNumber, String paymentConfirmation, float paymentAmount, LocalDate paymentDate) {
        CustomerID = customerID;
        PremiumPeriod = premiumPeriod;
        ReceiptNumber = receiptNumber;
        PaymentConfirmation = paymentConfirmation;
        PaymentAmount = paymentAmount;
        PaymentDate = paymentDate;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getPremiumPeriod() {
        return PremiumPeriod;
    }

    public void setPremiumPeriod(String premiumPeriod) {
        PremiumPeriod = premiumPeriod;
    }

    public String getReceiptNumber() {
        return ReceiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        ReceiptNumber = receiptNumber;
    }

    public String getPaymentConfirmation() {
        return PaymentConfirmation;
    }

    public void setPaymentConfirmation(String paymentConfirmation) {
        PaymentConfirmation = paymentConfirmation;
    }

    public float getPaymentAmount() {
        return PaymentAmount;
    }

    public void setPaymentAmount(float paymentAmount) {
        PaymentAmount = paymentAmount;
    }

    public LocalDate getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        PaymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "PaymentProcessingProcessing{" +
                "CustomerID='" + CustomerID + '\'' +
                ", PremiumPeriod='" + PremiumPeriod + '\'' +
                ", ReceiptNumber='" + ReceiptNumber + '\'' +
                ", PaymentConfirmation='" + PaymentConfirmation + '\'' +
                ", PaymentAmount=" + PaymentAmount +
                ", PaymentDate=" + PaymentDate +
                '}';
    }
}
