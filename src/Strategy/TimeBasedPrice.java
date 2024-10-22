package Strategy;

public class TimeBasedPrice implements PricingStrategy{
    @Override
    public double calculatePrice(double time) {
        return time * 50;
    }
}
