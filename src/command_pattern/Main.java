package command_pattern;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        // Create commands
        Command createOrder = new CreateOrder(receiver, "Pickup: Location A, Dropoff: Location B");
        Command cancelOrder = new CancelOrder(receiver);
        Command changeDestination = new ChangeDestination(receiver, "Location C");

        // Execute commands
        createOrder.execute();
        changeDestination.execute();
        cancelOrder.execute();
    }
}

