package mediator;

public class Clients {
    private String name;
    public Clients(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void requestDriver(Mediator mediator){
        mediator.reguestDriver(this);
    }
}
