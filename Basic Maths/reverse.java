class reverse {
    public static void main(String[] args) {
        int a = 10234;
        int r = countDigits(a);
        int r1 = reverseNumber(a);
        System.out.println(r1);
        System.out.println(r);
    }

    public static int countDigits(int n) {
        int c = 0;
        while (n > 0) {
            // int lastDigit = n % 10;
            n = n / 10;
            c++;
        }
        return c;
    }

    public static int reverseNumber(int n) {
        if (n < 0) {
            n = n * -1;
        }
        int rev = 0;
        while (n > 0) {
            int l = n % 10;
            rev = rev * 10 + l;
            n = n / 10;
        }
        return rev * -1;
    }
}