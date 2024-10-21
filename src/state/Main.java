package state;

public class Main {
    public static void main(String[] args) {
        OrderContent order = new OrderContent();
        order.printStatus();
        order.nextState();
        order.printStatus();
        order.nextState();
        order.printStatus();
        order.nextState();
        order.printStatus();
    }
}
