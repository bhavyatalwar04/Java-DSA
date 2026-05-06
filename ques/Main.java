
import java.util.*;

public class Main {

    public static int countNegativeTemperatures(int arr[], int n) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countNegativeTemperatures(arr, n));
    }
}
