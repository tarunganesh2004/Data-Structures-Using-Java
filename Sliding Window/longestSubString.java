// longest substring without repeating characters

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class longestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longest(s));
        System.out.println(longestsubstring(s));
    }

    public static int longest(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int windowStart = 0;
        int max = 0;
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char right = s.charAt(windowEnd);
            if (map.containsKey(right)) {
                windowStart = Math.max(windowStart, map.get(right) + 1);
            }
            map.put(right, windowEnd);
            max = Math.max(max, windowEnd - windowStart + 1);
        }
        // System.out.println(map);
        return max;
    }

public static int longestsubstring(String s){
    int n = s.length();
    int[] charIndex = new int[128];
    int maxLength = 0;
    int start = 0;
    for (int end = 0; end < n; end++) {
        char c = s.charAt(end);
        if (charIndex[c] > start) {
            start = charIndex[c];
        }
        charIndex[c] = end + 1;
        maxLength = Math.max(maxLength, end - start + 1);
    }
    // System.out.println(Arrays.toString(charIndex));
    return maxLength;
}
}
