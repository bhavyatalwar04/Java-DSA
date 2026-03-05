
import java.util.*;

public class reversearr {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        reverse(nums);
        System.out.println(nums);
    }

    public static void reverse(ArrayList<Integer> list) {

        if (list.size() <= 1) {
            return;
        }

        int first = list.remove(0);

        reverse(list);

        list.add(list.size(), first);

    }
}
