
public class recuronArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int i = 0;
        print(arr, i);
    }

    static void print(int[] arr, int i) {
        if (i >= arr.length) {
            return;
        }
        System.out.println(arr[i]);
        print(arr, i + 1);
    }
}
