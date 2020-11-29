import java.util.Scanner;

public class digitsInARow {
    public static void main(String[] args) {
        digitInARow(10);

    }

    public static int digitInARow(int n){
        int count = 1;
        int last = 1;
        int max = 1;
        while (n > 0) {
            if (n % 10 == last) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
            }
            last = n % 10;
            n = n / 10;
        }
        System.out.println(max);
        return max;

    }
}
