
public class checkpowerof2 {

    public static void main(String[] args) {
        int a = 0;
        System.out.println(checkpower(a));
    }

    static boolean checkpower(int n) {
        return n >= 1 && (n & (n - 1)) == 0;
    }
}
