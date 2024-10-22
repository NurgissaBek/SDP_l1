package Strategy;

public class Main {
    public static void main(String[] args) {
        TaxiOrder order = new TaxiOrder(new DistanceBasedPrice());
        System.out.println("Cost by distance: " + order.calculateCost(10)); // e.g., 10 km

        order.setPricingStrategy(new TimeBasedPrice());
        System.out.println("Cost by time: " + order.calculateCost(30)); // e.g., 30 minutes

        order.setPricingStrategy(new FixedPrice());
        System.out.println("Fixed cost: " + order.calculateCost(0));
    }
}
