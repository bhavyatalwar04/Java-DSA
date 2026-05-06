
public class one_pattern {

    public static void main(String[] args) {
        int print = 1;
        int num = 3;
        for (int i = 1; i <= num; i++) {
            System.out.println("");
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(print);
            }
        }
    }
}
