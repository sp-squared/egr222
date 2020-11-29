// Colin Morris-Moncada
// This program uses a DrawingPanel and Graphics to draw simple graphics
// A simple train car is drawn using rectangles and ovals

// In addition to drawing, this program parameterizing the process to draw multiple train cars with different sizes
import java.awt.*;

public class TrainCar2 {
    public static void main(String[] args) {
        // Represents the window
        DrawingPanel p = new DrawingPanel(450,250);
        // Represents the "pen" that draws the shapes
        Graphics g = p.getGraphics();
        drawTrainCar(g, 40, 10,100);
        drawTrainCar(g, 150, 50, 50);
        drawTrainCar(g,220,10,160);
    }

    public static void drawTrainCar(Graphics g, int x, int y, int size){
        // Relative to a size parameters

        // Body of train
        g.setColor(Color.BLACK);
        g.fillRect(x,y,size,size / 2);

        // Windshield
        g.setColor(Color.CYAN);
        g.fillRect(x + 7 * size / 10,y + size / 10,3 * size / 10,size / 5);

        // Wheels
        g.setColor(Color.RED);
        for (int i = 0; i < 5; i++){
            g.fillOval(size * i / 5 + x,y + 2 * size / 5,size / 5,size / 5);
        }
    }
}
