package Adapter;
public class CarSharingAdapter implements TaxiService {
    public CarSharing carSharing;

    public CarSharingAdapter() {
        this.carSharing = new CarSharing(new Car());
    }

    @Override
    public void requestTaxi(Passenger passenger) {
        carSharing.rentFreeCar(new Driver());
        System.out.println("Такси для пассажира " + passenger.getName() + " было запрошено.");
    }
}

