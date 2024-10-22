package Strategy;

public class FixedPrice implements PricingStrategy{
    @Override
    public double calculatePrice(double value) {
        return 450;
    }
}
