
import java.util.*;

class Triplet implements Comparable<Triplet>{
    int dist;
    int x;
    int y;
    Triplet(int dist,int x,int y){
        this.dist=dist;
        this.x=x;
        this.y=y;
    }
    public int compareTo(Triplet t){
        return Integer.compare(this.dist, t.dist);
    }
}
public class k_closest_points {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[]point:points){
            int x=point[0];
            int y=point[1];
            int dist=x*x+y*y;
            pq.add(new Triplet(dist,x,y));
            if(pq.size()>k) pq.remove();
        }
        int[][]ans
    }
}