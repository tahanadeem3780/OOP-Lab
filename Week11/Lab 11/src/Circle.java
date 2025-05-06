public class Circle extends Shape2D{
    private double radius;

    public Circle(String name) {
        super(name);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double circumference (){
        return 0;
    }
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + "Area: "+area();
    }
}
