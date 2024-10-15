package mediator;

import java.util.List;

public class DispatcherMediator implements Mediator {
    private List<Drivers> drivers;
    private Dispatcher dispatcher;

    public DispatcherMediator(List<Drivers> drivers, Dispatcher dispatcher) {
        this.drivers = drivers;
        this.dispatcher = dispatcher;
    }

    @Override
    public void reguestDriver(Clients clients) {
        System.out.println(clients.getName() + " requested a ride.");
        Drivers availableDriver = findAvailableDriver();
        if (availableDriver != null) {
            assignDriver(availableDriver, clients);
        } else {
            System.out.println("No available drivers at the moment.");
        }
    }

    @Override
    public void assignDriver(Drivers driver, Clients client) {
        System.out.println("Assigning driver " + driver.getName() + " to client " + client.getName());
        driver.assignClient(client);
        dispatcher.notifyDriver(driver);
    }

    private Drivers findAvailableDriver() {
        for (Drivers driver : drivers) {
            if (driver.isAvailable()) {
                return driver;
            }
        }
        return null;
    }
}

