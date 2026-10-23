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

    public String getCargoBedType() {
        return cargoBedType;
    }

    public void setCargoBedType(String cargoBedType) {
        this.cargoBedType = cargoBedType;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo Capacity: " + cargoCapacity +
                "\nCargo Bed Type: " + cargoBedType;
    }
}
