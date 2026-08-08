package Nashua_Haque.Beneficiary;

public class BeneficiaryGoal4Processor {

    private String fileName;
    private String fileFormat;
    private double size;
    private String documentType;
    private String uploadStatus;
    private String verified;
    private String remarks1;
    private String remarks2;
    private String remarks3;
    private String date;

    public BeneficiaryGoal4Processor(String fileName,
                                     String fileFormat,
                                     double size,
                                     String documentType,
                                     String uploadStatus,
                                     String verified,
                                     String remarks1,
                                     String remarks2,
                                     String remarks3,
                                     String date) {

        this.fileName = fileName;
        this.fileFormat = fileFormat;
        this.size = size;
        this.documentType = documentType;
        this.uploadStatus = uploadStatus;
        this.verified = verified;
        this.remarks1 = remarks1;
        this.remarks2 = remarks2;
        this.remarks3 = remarks3;
        this.date = date;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public double getSize() {
        return size;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getUploadStatus() {
        return uploadStatus;
    }

    public String getVerified() {
        return verified;
    }

    public String getRemarks1() {
        return remarks1;
    }

    public String getRemarks2() {
        return remarks2;
    }

    public String getRemarks3() {
        return remarks3;
    }

    public String getDate() {
        return date;
    }
}