class Solution {
    public static int findLucky(int[] arr) {
        int temp[] = new int[501];
        for (int i : arr)
            temp[i]++;
        int ans = -1;
        for (int i = 1; i < temp.length; i++) {
            if (i == temp[i])
                ans = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 3, 3 };
        // int r = findLucky(arr);
        // System.out.println(r);
        int temp[] = new int[501];
        for (int i : arr)
            System.out.println(temp[i]++);
    }
}