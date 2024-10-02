package AbstactFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new StandardFactory();
        Driver driver = factory.createDriver("Daniele");
        Taxi taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Dos");

        factory = new PremiumFactory();
        taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Merej");
    }
}
