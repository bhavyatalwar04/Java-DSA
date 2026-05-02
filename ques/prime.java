
public class prime {

    public static void main(String[] args) {
        int n = 49;
        boolean isPrime = true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {

            System.out.println("prime");
        } else {
            System.out.println("not prime");

        }
    }
}
