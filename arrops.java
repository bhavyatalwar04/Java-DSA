
import java.util.*;

class arrops {

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 7, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 6));
    }
}
