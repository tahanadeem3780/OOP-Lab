class PermitHolder extends Person {
    private static int count = 1;
    private final String permitId;

    public PermitHolder(String name) {
        super(name);
        this.permitId = "P" + count++;
    }

    public String getPermitId() {
        return permitId;
    }

    @Override
    public String toString() {
        return getName() + " (Permit ID: " + permitId + ")";
    }
}