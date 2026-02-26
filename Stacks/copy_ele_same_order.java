
import java.util.*;

public class copy_ele_same_order {

    public static void main(String[] args) {

        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        System.out.println(st1);

        Stack<Integer> st2 = new Stack<>();

        while (st1.size() > 0) {
            int x = st1.peek();
            st2.push(x);
            st1.pop();
        }

        System.out.println(st2);

    }
}
