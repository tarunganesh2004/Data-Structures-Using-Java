import java.util.Scanner;

class subString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "hello";
        int n = s.length();
        // String s1;
        System.out.println("Substrings of" + s + "are: ");
        for (int i = 0; i < n; i++) {
            String s1;
            for (int j = 0; j < n - i; j++) {
                s1 = s.substring(i, i + j);
                System.out.println(s1);
            }
        }
        sc.close();
    }
}