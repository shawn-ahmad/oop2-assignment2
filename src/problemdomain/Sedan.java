package problemdomain;

public class Sedan extends Vehicle {
    private String trunkSize;

    public Sedan(long carID, String vehicleType, String subtype, int speed, double fuel, int seats, int year,
                 String drivetrain, int price, int quantity, String trunkSize) {
        super(carID, vehicleType, subtype, speed, fuel, seats, year, drivetrain, price, quantity);
        this.trunkSize = trunkSize;
    }
}
