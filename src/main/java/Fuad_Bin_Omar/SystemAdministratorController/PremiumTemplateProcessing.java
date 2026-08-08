package Fuad_Bin_Omar.SystemAdministratorController;

public class PremiumTemplateProcessing {

    private float TermLifeBaseRate, WholeLifeBaseRate, OtherPremiumFactors;

    public float getTermLifeBaseRate() {
        return TermLifeBaseRate;
    }

    public void setTermLifeBaseRate(float termLifeBaseRate) {
        TermLifeBaseRate = termLifeBaseRate;
    }

    public float getWholeLifeBaseRate() {
        return WholeLifeBaseRate;
    }

    public void setWholeLifeBaseRate(float wholeLifeBaseRate) {
        WholeLifeBaseRate = wholeLifeBaseRate;
    }

    public float getOtherPremiumFactors() {
        return OtherPremiumFactors;
    }

    public void setOtherPremiumFactors(float otherPremiumFactors) {
        OtherPremiumFactors = otherPremiumFactors;
    }

    @Override
    public String toString() {
        return "PremiumTemplateProcessing{" +
                "TermLifeBaseRate=" + TermLifeBaseRate +
                ", WholeLifeBaseRate=" + WholeLifeBaseRate +
                ", OtherPremiumFactors=" + OtherPremiumFactors +
                '}';
    }

    public PremiumTemplateProcessing(float termLifeBaseRate, float wholeLifeBaseRate, float otherPremiumFactors) {
        TermLifeBaseRate = termLifeBaseRate;
        WholeLifeBaseRate = wholeLifeBaseRate;
        OtherPremiumFactors = otherPremiumFactors;






    }
}
