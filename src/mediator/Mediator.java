package mediator;

public interface Mediator {
    void reguestDriver(Clients clients);
    void assignDriver(Drivers drivers, Clients clients);
}
