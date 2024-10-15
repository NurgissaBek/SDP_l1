package iterator;

public class Driver {
    private String name;
    private double latitude;  // широта
    private double longitude; // долгота
    private boolean available; // доступность

    public Driver(String name, double latitude, double longitude, boolean available) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public double distanceTo(double clientLatitude, double clientLongitude) {
        // Пример расчёта расстояния на основе разности координат
        double latDiff = this.latitude - clientLatitude;
        double lonDiff = this.longitude - clientLongitude;
        return Math.sqrt(latDiff * latDiff + lonDiff * lonDiff); // простое евклидово расстояние
    }
}

