package problemdomain;

public class PickupTruck extends Vehicle {
    private String cargoBedType;
    private int cargoCapacity;

    public PickupTruck(long carID, String vehicleType, String subtype, int speed, double fuel, int seats, int year,
                       String drivetrain, int price, int quantity, String cargoBedType, int cargoCapacity) {
        super(carID, vehicleType, subtype, speed, fuel, seats, year, drivetrain, price, quantity);
        this.cargoBedType = cargoBedType;
        this.cargoCapacity = cargoCapacity;
    }
}
