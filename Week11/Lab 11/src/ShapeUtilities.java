public class ShapeUtilities {
    public static void shapeCount (Shape[] shapes){
        int circles=0;
        int rectagnles=0;
        int spheres=0;
        int cubes=0;

        for (int i=0;i< shapes.length;i++){
            if (shapes[i]!=null){
                if (shapes[i] instanceof Circle){
                    circles++;
                }
                if (shapes[i] instanceof Rectangle){
                    rectagnles++;
                }
                if (shapes[i] instanceof Sphere){
                    spheres++;
                }
                if (shapes[i] instanceof Cube){
                    cubes++;
                }
            }
        }
        System.out.println("Total Circles: "+circles);
        System.out.println("Total Rectangles: "+rectagnles);
        System.out.println("Total Spheres: "+spheres);
        System.out.println("Total Cubes: "+cubes);
    }
}
