
import java.util.*;

class Pair implements Comparable<Triplet> {

    int diff;
    int val;

    Pair(int diff, int val) {
        this.diff = diff;
        this.val = val;
    }

    public int compareTo(Pair p) {
        if(this.diff!=p.diff){
            return Integer.compare(this.diff,p.diff);
        }
        return Integer.compare(this.val,p.val);
    }
}

public class k_closest_elements {

    public static void main(String[] args) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arr){
            if(num==x) continue;
            pq.offer(new Pair(Math.abs(num-x),num));
            if(pq.size()>k) pq.remove();

        }
    }
}

