import java.util.Arrays;

class RightMost {
    public static void main(String[] args) {
        int m = 11;
        int n = 6;

        String s1 = Integer.toBinaryString(m);
        String s2 = Integer.toBinaryString(n);
        // Integer.bitCount(n)

        // Make sure the binary strings have the same length
        int maxLength = Math.max(s1.length(), s2.length());
        s1 = String.format("%" + maxLength + "s", s1).replace(' ', '0');
        s2 = String.format("%" + maxLength + "s", s2).replace(' ', '0');

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));

        for (int i = 1; i <= maxLength; i++) {
            if (c1[maxLength - i] != c2[maxLength - i]) {
                System.out.println("Rightmost differing bit position: " + i);
                break; // Stop after finding the rightmost differing bit
            }
        }
    }
}
