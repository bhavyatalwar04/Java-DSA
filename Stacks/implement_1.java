// Implementation using collections

import java.util.*;

public class implement_1 {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        //Push
        st.push(1);
        st.push(2);
        st.push(3);

        //Peek
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println("Size" + " " + st.size());

        //POP
        st.pop();

        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
