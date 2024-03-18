// longest substring without repeating characters

import java.util.ArrayList;
import java.util.HashMap;

public class longestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longest(s));
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
        return max;
    }
}
