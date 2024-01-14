import java.util.Arrays;

class FirstNonRepeatingCharacterIndex {
    public static void main(String[] args) {
        String str = "leetcode";
        // int firstNonRepeatingIndex = findFirstNonRepeatingIndex(str);

        // if (firstNonRepeatingIndex != -1) {
        // System.out.println("The index of the first non-repeating character is: " +
        // firstNonRepeatingIndex);
        // System.out.println("The first non-repeating character is: " +
        // str.charAt(firstNonRepeatingIndex));
        // } else {
        // System.out.println("No non-repeating character found in the string.");
        // }
        findFirstNonRepeatingIndex(str);
    }

    public static void findFirstNonRepeatingIndex(String s) {
        int[] charCount = new int[26]; // An array to store the count of each character

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++; // Increment the count for the current character
            System.out.println(Arrays.toString(charCount));
        }

        // Find the index of the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                // return i; // Return the index if the count is 1 (non-repeating character)
                System.out.println(i);
            }
        }

        // return -1; // Return -1 if no non-repeating character is found
        System.out.println(-1);
    }
}
