package parameters;

import java.util.Scanner;

public class objects {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "there";
        String combined = s1 + " " + s2;
        // Combines strings to make new phrases
        System.out.println(combined);
        System.out.println(combined.length());

        String name = "Tweedle Dee";
        System.out.println(name);
        name = name.replace("ee", "oo");
        // Replaces every target phrase "ee" with "oo"
        System.out.println(name);

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.println("Your number is: " + n);
    }
}
