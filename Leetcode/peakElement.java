//162
public class peakElement {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1, 4, 3 };
        int r = peak(a);
        System.out.println(r);
    }

    public static int peak(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums.length - 1;
    }
}
