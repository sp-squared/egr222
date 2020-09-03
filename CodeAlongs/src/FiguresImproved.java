// Colin Morris-Moncada
// Drawing Complex Figures using static methods

// Improved version with out redundancy

public class FiguresImproved {
    public static void main(String[] args) {
        egg();
        hat();
        cup();
        stopSign();
    }

    public static void egg() {
        eggTop();
        eggBottom();
        System.out.println();
    }

    public static void eggTop(){
        System.out.println("   _________");
        System.out.println("  /         \\");
        System.out.println(" /           \\");
    }

    public static void eggBottom(){
        System.out.println(" \\           /");
        System.out.println("  \\_________/");
    }

    public static void cup(){
        eggBottom();
        line();
        System.out.println();
    }

    public static void hat(){
        eggTop();
        line();
        System.out.println();

    }

    public static void stopSign() {
        eggTop();
        System.out.println(" |    STOP   |");
        eggBottom();
        System.out.println();
    }

    public static void line(){
        System.out.println("+-------------+");
    }
}