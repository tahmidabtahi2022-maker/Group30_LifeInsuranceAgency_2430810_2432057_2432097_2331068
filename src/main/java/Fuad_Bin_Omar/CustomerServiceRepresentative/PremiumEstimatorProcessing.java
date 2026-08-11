package Fuad_Bin_Omar.CustomerServiceRepresentative;

import java.time.LocalDate;

public class PremiumEstimatorProcessing {
    private String HealthStatus;
    private float CoverageAmount, MonthlyPremium, AnnualPremium;
    private LocalDate DateofBirth;

    public PremiumEstimatorProcessing(String healthStatus, float coverageAmount, float monthlyPremium, float annualPremium, LocalDate dateofBirth) {
        HealthStatus = healthStatus;
        CoverageAmount = coverageAmount;
        MonthlyPremium = monthlyPremium;
        AnnualPremium = annualPremium;
        DateofBirth = dateofBirth;
    }

    public String getHealthStatus() {
        return HealthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        HealthStatus = healthStatus;
    }

    public float getCoverageAmount() {
        return CoverageAmount;
    }

    public void setCoverageAmount(float coverageAmount) {
        CoverageAmount = coverageAmount;
    }

    public float getMonthlyPremium() {
        return MonthlyPremium;
    }

    public void setMonthlyPremium(float monthlyPremium) {
        MonthlyPremium = monthlyPremium;
    }

    public float getAnnualPremium() {
        return AnnualPremium;
    }

    public void setAnnualPremium(float annualPremium) {
        AnnualPremium = annualPremium;
    }

    public LocalDate getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        DateofBirth = dateofBirth;
    }

    @Override
    public String toString() {
        return "PremiumEstimatorProcessing{" +
                "HealthStatus='" + HealthStatus + '\'' +
                ", CoverageAmount=" + CoverageAmount +
                ", MonthlyPremium=" + MonthlyPremium +
                ", AnnualPremium=" + AnnualPremium +
                ", DateofBirth=" + DateofBirth +
                '}';
    }
}
