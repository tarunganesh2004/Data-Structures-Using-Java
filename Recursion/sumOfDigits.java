public class sumOfDigits {
    public static void main(String[] args) {
        sumOfDigits s = new sumOfDigits();
        var result = s.sum(111);
        System.out.println(result);
    }

    public int sum(int n) {

        if (n == 0 || n < 0) {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }
}
