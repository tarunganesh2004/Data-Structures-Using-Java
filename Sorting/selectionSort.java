import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] a = { 210, 523, 124, 700, 158, 923, 112, 350 };
        selection(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selection(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
}
