package Adapter;
public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Rashad");
        TaxiService taxiService = new CarSharingAdapter();
        taxiService.requestTaxi(passenger);
    }
}

