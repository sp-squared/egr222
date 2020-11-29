public class MakeChange {
    public static void main(String[] args) {
        canMakeChange(3,4,3);
        canMakeChange(1,5,26);
        canMakeChange(24,2,31);
        canMakeChange(87,19,134);
        canMakeChange(0,0,0);
        canMakeChange(1,1,9);
        canMakeChange(2,7,8);
        canMakeChange(4,3,39);
        canMakeChange(3,80,14);

    }

    public static boolean canMakeChange(int p, int n, int change) {
        boolean answer = (p >= change% 5) && (p + 5 * n >= change);
        System.out.println(answer);
        return  answer;
    }



}
