// Colin Morris-Moncada
// November 15th

public class CircleEx implements ShapeEx{
    private double radius;

    // Constructs a new circle with the given radius
    public CircleEx(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2.0 * Math.PI * radius;
    }
}
