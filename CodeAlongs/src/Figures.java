// Colin Morris-Moncada
// Drawing Complex Figures using static methods

public class Figures {
    public static void main(ConvertNames[] args) {
        egg();
        cup();
        stopSign();
        hat();
    }

    public static void egg() {
        System.out.println("   _________");
        System.out.println("  /         \\");
        System.out.println(" /           \\");
        System.out.println(" \\           /");
        System.out.println("  \\_________/");
        System.out.println();
    }

    public static void cup(){
        System.out.println(" \\           /");
        System.out.println("  \\_________/");
        System.out.println("+-------------+");
        System.out.println();
    }

    public static void hat(){
        System.out.println("   _________");
        System.out.println("  /         \\");
        System.out.println(" /           \\");
        System.out.println("+-------------+");

    }

    public static void stopSign() {
        System.out.println("   _________");
        System.out.println("  /         \\");
        System.out.println(" /           \\");
        System.out.println(" |    STOP    |");
        System.out.println(" \\           /");
        System.out.println("  \\_________/");
        System.out.println();
    }

}
