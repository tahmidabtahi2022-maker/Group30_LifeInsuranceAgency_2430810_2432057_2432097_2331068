package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

public class ClaimHistory {
    private String historyId;
    private String claimId;
    private String action;
    private String actionDate;
    private String updatedBy;

    public String getHistoryId() {
        return historyId;
    }

    public String getClaimId() {
        return claimId;
    }

    public String getAction() {
        return action;
    }

    public String getActionDate() {
        return actionDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setHistoryId(String historyId) {
        this.historyId = historyId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setActionDate(String actionDate) {
        this.actionDate = actionDate;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "ClaimHistory{" +
                "historyId='" + historyId + '\'' +
                ", claimId='" + claimId + '\'' +
                ", action='" + action + '\'' +
                ", actionDate='" + actionDate + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }

    public ClaimHistory(String historyId, String claimId, String action, String actionDate, String updatedBy) {
        this.historyId = historyId;
        this.claimId = claimId;
        this.action = action;
        this.actionDate = actionDate;
        this.updatedBy = updatedBy;



    }
}
