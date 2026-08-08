package Nashua_Haque.Beneficiary;

public class BeneficiaryGoal6Processor {

    private int notificationId;
    private int beneficiaryId;
    private String title;
    private String type;
    private String status;
    private String date;
    private String time;
    private String priority;

    public BeneficiaryGoal6Processor(int notificationId,
                                     int beneficiaryId,
                                     String title,
                                     String type,
                                     String status,
                                     String date,
                                     String time,
                                     String priority) {

        this.notificationId = notificationId;
        this.beneficiaryId = beneficiaryId;
        this.title = title;
        this.type = type;
        this.status = status;
        this.date = date;
        this.time = time;
        this.priority = priority;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public int getBeneficiaryId() {
        return beneficiaryId;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getPriority() {
        return priority;
    }
}