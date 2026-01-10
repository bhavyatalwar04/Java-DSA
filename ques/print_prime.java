
public class print_prime {

    public static void main(String[] args) {
        int n = 13;
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean prime(int n) {

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
