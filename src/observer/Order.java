package observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Client> clients = new ArrayList<>();
    private String status;
    public void subscribe(Client client){
        clients.add(client);
    }

    public void unsubscribe(Client client){
        clients.remove(client);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyClients();
    }
    public String getStatus() {
        return status;
    }
    private void notifyClients(){
        for (Client client: clients){
            client.update(this);
        }
    }
}
