package state;

public class FinishedState implements OrderState{
    @Override
    public void next(OrderContent order) {
        System.out.println("Order is already completed.");
    }

    @Override
    public void prev(OrderContent order) {
        order.setState(new OnTheWay());
    }

    @Override
    public void printStatus() {
        System.out.println("Order is finshed.");
    }
}
