
import java.util.*;

public class sum_array {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(sum(nums));
    }

    public static int sum(ArrayList<Integer> arr) {
        int n = arr.size();
        if (n == 0) {
            return 0;
        }
        int x = arr.remove(n - 1);
        int y = sum(arr);
        return x + y;

    }
}
