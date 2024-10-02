package Singletone;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("John Doe");
        Driver_Manager driverManager = Driver_Manager.getInstance();
        String driver = driverManager.findNearestDriver("Location A");
        passenger.assignTaxi(driver);
    }
}
