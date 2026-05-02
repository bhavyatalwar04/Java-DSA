
public class max_freq {

    public static void main(String[] args) {
        int n = 0;

        int[] freq = new int[10];

        if (n == 0) {
            freq[0]++;
        }

        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        int max_freq = 0;
        int maxDigit = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > max_freq) {
                max_freq = freq[i];
                maxDigit = i;
            }
        }

        System.out.println(maxDigit);
    }
}
