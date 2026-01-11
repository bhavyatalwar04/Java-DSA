
public class leap {

    public static void main(String[] args) {
        int year = 2024;

        if (year % 400 == 0) {
            System.out.println("Leap");
        } else if (year % 100 == 0) {
            System.out.println("Not Leap");
        } else if (year % 4 == 0) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }
}
