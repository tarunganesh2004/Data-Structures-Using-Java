import java.util.Arrays;

public class arrayProduct {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int l = 1;
        for (int i = 0; i < n; i++) {
            result[i] = l;
            l *= nums[i];
        }
        int r = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= r;
            r *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 0, 4, 5 };
        int[] r = productExceptSelf(a);
        System.out.println(Arrays.toString(r));
    }
}