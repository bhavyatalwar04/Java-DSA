
public class righ_aligned_num_pattern {

    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            //spaces
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
