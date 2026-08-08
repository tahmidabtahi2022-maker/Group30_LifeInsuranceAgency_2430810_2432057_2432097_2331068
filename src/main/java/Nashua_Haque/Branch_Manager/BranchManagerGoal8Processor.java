package Nashua_Haque.Branch_Manager;

public class BranchManagerGoal8Processor {

    private String targetId;
    private String branch;
    private String targetType;
    private String targetValue;
    private String targetPeriod;
    private String status;
    private String createdDate;

    public BranchManagerGoal8Processor(String targetId,
                                       String branch,
                                       String targetType,
                                       String targetValue,
                                       String targetPeriod,
                                       String status,
                                       String createdDate) {

        this.targetId = targetId;
        this.branch = branch;
        this.targetType = targetType;
        this.targetValue = targetValue;
        this.targetPeriod = targetPeriod;
        this.status = status;
        this.createdDate = createdDate;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public String getTargetPeriod() {
        return targetPeriod;
    }

    public void setTargetPeriod(String targetPeriod) {
        this.targetPeriod = targetPeriod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}