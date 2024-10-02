package Singletone;
public class Driver_Manager {
    private static Driver_Manager instance;
    private Driver_Manager(){};
    public static Driver_Manager getInstance(){
        if (instance==null){
            instance = new Driver_Manager();
        }
        return instance;
    }
    public String findNearestDriver(String location){
        System.out.println("Nearest driver found: " + " Driver1");
        return "Driver1";
    }
}
