import java.util.*;

public class longestSubstringwithKDistinctCharacters {
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println(longestSubstring(s, k));
    }

    public static int longestSubstring(String s, int k) {
        Map<Character, Integer> charCount = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

            // shrinking the window from left
            while (charCount.size() > k) {
                char startChar = s.charAt(start);
                charCount.put(startChar, charCount.get(startChar) - 1);
                if (charCount.get(startChar) == 0) {
                    charCount.remove(startChar);
                }
                start++;
            }

            if (charCount.size() == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }

        }
        return maxLength;
    }
}
