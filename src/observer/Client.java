package observer;

public class Client {
    private String name;
    public Client(String name){
        this.name = name;
    }
    public void update(Order order){
        System.out.println("Client " + name + "is notified. Order status chnaged to " + order.getStatus());
    }
}
