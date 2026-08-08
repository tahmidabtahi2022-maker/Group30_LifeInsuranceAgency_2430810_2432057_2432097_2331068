package Fuad_Bin_Omar.SystemAdministratorController;

public class ManageAccountsProcessing {

    private String FullName, Status, RoleFilter, Email;
    private int SerialNumber;

    public ManageAccountsProcessing(String fullName, String status, String roleFilter, String email, int serialNumber) {
        FullName = fullName;
        Status = status;
        RoleFilter = roleFilter;
        Email = email;
        SerialNumber = serialNumber;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getRoleFilter() {
        return RoleFilter;
    }

    public void setRoleFilter(String roleFilter) {
        RoleFilter = roleFilter;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        SerialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "ManageAccountsProcessing{" +
                "FullName='" + FullName + '\'' +
                ", Status='" + Status + '\'' +
                ", RoleFilter='" + RoleFilter + '\'' +
                ", Email='" + Email + '\'' +
                ", SerialNumber=" + SerialNumber +
                '}';
    }
}
