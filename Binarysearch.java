import java.util.Arrays;

public class Binarysearch {

    public static int bsearch(int arr[], int l, int h, int d) {

        if (h >= l) {
            int m = l + (h - 1) / 2;
            if (arr[m] == d)
                return m;

            if (arr[m] > d)
                return bsearch(arr, l, m - 1, d);

            if (arr[m] < d)
                return bsearch(arr, m + 1, h, d);

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] A = { 1, 5, 10, 20, 40, 80 };
        int[] B = { 6, 7, 20, 80, 100 };
        int[] C = { 3, 4, 15, 20, 30, 70, 80, 120 };
        int[] arr = A;
        int[] temp = new int[B.length];
        int a = 0;
        for (int i = 0; i < B.length; i++) {
            int k = bsearch(arr, 0, B.length - 1, B[i]);
            if (k != -1) {
                temp[a] = B[i];
                a++;
            }
        }
        int[] temp1 = new int[a];
        arr = C;
        int b = 0;
        for (int i = 0; i < a; i++) {
            int k = bsearch(arr, 0, C.length - 1, temp[i]);
            if (k != -1) {
                temp1[i] = temp[i];
                b++;
            }
        }
        System.out.println("Common numbers in the arrays using binary search :");
        if (a == b) {
            System.out.println(Arrays.toString(temp1));
        } else {
            int[] temp2 = new int[b];
            for (int i = 0; i < b; i++) {
                temp2[i] = temp1[i];
            }
            System.out.println(Arrays.toString(temp2));
        }
    }
}
