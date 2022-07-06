import javax.sound.sampled.SourceDataLine;

public class Maxdiff {

    public static void maxdiff(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0) {
                max = arr[i] - arr[i + 1];
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    if (max < (arr[j] - arr[i])) {
                        max = arr[j] - arr[i];
                    }
                }

            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        int[] arr = { 7, 9, 5, 6, 3, 2 };
        maxdiff(arr);
    }

}
