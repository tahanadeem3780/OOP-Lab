class ParkingZone {
    private static int zoneCount = 1;
    private final String zoneId;
    private Vehicle[] vehicles = new Vehicle[5];
    private int index = 0;

    public ParkingZone() {
        this.zoneId = "A" + zoneCount++;
    }

    public void addVehicle(Vehicle v) {
        if (index < 5) {
            vehicles[index++] = v;
        } else {
            System.out.println("Zone " + zoneId + " is full.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Zone " + zoneId + ":\n");
        for (int i = 0; i < index; i++) {
            sb.append("  ").append(vehicles[i]).append("\n");
        }
        return sb.toString();
    }
}
