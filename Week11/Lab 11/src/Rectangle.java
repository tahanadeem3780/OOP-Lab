public class Rectangle extends Shape2D{
    private double length;
    private double width;

    public Rectangle(String name) {
        super(name);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    public double calPerimeter(){
        double perimeter= length*width;
        return perimeter*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}' + "Area: "+area();
    }
}
