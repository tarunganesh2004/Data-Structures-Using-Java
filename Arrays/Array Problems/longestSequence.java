public class longestSequence {
    public static void main(String[] args) {
        int n = 7;
        String s = Integer.toBinaryString(n);
        // System.out.println(s);
        int totalCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
                totalCount = Math.max(totalCount, count);
            } else {
                count = 0;
            }
        }
        System.out.println(totalCount);
    }
}
