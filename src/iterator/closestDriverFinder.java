package iterator;

public class closestDriverFinder {
    public Driver findClosestDriver(DriversList driverCollection, double clientLatitude, double clientLongitude) {
        Iterator iterator = driverCollection.createIterator();
        Driver closestDriver = null;
        double minDistance = Double.MAX_VALUE;

        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            double distance = driver.distanceTo(clientLatitude, clientLongitude);
            if (distance < minDistance) {
                minDistance = distance;
                closestDriver = driver;
            }
        }

        return closestDriver;
    }
}

