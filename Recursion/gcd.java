public class gcd {
    public static void main(String[] args) {
        int result = findGCD(48, 18);
        System.out.println(result);
    }

    public static int findGCD(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
