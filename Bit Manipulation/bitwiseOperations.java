public class bitwiseOperations {
    public static void main(String[] args) {
        int a = 8;
        check(a);
        int b=9;
        swap(a, b);
        System.out.println(getSum(a, b));
    }

    // check whether the number is even or odd using bitwise operators
    public static void check(int a) {
        
        if ((a & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    // swapping numbers without using 3rd number using bit manipulation
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
    // sum of two numbers with out using + or - operators
    public static int getSum(int a, int b) {
        int carry = 0;
        while (b != 0) {
            carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
