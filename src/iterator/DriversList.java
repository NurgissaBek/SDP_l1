package iterator;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class DriversList {
    private List<Driver> drivers;

    public DriversList() {
        this.drivers = new ArrayList<>();
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public Iterator createIterator() {
        return new DriverIterator(drivers);
    }
}

