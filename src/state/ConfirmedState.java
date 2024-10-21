package state;

public class ConfirmedState implements OrderState{
    @Override
    public void next(OrderContent order) {
        order.setState(new OnTheWay());
    }

    @Override
    public void prev(OrderContent order) {
        order.setState(new CreatedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order confirmed.");
    }
}
