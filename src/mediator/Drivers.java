package mediator;

public class Drivers {
    private String name;
    private boolean available = true;
    public Drivers(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public boolean isAvailable() {
        return available;
    }
    public void assignClient(Clients clients){
        System.out.println("Driver" + name + "is picking up"+ clients.getName());
        available = false;
    }
    public void completeRide(){
        System.out.println("Driver " + name + "has completed the ride");
        available = true;
    }
}
