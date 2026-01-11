
public class prime {

    public static void main(String[] args) {
        int n = 77;

        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                System.out.println("not prime");
                break;
            }
        }
        System.out.println("prime");
    }
}
