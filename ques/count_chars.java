
public class count_chars {

    public static void main(String[] args) {
        String st = "Hello";
        int count = 0;

        for (char c : st.toCharArray()) {
            count++;
        }
        System.out.println(count);
    }
}
