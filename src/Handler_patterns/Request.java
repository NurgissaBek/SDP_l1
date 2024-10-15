package Handler_patterns;

class Request {
    private boolean carAvailable;
    private double balance;
    private double rideCost;
    private String location;

    public Request(boolean carAvailable, double balance, double rideCost, String location) {
        this.carAvailable = carAvailable;
        this.balance = balance;
        this.rideCost = rideCost;
        this.location = location;
    }

    public boolean isCarAvailable() { return carAvailable; }
    public double getBalance() { return balance; }
    public double getRideCost() { return rideCost; }
    public String getLocation() { return location; }
}