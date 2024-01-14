class strings {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "pq";
        // String r = mergeStrings(s1, s2);
        String r1 = twoPointers(s1, s2);
        System.out.println(r1);
    }

    public static String mergeStrings(String s1, String s2) {
        StringBuilder s = new StringBuilder();
        int n = 100;
        for (int i = 0; i < n; i++) {
            if (i < s1.length()) {
                s.append(s1.charAt(i));

            }
            if (i < s2.length()) {
                s.append(s2.charAt(i));
            }
        }
        return s.toString();
    }

    public static String twoPointers(String s1, String s2) {
        int n1 = 0;
        int n2 = 0;
        // String s = "";
        int resultLength = s1.length() + s2.length();
        char[] result = new char[resultLength];
        int index = 0;
        while (n1 < s1.length() || n2 < s2.length()) {
            if (n1 < s1.length()) {
                result[index++] = s1.charAt(n1);
                n1++;
            }

            if (n2 < s2.length()) {
                result[index++] = s2.charAt(n2);
                n2++;
            }
        }

        // while(n1<s1.length()){
        // char c1=
        // }
        // return s;
        return new String(result);
    }
}