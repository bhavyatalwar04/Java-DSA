
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

        int last = list.remove(list.size() - 1);

        reverse(list);

        list.add(0, last);

    }
}
