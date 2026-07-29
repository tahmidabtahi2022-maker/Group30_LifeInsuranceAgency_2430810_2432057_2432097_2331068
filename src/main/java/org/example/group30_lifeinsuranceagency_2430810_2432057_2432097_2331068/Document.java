package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

public class Document {
    private String documentId;
    private String claimId;
    private String documentName;
    private String documentType;
    private String filePath;
    private String uploadDate;
    private boolean verified;

    public String getDocumentId() {
        return documentId;
    }

    public String getClaimId() {
        return claimId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId='" + documentId + '\'' +
                ", claimId='" + claimId + '\'' +
                ", documentName='" + documentName + '\'' +
                ", documentType='" + documentType + '\'' +
                ", filePath='" + filePath + '\'' +
                ", uploadDate='" + uploadDate + '\'' +
                ", verified=" + verified +
                '}';
    }

    public Document(String documentId, String claimId, String documentName, String documentType, String filePath, String uploadDate, boolean verified) {
        this.documentId = documentId;
        this.claimId = claimId;
        this.documentName = documentName;
        this.documentType = documentType;
        this.filePath = filePath;
        this.uploadDate = uploadDate;
        this.verified = verified;



    }
}
