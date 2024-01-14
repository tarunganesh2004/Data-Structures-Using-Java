public class lastWord {
    public static void main(String[] args) {
        String s = "This is a sentence";
        String[] words = s.split("s");
        String s1 = words[words.length - 1];
        System.out.println(s1.length());
    }
}
