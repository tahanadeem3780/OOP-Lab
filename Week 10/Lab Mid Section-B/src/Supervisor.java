class Supervisor extends Person {
    private final int yearsOfExperience;

    public Supervisor(String name, int yearsOfExperience) {
        super(name);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Supervisor: " + getName() + " (" + yearsOfExperience + " years experience)";
    }
}