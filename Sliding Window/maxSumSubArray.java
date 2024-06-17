import java.util.ArrayList;

class maxSum {
    public static void main(String[] args) {
        int[] a = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int max = maxSumsubarray(a, k);
        System.out.println(max);
    }

    public static int maxSumsubarray(int[] a, int k) {
        int n = a.length;
        int windowSum = 0;
        // first window sum
        for (int i = 0; i < k; i++) {
            windowSum += a[i];
        }
        int maxSum = windowSum;
        // slide the window
        for (int i = k; i < n; i++) {
            windowSum = windowSum - a[i - k] + a[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static int maxSumSubArray(ArrayList<Integer> a, int n, int k) {
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a.get(i);
        }
        long max = sum;
        for (int i = 1; i <= n - k; i++) {
            sum = sum - a.get(i - 1);
            sum = sum + a.get(i + k - 1);
            if (sum > max) {
                max = sum;
            }
        }
        return (int)max;
    }
}