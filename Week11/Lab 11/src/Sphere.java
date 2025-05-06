public class Sphere extends Shape3D{
    private double radius;

    public Sphere(String name) {
        super(name);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public double volume() {
        return (double) 4 /3*Math.PI*radius*radius*radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}' + "Area: "+area() + "Volume: "+volume();
    }
}
