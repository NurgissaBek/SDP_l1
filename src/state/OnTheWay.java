package state;

public class OnTheWay implements OrderState{
    @Override
    public void next(OrderContent order) {
        order.setState(new FinishedState());
    }

    @Override
    public void prev(OrderContent order) {
        order.setState(new ConfirmedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Taxi on the way.");
    }
}
