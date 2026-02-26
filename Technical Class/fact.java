
public class fact {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(facto(n));
        he();
    }

    public static int facto(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        return n * facto(n - 1);
    }

    public static void he() {
        System.out.println("hi");
        return;
    }
}
