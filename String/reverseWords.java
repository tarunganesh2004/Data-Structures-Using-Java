public class reverseWords {
    public static void main(String[] args) {
        String s = "Hello this is test";
        StringBuilder s1 = new StringBuilder();
        String words[] = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            s1.append(words[i]).append(" ");
        }
        System.out.println(s1.toString().trim());
    }
}
