
import java.util.ArrayList;
import java.util.HashMap;

class Pair implements Comparable<Pair>{
    int ele;
    int freq;
    Pair(int ele,int freq){
        this.ele=ele;
        this.freq=freq;
    }
    public int compareTo(Pair p){
        if(this.freq==p.freq) return this.ele-p.ele;
        return this.freq-p.freq;
    }
}
public class top_k_frquent {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ele:arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele:map.keySet()){
            int freq=map.get(ele);
            pq.offer(new Pair(ele,freq));
            if(pq.size()>k) pq.remove();
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(!pq.isEmpty()){
            Pair top=pq.remove();
            ans.add(top.ele);
        }
        return ans;
    }
}