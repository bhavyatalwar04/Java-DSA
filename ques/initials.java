
public class initials {

    public static void main(String[] args) {
        String st = "Bhavya Talwar";

        String[] words = st.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String s : words) {
            sb.append(Character.toUpperCase(s.charAt(0)));
        }
        System.out.println(sb.toString());
    }
}
