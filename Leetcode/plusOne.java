import java.util.Arrays;

class plusOne {
    public static void main(String[] args) {
        int[] a = { 5, 4, 7, 9 };
        int[] r = plus(a);
        System.out.println(Arrays.toString(r));
    }

    public static int[] plus(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}