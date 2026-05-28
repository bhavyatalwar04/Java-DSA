
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversequeue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);

        Stack<Integer> st = new Stack<>();

        while (!q.isEmpty()) {
            st.push(q.poll());
        }
        System.out.println(st);

        while (!st.isEmpty()) {
            q.offer(st.pop());
        }
        System.out.println(q);
    }
}
