public class bitwise {
    public static void main(String[] args) {
        int n = 5; // 0101
        int o = 6;// 0110
        // System.out.println(n | o); // 0111
        // System.out.println(n & o); // 0100
        // System.out.println(n ^ o); // 0011
        // System.out.println((n | o) - (n & o)); == n^o
        System.out.println(5 >> 2); // 5/(2^n)==>5/4==>1(int)
        System.out.println(5 << 2); // 5*2^n ==> 5*4=20
    }

}
