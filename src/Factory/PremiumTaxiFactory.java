package Factory;

public class PremiumTaxiFactory extends Factory{
    @Override
    public Taxi createTaxi(String driverName, String licence) {
        return new PremiumTaxi(driverName, licence);
    }
}
