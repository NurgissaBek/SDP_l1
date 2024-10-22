package Strategy;

public class DistanceBasedPrice implements PricingStrategy{
    @Override
    public double calculatePrice(double distance) {
        return distance*280;
    }
}
