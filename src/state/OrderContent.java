package state;

public class OrderContent {
    private OrderState state;
    public  OrderContent(){
        state = new CreatedState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextState(){
        state.next(this);
    }
    public void previousState(){
        state.prev(this);
    }
    public void printStatus(){
        state.printStatus();
    }
}
