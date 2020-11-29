// Colin Morris-Moncada
// November 15th

public class RectangleEx implements ShapeEx{
    private double width;
    private double height;


    public RectangleEx(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2.0 * (width + height);
    }
}
