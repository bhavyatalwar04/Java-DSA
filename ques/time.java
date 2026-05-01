
import java.util.Scanner;

public class time {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int rem = totalSeconds % 3600;
        int minutes = rem / 60;
        int seconds = rem % 60;

        System.out.println("Time (HH:MM:SS) = "
                + hours + ":" + minutes + ":" + seconds);
    }
}
