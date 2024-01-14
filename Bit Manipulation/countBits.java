import java.util.Arrays;

class countBits {
    public static void main(String[] args) {
        int n = 124;
        System.out.println(Integer.bitCount(n));
        System.out.println(Integer.toBinaryString(n));
        int n1 = 5;
        int[] a = count(n1);
        System.out.println(Arrays.toString(a));
    }

    public static int[] count(int n) {
        int[] a = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            int c1 = Integer.bitCount(i);
            a[i] = c1;
        }
        return a;
    }
}