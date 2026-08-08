package Nashua_Haque.Branch_Manager;

public class BranchManagerGoal2Processor {

    private int agentId;
    private String agentName;
    private int policiesSold;
    private double totalSales;
    private double commission;
    private String performance;
    private String salesDate;

    public BranchManagerGoal2Processor(int agentId,
                                       String agentName,
                                       int policiesSold,
                                       double totalSales,
                                       double commission,
                                       String performance,
                                       String salesDate) {

        this.agentId = agentId;
        this.agentName = agentName;
        this.policiesSold = policiesSold;
        this.totalSales = totalSales;
        this.commission = commission;
        this.performance = performance;
        this.salesDate = salesDate;
    }

    public int getAgentId() {
        return agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public int getPoliciesSold() {
        return policiesSold;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public double getCommission() {
        return commission;
    }

    public String getPerformance() {
        return performance;
    }

    public String getSalesDate() {
        return salesDate;
    }
}