class reversewords {
    public static void main(String[] args) {
        String s = "This is a sample Text";
        String[] w = s.split(" ");
        String s1 = "";
        for (int i = w.length - 1; i >= 0; i--) {
            s1 = s1 + w[i];
            if (i > 0) {
                s1 += " ";
            }
        }
        System.out.println(s1);
    }
}