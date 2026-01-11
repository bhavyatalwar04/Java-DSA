
public class reverse_string {

    public static void main(String[] args) {
        String str = "Hello";

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());

    }
}
