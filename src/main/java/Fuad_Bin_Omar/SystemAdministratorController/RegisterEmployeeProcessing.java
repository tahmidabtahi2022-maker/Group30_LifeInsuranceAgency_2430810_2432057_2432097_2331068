package Fuad_Bin_Omar.SystemAdministratorController;

public class RegisterEmployeeProcessing {

    private String EmployeeName, OfficialEmail, TemporaryPassword, AssignedRole;

    public RegisterEmployeeProcessing(String employeeName, String officialEmail, String temporaryPassword, String assignedRole) {
        EmployeeName = employeeName;
        OfficialEmail = officialEmail;
        TemporaryPassword = temporaryPassword;
        AssignedRole = assignedRole;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getOfficialEmail() {
        return OfficialEmail;
    }

    public void setOfficialEmail(String officialEmail) {
        OfficialEmail = officialEmail;
    }

    public String getTemporaryPassword() {
        return TemporaryPassword;
    }

    public void setTemporaryPassword(String temporaryPassword) {
        TemporaryPassword = temporaryPassword;
    }

    public String getAssignedRole() {
        return AssignedRole;
    }

    public void setAssignedRole(String assignedRole) {
        AssignedRole = assignedRole;
    }

    @Override
    public String toString() {
        return "RegisterEmployeeProcessing{" +
                "EmployeeName='" + EmployeeName + '\'' +
                ", OfficialEmail='" + OfficialEmail + '\'' +
                ", TemporaryPassword='" + TemporaryPassword + '\'' +
                ", AssignedRole='" + AssignedRole + '\'' +
                '}';
    }
}
