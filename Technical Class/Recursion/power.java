
public class power {

    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println(pow(a, b));
    }

    public static int pow(int x, int y) {
        if (y == 0) {
            return (1);
        }
        return x * pow(x, y - 1);
    }
}
