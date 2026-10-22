package problemdomain;

public abstract class Vehicle {
    private long carID;
    private String vehicleType;
    private String subtype;
    private int speed;
    private double fuel;
    private int seats;
    private int year;
    private String drivetrain;
    private int price;
    private int quantity;

    public Vehicle() {
    }

    public Vehicle(long carID, String vehicleType, String subtype, int speed, double fuel, int seats, int year,
                   String drivetrain, int price,  int quantity) {
        this.carID = carID;
        this.vehicleType = vehicleType;
        this.subtype = subtype;
        this.speed = speed;
        this.fuel = fuel;
        this.seats = seats;
        this.year = year;
        this.drivetrain = drivetrain;
        this.price = price;
        this.quantity = quantity;
    }

    public long getCarID() {
        return carID;
    }

    public void setCarID(long carID) {
        this.carID = carID;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDrivetrain() {
        return drivetrain;
    }

    public void setDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {

    }
}
