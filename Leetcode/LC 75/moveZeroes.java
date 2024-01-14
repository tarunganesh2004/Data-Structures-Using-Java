import java.util.Arrays;

class moveZeroes {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 0, 0, 2, 0, 4, 0, 2 };
        int[] a1 = move(a);
        System.out.println(Arrays.toString(a1));
    }

    public static int[] move(int[] a) {
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[n];
                a[n] = temp;
                n++;
            }
        }
        return a;
    }
}