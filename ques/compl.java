
import java.util.*;

public class compl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(comp(st));
    }

    public static String comp(String st) {
        String complement = "";
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == '0') {
                complement += '1';
            } else if (ch == '1') {
                complement += '0';
            }
        }

        return complement;

    }
}
