import java.util.Random;

public class RandomMid {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n1 = rnd.nextInt();
        //System.out.println("Generated number is: " + n1);
        // 0 to 20
        int n2 = rnd.nextInt(21);

        // 5 to 35
        // inside is 0 to 30
        // outside changes it to 5 to 35
        int n3 = rnd.nextInt(36-5) + 5;
        // 1000 to 99999
        int n4 = rnd.nextInt(11-1) + 1;
        int n5 = rndRange(1000,9999);
        System.out.println(n4);



        System.out.println(n5);
    }

    public static int rndRange(int start, int finish) {
        return (new Random().nextInt(finish + 1 - start) + start);
    }
    // always start at 1.
    public static int rndRange(int finish) {
        return rndRange(1, finish);
    }
}
