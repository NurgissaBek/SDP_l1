package command_pattern;

public class ChangeDestination implements Command{
    private Receiver receiver;
    private String destination;
    public ChangeDestination(Receiver receiver, String destination){
        this.receiver = receiver;
        this.destination = destination;
    }

    @Override
    public void execute() {
        receiver.changeDestination(destination);
    }
}
