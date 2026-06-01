
import java.util.*;

public class BFS {

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        // levelOrder(a);
        levelOrderLevelWise(a);

    }

    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node front = q.poll();
            System.out.print(front.val + " ");
            if (front.left != null) {
                q.add(front.left);
            }
            if (front.right != null) {
                q.add(front.right);
            }
        }

    }

    private static void levelOrderLevelWise(Node root) {
        Queue<Pair> q = new LinkedList<>();
        int currentLevel = 0;
        q.offer(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair front = q.poll();
            if (front.level != currentLevel) {
                currentLevel++;
                System.out.println();
            }
            System.out.print(front.node.val + " ");
            if (front.node.left != null) {
                q.add(new Pair(front.node.left, front.level + 1));
            }
            if (front.node.right != null) {
                q.add(new Pair(front.node.right, front.level + 1));
            }
        }

    }

    static class Pair {

        int level;
        Node node;

        Pair(Node node, int level) {
            this.level = level;
            this.node = node;
        }
    }

    static class Node {

        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }
}
