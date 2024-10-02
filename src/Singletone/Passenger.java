package Singletone;
public class Passenger {
    private String name;
    private String assignedDriver;
    public Passenger(String name) {
        this.name = name;
    }

    public void assignTaxi(String driver) {
        this.assignedDriver = driver;
        System.out.println("Passenger " + name + " is assigned to driver: " + driver);
    }
}

