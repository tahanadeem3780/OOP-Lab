public class Vehicle {
    private String licensePlate;
    private String vehicleType;
    private Owner owner;

    public Vehicle(String licensePlate, String vehicleType, Owner owner) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", owner=" + owner +
                '}';
    }
}
