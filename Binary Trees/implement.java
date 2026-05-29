
public class implement {

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

        // display(a);
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(prod(a));
        System.out.println(maximum(a));
        System.out.println(minimum(a));

    }

    // private static void display(Node root) {
    //     if (root == null) {
    //         return;
    //     }
    //     System.out.println(root.val);
    //     display(root.left);
    //     display(root.right);
    // }
    private static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    private static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    private static int prod(Node root) {
        int product = 1;
        if (root == null) {
            return 1;
        }
        return product * root.val * prod(root.left) * prod(root.right);
    }

    private static int maximum(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(maximum(root.left), maximum(root.right)));
    }

    private static int minimum(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val, Math.min(minimum(root.left), minimum(root.right)));
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
