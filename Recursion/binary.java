// Decimal to binary using recursion

public class binary {
    public static void main(String[] args) {
        var result = decimalToBinary(10);
        System.out.println(result);
    }

    public static int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * decimalToBinary(n / 2);
    }
}