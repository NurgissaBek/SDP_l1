package iterator;
public class Main {
    public static void main(String[] args) {
        // Создаём водителей
        Driver driver1 = new Driver("Alice", 10.5, 20.3, true);
        Driver driver2 = new Driver("Bob", 12.0, 21.4, false);  // Недоступный водитель
        Driver driver3 = new Driver("Charlie", 11.2, 22.1, true);

        // Создаём коллекцию водителей
        DriversList driverCollection = new DriversList();
        driverCollection.addDriver(driver1);
        driverCollection.addDriver(driver2);
        driverCollection.addDriver(driver3);

        // Находим ближайшего водителя к клиенту
        closestDriverFinder finder = new closestDriverFinder();
        double clientLatitude = 11.0;
        double clientLongitude = 21.0;

        Driver closestDriver = finder.findClosestDriver(driverCollection, clientLatitude, clientLongitude);

        if (closestDriver != null) {
            System.out.println("Ближайший водитель: " + closestDriver.getName());
        } else {
            System.out.println("Доступных водителей не найдено.");
        }
    }
}

