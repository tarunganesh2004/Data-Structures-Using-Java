public class gcdOfTwoStrings {
    public static String gcdStrings(String s1, String s2) {
        if (!(s1 + s2).equals(s2 + s1)) {
            return "";
        }
        int r = gcd(s1.length(), s2.length());
        return s2.substring(0, r);

    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        String s1 = "LEET";
        String s2 = "CODE";
        String s = gcdStrings(s1, s2);
        System.out.println(s);
    }
}
