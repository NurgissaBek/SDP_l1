package state;

public class CreatedState implements OrderState {

    @Override
    public void next(OrderContent order) {
        order.setState(new ConfirmedState());
    }

    @Override
    public void prev(OrderContent order) {
        System.out.println("The order is in its initial state");
    }

    @Override
    public void printStatus() {
        System.out.println("Order created");
    }
}
