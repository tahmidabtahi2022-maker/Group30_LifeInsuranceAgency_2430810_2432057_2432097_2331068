package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

public class Branch {
    private int branchId;
    private String branch;

    public Branch(int branchId, String branch) {
        this.branchId = branchId;
        this.branch = branch;
    }

    public int getBranchId() {
        return branchId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchId=" + branchId +
                ", branch='" + branch + '\'' +
                '}';
    }
}
