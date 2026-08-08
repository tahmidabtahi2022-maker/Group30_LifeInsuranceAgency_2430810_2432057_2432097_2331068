package Nashua_Haque.Branch_Manager;

public class BranchManagerGoal5Processor {

    private String branchId;
    private String branchName;
    private String managerName;
    private String totalPolicies;
    private String totalRevenue;
    private String performanceStatus;
    private String reportDate;

    public BranchManagerGoal5Processor(String branchId, String branchName,
                             String managerName, String totalPolicies,
                             String totalRevenue, String performanceStatus,
                             String reportDate) {

        this.branchId = branchId;
        this.branchName = branchName;
        this.managerName = managerName;
        this.totalPolicies = totalPolicies;
        this.totalRevenue = totalRevenue;
        this.performanceStatus = performanceStatus;
        this.reportDate = reportDate;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getTotalPolicies() {
        return totalPolicies;
    }

    public void setTotalPolicies(String totalPolicies) {
        this.totalPolicies = totalPolicies;
    }

    public String getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(String totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public String getPerformanceStatus() {
        return performanceStatus;
    }

    public void setPerformanceStatus(String performanceStatus) {
        this.performanceStatus = performanceStatus;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }
}