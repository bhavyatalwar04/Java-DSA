
public class reverse_array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

        int low = 0, high = arr.length - 1;

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
