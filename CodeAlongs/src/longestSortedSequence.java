import java.util.Arrays;

public class longestSortedSequence{
    public static void main(String[] args) {
        int[] a = {1,1,3,3,3,6};
        test(a);
        longSortedSequence(a);

    }

    public static int longSortedSequence(int[] array){
        int count = 0;
        for (int i = 0; i<array.length;i++){
            int x = array[i];
            if(x > array[i]){
                count = count+1;
            }
        }
        return count;
    }

    public static void test(int[] list) {
        System.out.println("Testing" + Arrays.toString(list));
        System.out.println("length = " + list.length);
        System.out.println("sorted = " + longSortedSequence(list));
        System.out.println();


    }



}
