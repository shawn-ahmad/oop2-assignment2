package problemdomain;

public class Hybrid extends Vehicle {
    private String powertrain;
    private int electricRange;

    public Hybrid(long carID, String vehicleType, String subtype, int speed, double fuel, int seats, int year,
                  String drivetrain, int price, int quantity, String powertrain, int electricRange) {
        super(carID, vehicleType, subtype, speed, fuel, seats, year, drivetrain, price, quantity);
        this.powertrain = powertrain;
        this.electricRange = electricRange;
    }
}
