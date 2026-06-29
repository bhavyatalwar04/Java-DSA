
class Triplet implements Comparable<Triplet> {

    int ele;
    int row;
    int col;

    Triplet(int ele, int row, int col) {
        this.ele = ele;
        this.row = row;
        this.col = col;
    }

    public int compareTo(Triplet t) {
        return this.ele - t.ele;
    }
}

class Solution {

    public ArrayList<Integer> findSmallestRange(int[][] arr) {
        // code here
        int k = arr.length;
        int n = arr[0].length;

        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            max = Math.max(max, arr[i][0]);
            min = Math.min(min, arr[i][0]);
            pq.offer(new Triplet(arr[i][0], i, 0));
        }

        int a = min;
        int b = max;

        while (true) {
            Triplet top = pq.remove();
            int ele = top.ele;
            int row = top.row;
            int col = top.col;

            if (max - ele < b - a) {
                a = ele;
                b = max;
            }

            if (col == n - 1) {
                break;
            }

            int next = arr[row][col + 1];
            max = Math.max(next, max);
            pq.offer(new Triplet(next, row, col + 1));
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);
        return ans;
    }
}
