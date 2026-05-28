
import java.util.*;

public class stlqueues {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);

        //Traverse 1
        // for (int i = 0; i < q.size(); i++) {
        //     int x = q.remove();
        //     System.out.println(x);
        //     q.offer(x);
        // }
        // System.out.println(q);
        //Traverse 2
        // for (int i = 0; i < q.size(); i++) {
        //     System.out.println(q.peek());
        //     q.offer(q.poll());
        // }
        // System.out.println(q);
    }
}
