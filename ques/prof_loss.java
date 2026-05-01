
import java.util.Scanner;

public class prof_loss {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        double dif = sp - cp;

        if (dif > 0) {
            double profitPercent = (dif / cp) * 100;
            System.out.println("Profit = " + dif);
            System.out.println("Profit % = " + profitPercent);
        } else if (dif < 0) {
            double loss = -dif;
            double lossPercent = (loss / cp) * 100;
            System.out.println("Loss = " + loss);
            System.out.println("Loss % = " + lossPercent);
        } else {
            System.out.println("No Profit, No Loss");
        }
    }
}
