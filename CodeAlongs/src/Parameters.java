// Colin Morris-Moncada
// Creating a Cosine and Sine table with incremented values rounded to two decimal places

public class Parameters {
    public static void main(String[] args) {
        table(360, 30);
        table(90, 10);
    }

    public static void table(int maximum, int increment){
        System.out.println("n \t sin(n) \t cos(n)");
        int entries = maximum / increment;
        for (int i = 0; i <= entries; i++){
            int n = i * increment;
            double angle = Math.toRadians(n);
            System.out.println(n + "\t" + round2(Math.sin(angle)) + "\t" + round2(Math.cos(angle)));
        }
        System.out.println();
    }

    public static double round2(double number){
        return Math.round(number * 100.0) / 100.0;
    }
}