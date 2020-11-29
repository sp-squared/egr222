import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(add(5,10));
        fie();
    }

    public static int add(int x, int y){
        return x+y;
    }

    public static void fie() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("data.txt"));
    }


}
