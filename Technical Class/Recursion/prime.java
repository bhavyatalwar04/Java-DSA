
public class prime {

    public static void main(String[] args) {
        int n = 9;
        boolean Prime = true;

        if (n <= 1) {
            Prime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    Prime = false;
                    break;
                }
            }
        }
        System.out.println(Prime);
    }
}
