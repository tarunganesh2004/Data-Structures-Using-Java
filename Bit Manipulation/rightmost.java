// Isolating the Rightmost 1-bit: n & -n
// The expression n & -n isolates the rightmost 1-bit in the binary representation of n.
// Ex: 12(00001100) rightmost 1 bit is 4

// Setting the Rightmost 0-bit: n | (n + 1)
// The expression n | (n + 1) sets the rightmost 0-bit to 1 in the binary representation of n. 

class righmost {
    public static void main(String[] args) {
        int n = 12;
        // rightmost 1 bit
        System.out.println(n & (-n));
        // Setting right most 0 bit to 1
        int n1 = 13;
        System.out.println(n | n + 1);
        System.out.println(n1|(n1+1));
        
    }
}