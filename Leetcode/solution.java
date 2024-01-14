class Solution {
    public static int maxProductDifference(int[] arr) {
        // Arrays.sort(nums);
        // int l=nums.length;
        // int n1=nums[l-1]*nums[l-2];
        // int n2=nums[0]*nums[1];
        // return n1-n2;
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        // return max2;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }
        return max2 * max1 - min2 * min1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 1, 9, 4, 8, 5 };
        int r = maxProductDifference(arr);
        System.out.println(r);
        // String s1="";
        // String s2="";
        // s1.equals(s2)
    }
}