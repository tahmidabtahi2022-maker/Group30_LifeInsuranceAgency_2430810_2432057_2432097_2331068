package Nashua_Haque.Branch_Manager;

public class BranchManagerGoal3Processor {

    private int requestId;
    private int agentId;
    private String agentName;
    private String requestType;
    private String requestDate;
    private String status;

    public BranchManagerGoal3Processor(int requestId,
                                       int agentId,
                                       String agentName,
                                       String requestType,
                                       String requestDate,
                                       String status) {

        this.requestId = requestId;
        this.agentId = agentId;
        this.agentName = agentName;
        this.requestType = requestType;
        this.requestDate = requestDate;
        this.status = status;
    }

    public int getRequestId() {
        return requestId;
    }

    public int getAgentId() {
        return agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public String getRequestType() {
        return requestType;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}