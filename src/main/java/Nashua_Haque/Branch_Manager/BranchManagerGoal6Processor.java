package Nashua_Haque.Branch_Manager;

public class BranchManagerGoal6Processor {

    private String branch;
    private String agent;
    private String totalPremium;
    private String totalClaims;
    private String commission;
    private String status;
    private String branchCode;
    private String agentId;

    public BranchManagerGoal6Processor(String branch, String agent,
                                       String totalPremium, String totalClaims,
                                       String commission, String status,
                                       String branchCode, String agentId) {

        this.branch = branch;
        this.agent = agent;
        this.totalPremium = totalPremium;
        this.totalClaims = totalClaims;
        this.commission = commission;
        this.status = status;
        this.branchCode = branchCode;
        this.agentId = agentId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getTotalPremium() {
        return totalPremium;
    }

    public void setTotalPremium(String totalPremium) {
        this.totalPremium = totalPremium;
    }

    public String getTotalClaims() {
        return totalClaims;
    }

    public void setTotalClaims(String totalClaims) {
        this.totalClaims = totalClaims;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
}