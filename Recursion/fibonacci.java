public class fibonacci {
    public static void main(String[] args) {
        fibonacci f = new fibonacci();
        var rec = f.findfibonacci(3);
        System.out.println(rec);
    }

    public int findfibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return findfibonacci(n - 1) + findfibonacci(n - 2);
    }
}
