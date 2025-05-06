//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape shape;
        Shape2D shape2D;
        Shape3D shape3D;
        Shape[] shapes =new Shape[20];
        Circle c1 = new Circle("circle");
        Rectangle r1 = new Rectangle("rectangle");
        Sphere s1 = new Sphere("square");
        Cube cube1 = new Cube("cube");

        shapes[0]=c1;
        shapes[1]=r1;
        shapes[2]=s1;
        shapes[3]=cube1;

        for(int i=0;i< shapes.length;i++){
            if (shapes[i]!=null)
                System.out.println("Area of shape is "+shapes[i].area());
        }

        for (Shape isShape:shapes) {
            if (isShape!=null)
             System.out.println(isShape);
        }

        for (int i=0;i< shapes.length;i++){
            if(shapes[i] instanceof Circle) {
                ((Circle) shapes[i]).setRadius(20);
            }
        }

        for (int i=0;i< shapes.length;i++){
            if(shapes[i] instanceof Rectangle)
                ((Rectangle) shapes[i]).setLength(((Rectangle) shapes[i]).getLength()+5);
        }

        for (int i=0;i< shapes.length;i++){
            if(shapes[i] instanceof Circle) {
                System.out.println(((Circle) shapes[i]).getRadius());
            }
        }

        for (int i=0;i< shapes.length;i++){
            if(shapes[i] instanceof Rectangle) {
                System.out.println(((Rectangle) shapes[i]).getLength());
            }
        }

        System.out.println("Circle area "+c1.area());
        System.out.println("Rectangle perimeter "+ r1.calPerimeter());
        System.out.println("Sphere volume "+ s1.volume());
        System.out.println("Cube volume "+cube1.volume());

        ShapeUtilities.shapeCount(shapes);
    }


}