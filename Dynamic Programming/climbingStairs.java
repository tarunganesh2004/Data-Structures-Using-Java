// https://leetcode.com/problems/climbing-stairs/

public class climbingStairs {
    public static void main(String[] args) {
        int n = 4;
        int r = climb(n);
        System.out.println(r);
    }

    public static int climb(int n) {
        if (n <= 2)
            return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];

        }
        return dp[n];
    }
}
