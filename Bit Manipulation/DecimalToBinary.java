public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber = -27;
        String binaryNumber = convertToBinary(decimalNumber);
        System.out.println("Binary representation of " + decimalNumber + " is: " + binaryNumber);
    }

    public static String convertToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binaryStringBuilder = new StringBuilder();

        // Include the sign bit
        if (decimalNumber < 0) {
            binaryStringBuilder.append("1");
        } else {
            binaryStringBuilder.append("0");
        }

        // Convert the absolute value of the number to binary
        decimalNumber = Math.abs(decimalNumber);

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryStringBuilder.insert(1, remainder);
            decimalNumber /= 2;
        }

        return binaryStringBuilder.toString();
    }
}
