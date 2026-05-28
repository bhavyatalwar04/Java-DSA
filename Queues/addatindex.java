
import java.util.LinkedList;
import java.util.Queue;

public class addatindex {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);

        //Insert 60 at index 3
        int n = q.size();
        for (int i = 0; i < 3; i++) {
            q.offer(q.poll());
        }
        q.offer(60);
        for (int i = 0; i < n - 3; i++) {
            q.offer(q.poll());

        }
        System.out.println(q);
    }
}
