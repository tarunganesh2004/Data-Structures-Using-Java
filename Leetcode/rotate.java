
// import java.lang.reflect.Array;
import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] temp = new int[a.length];
        for (int i = a.length; i >= 0; i--) {
            temp[a.length - i] = a[a.length - 1];
        }
        temp[a.length - 1] = a[0];
        int[] r = rotateArray(a, 3);
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(temp));
    }

    public static int[] rotateArray(int[] a, int k) {
        int n = a.length;
        int[] temp = new int[n];
        while (k > 0) {
            for (int i = 1; i < n; i++) {
                temp[i - 1] = temp[i];
            }
            temp[n - 1] = a[0];
            k--;
        }
        return temp;
    }
}
