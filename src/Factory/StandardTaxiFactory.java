package Factory;

public class StandardTaxiFactory extends Factory{
    @Override
    public Taxi createTaxi(String driverName, String licence) {
        return new StandardTaxi(driverName, licence);
    }
}
