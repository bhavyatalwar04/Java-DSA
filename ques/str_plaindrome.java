
public class str_plaindrome {

    public static void main(String[] args) {
        String str = "madam";

        int l = 0;
        int r = str.length() - 1;

        boolean palin = true;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                palin = false;
            }
        }
    }
}
