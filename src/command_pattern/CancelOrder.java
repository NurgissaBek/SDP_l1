package command_pattern;

public class CancelOrder implements Command{
    private Receiver receiver;
    public CancelOrder(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.cancelOrder();
    }
}
