// https://leetcode.com/problems/buy-two-chocolates/

class buychoco {
    public static int buyChoco(int[] prices, int money) {
        int firstMinCost = Integer.MAX_VALUE;
        int secondMinCost = Integer.MAX_VALUE;

        for (int p : prices) {
            if (p < firstMinCost) {
                secondMinCost = firstMinCost;
                firstMinCost = p;
            } else {
                secondMinCost = Math.min(secondMinCost, p);
            }
        }

        int leftover = money - (firstMinCost + secondMinCost);

        return leftover >= 0 ? leftover : money;
        // if (leftover >= 0) {
        // return leftover;
        // } else {
        // return money;
        // }
    }

    public static void main(String[] args) {
        int[] a = { 3, 2, 3 };
        int r = buyChoco(a, 3);
        System.out.println(r);
    }
}