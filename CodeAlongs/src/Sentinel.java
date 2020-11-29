import java.util.Scanner;

public class Sentinel {
    public static final int SENTINEL = -1;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number " + "(" + SENTINEL + " to quit) : ");
        int number = console.nextInt();
        int min = number;
        // while number is not 0 (to quit)
        while (number != SENTINEL) {
            if (number < min) {
                min = number;
            }
            System.out.print("Enter a number " + "(" + SENTINEL + " to quit) : ");
            number = console.nextInt();

        }
        System.out.println("Minimum is : " + min);
    }
}
