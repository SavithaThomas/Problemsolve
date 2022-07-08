import java.util.Arrays;

public class Disjoint {
    public static int search(int[] arr1, int l, int h, int d) {

        if (h >= l) {
            int m = l + (h - 1) / 2;
            if (arr1[m] == d)
                return m;

            if (arr1[m] > d)
                return search(arr1, l, m - 1, d);

            if (arr1[m] < d)
                return search(arr1, m + 1, h, d);

        }
        return -1;
    }

    public static void disjoint(int[] arr1, int[] arr2) {
        boolean join = false;
        int p;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            p = search(arr1, 0, arr1.length - 1, arr2[i]);
            if (p != -1) {
                join = true;
                break;
            }
        }
        if (!join) {
            System.out.println("Yes, Disjoint");
        } else {
            System.out.println("Not Disjoint");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 12, 34, 11, 3, 9 };
        int[] arr2 = { 2, 1, 4, 5 };
        disjoint(arr1, arr2);

    }
}
