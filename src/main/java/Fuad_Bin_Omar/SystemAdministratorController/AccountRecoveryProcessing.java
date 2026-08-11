package Fuad_Bin_Omar.SystemAdministratorController;

public class AccountRecoveryProcessing {

    private String RegisteredEmailAddress, VerificationCode, NewPassword, ConfirmNewPassword;

    public AccountRecoveryProcessing(String registeredEmailAddress, String verificationCode, String newPassword, String confirmNewPassword) {
        RegisteredEmailAddress = registeredEmailAddress;
        VerificationCode = verificationCode;
        NewPassword = newPassword;
        ConfirmNewPassword = confirmNewPassword;
    }

    public String getRegisteredEmailAddress() {
        return RegisteredEmailAddress;
    }

    public void setRegisteredEmailAddress(String registeredEmailAddress) {
        RegisteredEmailAddress = registeredEmailAddress;
    }

    public String getVerificationCode() {
        return VerificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        VerificationCode = verificationCode;
    }

    public String getNewPassword() {
        return NewPassword;
    }

    public void setNewPassword(String newPassword) {
        NewPassword = newPassword;
    }

    public String getConfirmNewPassword() {
        return ConfirmNewPassword;
    }

    public void setConfirmNewPassword(String confirmNewPassword) {
        ConfirmNewPassword = confirmNewPassword;
    }

    @Override
    public String toString() {
        return "AccountRecoveryProcessing{" +
                "RegisteredEmailAddress='" + RegisteredEmailAddress + '\'' +
                ", VerificationCode='" + VerificationCode + '\'' +
                ", NewPassword='" + NewPassword + '\'' +
                ", ConfirmNewPassword='" + ConfirmNewPassword + '\'' +
                '}';
    }
}
