
import java.util.*;

public class odd_sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = prod(n);
        System.err.println(result);
    }

    public static int prod(int n) {

        int ans = 1;
        boolean odd = false;

        while (n != 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                ans *= digit;
                odd = true;
            }
            n = n / 10;
        }

        return odd ? ans : 0;

    }
}
