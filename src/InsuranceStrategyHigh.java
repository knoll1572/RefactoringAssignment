public class InsuranceStrategyHigh extends InsuranceStrategy {
    @Override
    public int getConstant() {
        return 765000;
    }

    @Override
    public double getWeight() {
        return 0.1;
    }

    @Override
    public int getAdjustment() {
        return 30000;
    }
}
