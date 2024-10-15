package Handler_patterns;

public class Main {
    public static void main(String[] args) {
        // Client request example
        Request request = new Request(true, 150, 120, "valid_location_1");

        // Create handler objects
        Handler availabilityHandler = new CarAvailabilityHandler();
        Handler balanceHandler = new BalanceCheckHandler();
        Handler locationHandler = new LocationCheckHandler();

        // Set up the chain
        availabilityHandler.setNext(balanceHandler);
        balanceHandler.setNext(locationHandler);

        // Start the chain
        String response = availabilityHandler.handle(request);
        System.out.println(response);
    }
}
