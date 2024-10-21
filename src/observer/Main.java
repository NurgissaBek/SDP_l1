package observer;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Client client1 = new Client("Rashad");
        Client client2 = new Client("P Dossy");
        order.subscribe(client1);
        order.subscribe(client2);
        order.setStatus("Taxi approaching");
        order.setStatus("Order confirmed");

    }
}
