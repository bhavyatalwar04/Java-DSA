
public class sum_of_digits {

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sum(n));
    }

    public static int sum(int x) {

        if (x == 0) {
            return 0;
        }
        int a = x % 10;
        x = x / 10;
        return a + sum(x);

    }
}
