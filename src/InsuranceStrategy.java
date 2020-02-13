public abstract class InsuranceStrategy {
    public abstract double calculateInsuranceVeryHigh(double income);

    public abstract int getConstant();

    public abstract double getWeight();

    public abstract int getAdjustment();
}
