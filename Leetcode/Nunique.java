
// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
import java.util.Arrays;

public class Nunique {
    public static int[] sum(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = 2 * i - n + 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] r = sum(5);
        System.out.println(Arrays.toString(r));
    }
}
