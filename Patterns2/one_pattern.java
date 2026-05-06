
public class one_pattern {

    public static void main(String[] args) {
        int print = 1;
        int num = 3;
        for (int i = 1; i <= num; i++) {
            System.out.println("");
            for (int j = i; j <= 2 * i + 1; j++) {
                System.out.print(print);
            }
        }
    }
}
