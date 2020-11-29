// Colin Morris-Moncada
// Using for loops to draw complex figures
// By using tables and nested for loops we eliminate repetition

public class ComplexFigures {
    // Global in scope but CONSTANT
    public static final int SIZE = 5;

    public static void main(String[] args) {
        // Outer for loop dealing with the line numbers
        for (int line = 1; line <= SIZE; line++){
            // Inner for loop dealing with forward slashes on lines
            for(int slash = 1; slash <= (-4 * line + (4 * SIZE)); slash++){
                System.out.print("/");
            }
            // Inner for loop dealing with stars on lines
            for (int star = 1; star <= (8 * line -8); star++){
                System.out.print("*");

            }
            // Inner for loop dealing with backward slashes on lines
            for(int slash = 1; slash <= (-4 * line + (4 * SIZE)); slash++){
                System.out.print("\\");
            }

            System.out.println();
        }
    }
}