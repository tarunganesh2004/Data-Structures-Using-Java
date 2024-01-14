class BitReverser {
    public static String reverseBits(String binaryString) {
        int length = binaryString.length();
        StringBuilder reversedBinary = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversedBinary.append(binaryString.charAt(i));
        }

        return reversedBinary.toString();
    }

    public static void main(String[] args) {
        String binaryString = "1100";
        String reversedBinaryString = reverseBits(binaryString);
        int a = Integer.parseInt(reversedBinaryString, 2);
        System.out.println(a);
    }
}
