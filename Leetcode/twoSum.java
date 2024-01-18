import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        int[] a = { 2, 7, 11, 15 };
        int target = 9;
        int[] r = brute(a, target);
        int[] r1 = optimized(a, target);
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(r1));
    }

    public static int[] brute(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] optimized(int[] a, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int dif = target - a[i];
            if (numMap.containsKey(dif)) {
                return new int[] { numMap.get(dif), i };
            }
            numMap.put(a[i], i);
        }
        return new int[] {};
    }
}
