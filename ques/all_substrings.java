
// public class all_substrings {
//     public static void main(String[] args) {
//         String str = "abc";
//         for (int i = 0; i < str.length(); i++) {
//             for (int j = i + 1; j <= str.length(); j++) {
//                 System.out.println(str.substring(i, j));
//             }
//         }
//     }
// }
public class all_substrings {

    public static void main(String[] args) {
        String st = "abc";

        for (int i = 0; i < st.length(); i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < st.length(); j++) {
                sb.append(st.charAt(j));
                System.out.println(sb.toString());
            }
        }
    }
}
