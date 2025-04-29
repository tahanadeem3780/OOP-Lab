class Owner extends Person {
    private static int count = 1;
    private final String ownerId;

    public Owner(String name) {
        super(name);
        this.ownerId = String.format("O%03d", count++);
    }

    public String getOwnerId() {
        return ownerId;
    }

    @Override
    public String toString() {
        return getName() + " (Owner ID: " + ownerId + ")";
    }
}
