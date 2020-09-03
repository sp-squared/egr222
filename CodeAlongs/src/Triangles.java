// Colin Morris-Moncada
// Prompts user for triangle size and draws a text triangle figure based on the input

import java.util.*;

public class Triangles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Triangle Size : ");
        int triSize = console.nextInt();
        draw(triSize);
    }

    public static void draw(int size){
        for (int line  = 1; line <= size; line++){
            printString(" ", -1 * line + size);
            printString("*", 2 * line - 1);
            System.out.println();
        }
    }

    public static void printString(String s, int times){
        for (int i = 1; i <= times; i++){
            System.out.print(s);
        }
    }
}
