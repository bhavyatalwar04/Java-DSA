
import java.util.Scanner;

public class lib_fine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of days: ");
        int days = sc.nextInt();

        int fine = 0;

        if (days <= 5) {
            fine = days * 2;
            System.out.println("The fine is: " + fine);
        } else if (days <= 10) {
            fine = (5 * 2) + (days - 5) * 4;
            System.out.println("The fine is: " + fine);
        } else if (days <= 30) {

            fine = (5 * 2) + (5 * 4) + (days - 10) * 6;
            System.out.println("The fine is: " + fine);
        } else {
            System.out.println("Membership Cancelled");
        }
    }
}
