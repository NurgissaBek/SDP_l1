package command_pattern;

import AbstactFactory.Taxi;

public class CreateOrder implements Command{
    private Receiver receiver;
    private String orderDetails;

    public CreateOrder(Receiver receiver, String orderDetails){
        this.receiver = receiver;
        this.orderDetails = orderDetails;
    }

    @Override
    public void execute() {
        receiver.createOrder(orderDetails);
    }
}
