public class Test {
    public static void main(String[] args) {
        String sum = 14 + 1 + " hey there " + +2 + 1;

        boolean ex1d_1 = 11 < 3 + 4;
        boolean ex1d_2 = !(5 / 2 == 2);
        boolean ex1d = ex1d_1 || ex1d_2;
        System.out.println(sum);
        System.out.println(ex1d);

        int test2 = 6 % 20;
        System.out.println(test2);


        int a = 5;
        int b = 1;
        int c = 3;
        int three = a;
        int one = b + 1;
        axiom(a, b, c);
        axiom(c, three, 10);
        axiom(b + c, one + three, a + one);
        a++;
        b = 50;
        axiom(three, 2, one);


        myst(7,5);
    }


    public static void axiom(int c, int b, int a) {
        System.out.println(a + " + " + c + " + " + b);

    }

    public static  void myst(int x,int y){
        while (x>0&&y>0){
            x =x-y;
            y--;
            System.out.print(x + " ");
        }
        System.out.println(y);

    }


}