package state;

public interface OrderState {
    void next(OrderContent order);
    void prev(OrderContent order);
    void printStatus();
}
