import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = " eat ";
        String s2 = "Ate  ";
        checkAnagram(s1, s2);
    }

    public static void checkAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // s1 = s1.replaceAll("\\s", " ");
        // s2 = s2.replaceAll("\\s", " ");

        if (s1.length() != s2.length()) {
            System.out.println("Not anagrams");
            return;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}
