// Colin Morris-Moncada
// Demonstrates simple For Loop in Java

public class Loops {
    public static void main(String[] args) {
        loop1();
        loop2();
        loop3();
    }

    public static void loop1(){
        System.out.println("STARTING!");

        for (int i = 1; i <= 3; i++){
            System.out.println(i + " squared is " + (i * i));

        }

        System.out.println("DONE!");
        System.out.println();
    }

    public static void loop2(){
        int highestTemp = 7;
        System.out.println("STARTING!");
        for (int i = -3; i <= highestTemp / 2; i++){
            System.out.println(i * 1.8 + 32);
        }
        System.out.println("DONE!");
        System.out.println();
    }

    public static void loop3(){
        System.out.println("T-minus");
        for (int i = 10; i >= 1; i--){
            System.out.println(i + ", ");
        }
        System.out.println("Blast OFF!!!");
        System.out.println();
    }



}