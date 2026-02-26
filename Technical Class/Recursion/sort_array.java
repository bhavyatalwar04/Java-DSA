
import java.util.*;

public class sort_array {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(1);
        nums.add(2);
        nums.add(7);
        nums.add(0);
        nums.add(5);
        System.out.println(nums);
        sort(nums);
        System.out.println(nums);
    }

    public static void sort(ArrayList<Integer> arr) {
        int n = arr.size();
        if (n == 1) {
            return;
        }
        int x = arr.remove(n - 1);
        sort(arr);
        insert(arr, x);
    }

    public static void insert(ArrayList<Integer> arr, int x) {
        if (arr.size() == 0 || arr.get(arr.size() - 1) <= x) {
            arr.add(x);
            return;
        }

        int y = arr.remove(arr.size() - 1);
        insert(arr, x);
        arr.add(y);
    }
}
