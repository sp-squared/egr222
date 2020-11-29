// Colin Morris-Moncada
// November 15th

public class ShapesMain {
    public static void main(String[] args) {
        CircleEx cir = new CircleEx(12);
        RectangleEx rect = new RectangleEx(18,18);
        TriangleEx tri = new TriangleEx(30,30,30);

        printShapeInfo(cir);
        printShapeInfo(rect);
        printShapeInfo(tri);

    }

    public static void printShapeInfo(ShapeEx s){
        System.out.println("area = " + s.getArea());
        System.out.println("perimeter = " + s.getPerimeter());

    }

}
