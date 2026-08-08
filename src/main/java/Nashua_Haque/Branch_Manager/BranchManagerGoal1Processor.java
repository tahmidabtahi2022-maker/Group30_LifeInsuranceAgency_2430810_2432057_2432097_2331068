package Nashua_Haque.Branch_Manager;

public class BranchManagerGoal1Processor {

    private int agentId;
    private String agentName;
    private String email;
    private String phone;
    private String department;
    private String dateJoined;
    private String status;
    private String action;

    public BranchManagerGoal1Processor(int agentId,
                                       String agentName,
                                       String email,
                                       String phone,
                                       String department,
                                       String dateJoined,
                                       String status,
                                       String action) {

        this.agentId = agentId;
        this.agentName = agentName;
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.dateJoined = dateJoined;
        this.status = status;
        this.action = action;
    }

    public int getAgentId() {
        return agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDepartment() {
        return department;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public String getStatus() {
        return status;
    }

    public String getAction() {
        return action;
    }
}