public class Cube extends Shape3D{
    private double side;

    public Cube(String name) {
        super(name);
    }

    public double getNoOfSides() {
        return side;
    }

    public void setNoOfSides(double noOfSides) {
        this.side = noOfSides;
    }

    @Override
    public double area() {
        return side*side*6;
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}' + "Area: "+area() + "Volume: "+volume();
    }
}
