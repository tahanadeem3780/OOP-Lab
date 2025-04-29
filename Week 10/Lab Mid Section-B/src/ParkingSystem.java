public class ParkingSystem {
    private static ParkingSystem instance;
    private String campusName;
    private Supervisor supervisor;
    private ParkingZone[] zones = new ParkingZone[10];
    private int zoneCount = 0;
    private PermitHolder[] permitHolders = new PermitHolder[10];
    private int permitHolderCount = 0;

    private ParkingSystem(String campusName, Supervisor supervisor) {
        if (supervisor == null) {
            System.out.println("Supervisor is required to start the system. System not initialized.");
            return;
        }
        this.campusName = campusName;
        this.supervisor = supervisor;
    }

    public static ParkingSystem getInstance(String campusName, Supervisor supervisor) {
        if (instance == null && supervisor != null) {
            instance = new ParkingSystem(campusName, supervisor);
        } else if (instance == null) {
            System.out.println("Supervisor is required to create the Parking System.");
        }
        return instance;
    }

    public void addZone(ParkingZone zone) {
        if (zoneCount < zones.length) {
            zones[zoneCount++] = zone;
        } else {
            System.out.println("Maximum zones reached.");
        }
    }

    public void addPermitHolder(PermitHolder ph) {
        if (permitHolderCount < permitHolders.length) {
            permitHolders[permitHolderCount++] = ph;
        } else {
            System.out.println("Maximum permit holders reached.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Parking System for " + campusName + "\n");
        sb.append(supervisor).append("\n\nZones:\n");
        for (int i = 0; i < zoneCount; i++) {
            sb.append(zones[i]);
        }
        sb.append("\nPermit Holders:\n");
        for (int i = 0; i < permitHolderCount; i++) {
            sb.append("  ").append(permitHolders[i]).append("\n");
        }
        return sb.toString();
    }
}