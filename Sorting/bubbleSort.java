import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a = { 2, 5, 1, 7, 8, 92, 11, 35 };
        bubble(a);
    }

    public static void bubble(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
