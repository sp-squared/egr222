// Colin Morris-Moncada
// November 15th

public class TriangleEx implements ShapeEx{
    private double a;
    private double b;
    private double c;


    public TriangleEx(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }
}
