
public class max_freq {

    public static void main(String[] args) {
        int num = 1224766766;

        int[] freq = new int[10];

        if (num == 0) {
            freq[0]++;
        }

        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num = num / 10;
        }

        int maxCount = freq[0];
        int maxDigit = 0;

        for (int i = 1; i < 10; i++) {
            if (maxCount < freq[i]) {
                maxCount = freq[i];
                maxDigit = i;
            }
        }
        System.out.println(maxDigit);
    }
}
