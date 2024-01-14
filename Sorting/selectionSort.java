import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] a = { 210, 523, 124, 700, 158, 923, 112, 350 };
        selection(a);
    }

    public static void selection(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
