public class DigitRange {
    public static void main(String[] args) {
        range(68437);
    }

    public static int range(int num) {
        num = Math.abs(num);
        int max = num % 10;
        int min = num % 10;
        num /= 10;

        while (num > 0) {
            int digit = num % 10;

            if (digit > max) {
                max = digit;
            } else if (digit < min) {
                min = digit;
            }

            num /= 10;
        }

        return max - min + 1;
    }

}
