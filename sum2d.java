
class sum2d {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
        System.out.println("The sum is : " + sum(arr));
    }

    public static int sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
