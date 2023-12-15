public class power {
    public static void main(String[] args) {
        var result = findPower(-5, -5);
        System.out.println(result);
    }

    public static double findPower(int base, int exp) {
        if (exp < 0) {
            return 1.0 / (base * findPower(base, exp + 1));
        }
        if (exp == 0) {
            return 1;
        }
        return base * findPower(base, exp - 1);
    }
}
