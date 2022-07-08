import javax.sound.sampled.SourceDataLine;

public class Minop {

    public static void minop(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1])
                count++;
        }
        System.out.println("Minimum no of operations : ");
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1 };
        minop(arr);

    }

}
