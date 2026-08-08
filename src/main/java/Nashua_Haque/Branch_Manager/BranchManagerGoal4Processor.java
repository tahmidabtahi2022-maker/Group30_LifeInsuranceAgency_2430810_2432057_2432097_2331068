package Nashua_Haque.Branch_Manager;

public class BranchManagerGoal4Processor {

    private int customerId;
    private String customerName;
    private int agentId;
    private String agentName;
    private String priority;
    private String assignmentDate;

    public BranchManagerGoal4Processor(int customerId,
                                       String customerName,
                                       int agentId,
                                       String agentName,
                                       String priority,
                                       String assignmentDate) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.agentId = agentId;
        this.agentName = agentName;
        this.priority = priority;
        this.assignmentDate = assignmentDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAgentId() {
        return agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public String getPriority() {
        return priority;
    }

    public String getAssignmentDate() {
        return assignmentDate;
    }
}