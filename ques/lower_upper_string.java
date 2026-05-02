
public class lower_upper_string {

    public static void main(String[] args) {
        String st = "hello";

        String res = "";

        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            res += c;
        }
        System.out.println(res);
    }
}
