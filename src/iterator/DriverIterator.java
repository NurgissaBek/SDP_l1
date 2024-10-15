package iterator;

import java.util.List;

import java.util.List;

public class DriverIterator implements Iterator {
    private List<Driver> drivers;
    private int position = 0;

    public DriverIterator(List<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public boolean hasNext() {
        // Ищем доступного водителя
        while (position < drivers.size()) {
            if (drivers.get(position).isAvailable()) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Driver next() {
        return drivers.get(position++);
    }
}


