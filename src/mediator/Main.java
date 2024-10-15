package mediator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        Drivers driver1 = new Drivers("John");
        Drivers driver2 = new Drivers("Sarah");

        DispatcherMediator mediator = new DispatcherMediator(Arrays.asList(driver1, driver2), dispatcher);

        Clients client1 = new Clients("Emily");
        client1.requestDriver(mediator);

        Clients client2 = new Clients("Michael");
        client2.requestDriver(mediator);

        driver1.completeRide();
        client2.requestDriver(mediator);
    }
}

