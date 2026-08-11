package Fuad_Bin_Omar.SystemAdministratorController;

import java.time.LocalDate;

public class SystemAnnouncementsProcessing {

    private String AnnouncementTitle, AnnouncementMessage, PriorityLevel, AnnouncementType;
    private LocalDate StartDate, EndDate;
    private boolean Active;

    public SystemAnnouncementsProcessing(String announcementTitle, String announcementMessage, String priorityLevel, String announcementType, LocalDate startDate, LocalDate endDate, boolean active) {
        AnnouncementTitle = announcementTitle;
        AnnouncementMessage = announcementMessage;
        PriorityLevel = priorityLevel;
        AnnouncementType = announcementType;
        StartDate = startDate;
        EndDate = endDate;
        Active = active;
    }

    public String getAnnouncementTitle() {
        return AnnouncementTitle;
    }

    public void setAnnouncementTitle(String announcementTitle) {
        AnnouncementTitle = announcementTitle;
    }

    public String getAnnouncementMessage() {
        return AnnouncementMessage;
    }

    public void setAnnouncementMessage(String announcementMessage) {
        AnnouncementMessage = announcementMessage;
    }

    public String getPriorityLevel() {
        return PriorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        PriorityLevel = priorityLevel;
    }

    public String getAnnouncementType() {
        return AnnouncementType;
    }

    public void setAnnouncementType(String announcementType) {
        AnnouncementType = announcementType;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean active) {
        Active = active;
    }

    @Override
    public String toString() {
        return "SystemAnnouncementsProcessing{" +
                "AnnouncementTitle='" + AnnouncementTitle + '\'' +
                ", AnnouncementMessage='" + AnnouncementMessage + '\'' +
                ", PriorityLevel='" + PriorityLevel + '\'' +
                ", AnnouncementType='" + AnnouncementType + '\'' +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                ", Active=" + Active +
                '}';
    }
}
