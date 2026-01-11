
// public class check_vowel {
//     public static void main(String[] args) {
//         char c = 'd';
//         if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//             System.out.println("vowel");
//         } else {
//             System.out.println("not vowel");
//         }
//     }
// }
public class check_vowel {

    public static void main(String[] args) {

        char c = '9';

        if (c >= 'a' && c <= 'z') {
            System.out.println("lowercase");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("uppercase");
        } else if (c >= '0' && c <= '9') {
            System.out.println("digit");
        } else {
            System.out.println("special");
        }
    }
}
