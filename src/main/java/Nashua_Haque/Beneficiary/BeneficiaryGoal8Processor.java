package Nashua_Haque.Beneficiary;

public class BeneficiaryGoal8Processor {

    private String fieldName;
    private String previousValue;
    private String updatedValue;
    private String updatedBy;
    private String updatedDate;

    public BeneficiaryGoal8Processor(String fieldName,
                                     String previousValue,
                                     String updatedValue,
                                     String updatedBy,
                                     String updatedDate) {

        this.fieldName = fieldName;
        this.previousValue = previousValue;
        this.updatedValue = updatedValue;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getPreviousValue() {
        return previousValue;
    }

    public String getUpdatedValue() {
        return updatedValue;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }
}