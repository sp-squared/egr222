import java.io.*;
import java.util.Scanner;

public class HoursWorked {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter an ID: ");
        int desiredID = console.nextInt();
        boolean found = false;

        Scanner input = new Scanner(new File("hours.txt"));

        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);
            int id = lineScan.nextInt();

            if (id == desiredID) {
                String name = lineScan.next();
                double totalHours = 0.0;
                found = true;
                int days = 0;
                while (lineScan.hasNextDouble()) {
                    totalHours += lineScan.nextDouble();
                    days++;
                }
                System.out.println(name + " worked " + totalHours + totalHours + " hours (" + totalHours / days + "/day)");
            }
        }
        if (!found) {
            System.out.println("ID " + desiredID + " not found");
        }
    }
}
