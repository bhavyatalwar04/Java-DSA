
public class gcd {

    public static void main(String[] args) {
        int a = 8;
        int x = a;
        int b = 4;
        int y = b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
        int lcm = (x * y) / a;
        System.out.println(lcm);
    }
}
