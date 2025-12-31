
class invertpyramid {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            //space n-i-1
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //space n-i-1
            for (int j = 0; j < 2 * 5 - (2 * i + 1); j++) {
                System.out.print("*");
            }
            //star 2*n+1
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

}
