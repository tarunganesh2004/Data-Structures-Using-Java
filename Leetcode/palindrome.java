public class palindrome {
    public static void main(String[] args) {
        String s2 = "This is a Sample text";
        String s = s2.toLowerCase();
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 = s1 + s.charAt(i);
        }
        System.out.println(s1);
    }
}
