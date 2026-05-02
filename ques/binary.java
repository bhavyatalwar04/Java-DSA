
public class binary {

    public static void main(String[] args) {
        int n = 5;

        String binary = "";

        if (n == 0) {
            binary = "0";
        } else {
            while (n > 0) {
                int rem = n % 2;
                binary = rem + binary;
                n /= 2;
            }
        }
        System.out.println(binary);
    }
}
