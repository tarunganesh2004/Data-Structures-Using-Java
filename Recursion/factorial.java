import java.math.BigInteger;

class factorial {
    public static void main(String[] args) {
        BigInteger n = findFactorial(19);
        System.out.println(n);
    }

    public static BigInteger findFactorial(int n) {
        if (n < 0) {
            return BigInteger.valueOf(-1);
        }
        if (n == 0 || n == 1) {
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(n).multiply(findFactorial(n - 1));
    }
}
