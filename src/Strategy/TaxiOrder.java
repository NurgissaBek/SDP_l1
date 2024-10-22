package Strategy;

public class TaxiOrder {
    private PricingStrategy pricingStrategy;
    public TaxiOrder(PricingStrategy pricingStrategy){
        this.pricingStrategy = pricingStrategy;
    }
    public void setPricingStrategy(PricingStrategy pricingStrategy){
        this.pricingStrategy = pricingStrategy;
    }
    public double calculateCost(double value){
        return pricingStrategy.calculatePrice(value);
    }
}
