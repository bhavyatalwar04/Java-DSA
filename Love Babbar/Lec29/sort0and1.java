
import java.util.Arrays;

public class sort0and1 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int l = 0, h = arr.length - 1;
        while (l < h) {
            if (arr[l] == 1 && arr[h] == 0) {
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
                l++;
                h--;
            } else if (arr[l] == 0) {
                l++;
            } else if (arr[h] == 1) {
                h--;
            }
        }
    }
}
