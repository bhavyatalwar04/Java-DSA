
public class sum_of_digits {

    public static void main(String[] args) {
        int n = 37;

        int prod = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                prod *= digit;
            }
            n = n / 10;
        }
        System.out.println(prod);
    }
}
