// Colin Morris-Moncada
// This program uses a DrawingPanel and Graphics to draw simple graphics
// A simple train car is drawn using rectangles and ovals
import java.awt.*;

public class TrainCar {
    public static void main(String[] args) {
        // Represents the window
        DrawingPanel p = new DrawingPanel(300,200);
        // Represents the "pen" that draws the shapes
        Graphics g = p.getGraphics();

        // Body of train
        g.fillRect(40,10,100,50);

        // Windshield
        g.setColor(Color.CYAN);
        g.fillRect(110,20,30,20);

        // Wheels
        g.setColor(Color.RED);
        for (int i = 0; i < 5; i++){
            g.fillOval(20 * i + 40,50,20,20);
        }
    }
}
