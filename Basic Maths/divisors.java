import java.util.ArrayList;
import java.util.Collections;

public class divisors {
    public static void main(String[] args) {
        int n = 19;
        // printDivisors(n);
        print(n);
    }

    public static void printDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void print(int n) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                // System.out.print(i + " ");
                l.add(i);
                if (n / i != i) {
                    l.add(n / i);
                }
            }
        }
        Collections.sort(l);
        System.out.println(l);
    }
}
