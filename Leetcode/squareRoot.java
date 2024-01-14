public class squareRoot {
    public static void main(String[] args) {
        int n = 89;
        int a = Sqroot(n);
        System.out.println(a);
    }

    public static int Sqroot(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int start = 0;
        int end = n;
        int mid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((long) mid * mid > (long) n) {
                end = mid - 1;
            } else if (mid * mid == n) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return Math.round(end);
    }
}
