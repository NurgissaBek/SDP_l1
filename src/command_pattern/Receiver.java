package command_pattern;

public class Receiver {
    public void createOrder(String orderDetails){
        System.out.println("Order is created with details " +orderDetails);
    }
    public void cancelOrder(){
        System.out.println("Order has been cancelled");
    }
    public void changeDestination(String newDestination){
        System.out.println("Destination was changed to " + newDestination);
    }
}
