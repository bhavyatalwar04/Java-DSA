
public class even_prod {

    public static void main(String[] args) {
        int n = 6;
        int prod = 1;

        for (int i = 2; i <= n; i += 2) {
            prod *= i;
        }
        System.out.println(prod);
    }
}
