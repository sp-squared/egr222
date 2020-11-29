import java.util.Arrays;

public class numUnique {
    public static void main(String[] args) {
        int[] list = {10, 10, 10, 15, 15, 20, 25, 40, 60, 60};
        test(list);
        int[] list2 = {};
        test(list2);
        int[] list3 = {84};
        test(list3);
    }


    public static void test(int[] list) {
        System.out.println("Testing" + Arrays.toString(list));
        System.out.println("length = " + list.length);
        System.out.println("unique = " + numUnique(list));
        System.out.println();


    }

    public static int numUnique(int[] list) {
        if (list.length == 0) {
            return 0;
        } else {
            int count = 1;
            for (int i = 1; i < list.length; i++) {
                if (list[i] != list[i - 1]) {
                    count++;
                }
            }
            return count;
        }
    }
}
