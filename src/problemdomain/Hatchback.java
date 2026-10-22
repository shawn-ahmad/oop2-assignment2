package problemdomain;

public class Hatchback extends Vehicle {
    private String hatchType;

    public Hatchback(long carID, String vehicleType, String subtype, int speed, double fuel, int seats, int year,
                     String drivetrain, int price, int quantity, String hatchType) {
        super(carID, vehicleType, subtype, speed, fuel, seats, year, drivetrain, price, quantity);
        this.hatchType = hatchType;
    }
}
