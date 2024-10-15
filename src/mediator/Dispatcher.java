package mediator;

public class Dispatcher {
    public void notifyDriver(Drivers drivers) {
        System.out.println("Dispatcher notified driver: " + drivers.getName());
    }
}
