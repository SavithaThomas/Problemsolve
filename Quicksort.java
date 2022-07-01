import java.util.Arrays;

public class Quicksort {

    static void quicksort(int arr[], int l, int r) {
        if (l < r) {
            int id = partition(arr, l, r);
            quicksort(arr, l, id - 1);
            quicksort(arr, id + 1, r);

        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int arr[], int l, int r) {
        int pivot = arr[r];
        int i = l - 1;
        int j;
        for (j = l; j < r; j++) {
            if (pivot > arr[j]) {
                ++i;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, j);
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 2, 8, 9 };
        quicksort(arr, 0, 4);
        System.out.println("Array sorted using quick sort :");
        System.out.println(Arrays.toString(arr));
    }
}
