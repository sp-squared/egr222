import java.util.Arrays;

public class ArrayZeros {
    public static void main(String[] args) {
        int[] list = {0, 0, 0, 0, 10, 20, 30};
        test(list);
        int[] list2 = {0,2};
        test(list2);
        int[] list3 = {};
        test(list3);

    }

    public static void test(int[] list) {
        System.out.println("before: " + Arrays.toString(list));
        removeZeros(list);
        System.out.println("after: " + Arrays.toString(list));
        System.out.println();
    }

    public static void removeZeros(int[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0) {
                list[count] = list[i];
                count++;

            }
        }
        for (int i = count; i < list.length; i++) {
            list[i] = 0;
        }
    }
}
