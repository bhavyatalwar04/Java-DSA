
public class count_vowels {

    public static void main(String[] args) {
        String st = "Hello";

        int v = 0, co = 0;

        for (char c : st.toCharArray()) {
            if (Character.isLetter(c)) {

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    v++;
                } else {
                    co++;
                }
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + co);
    }
}
