import java.util.Arrays;

public class Problemsolve {

    // String Reversal

    public static void reversestr(String s) {

        char[] rarr = s.toCharArray();
        char[] myarr = new char[s.length()];
        int k = 0;
        for (int i = rarr.length - 1; i >= 0; i--) {
            myarr[k] = rarr[i];
            k++;
        }

        String news = new String(myarr);
        System.out.println("The reversed string :");
        System.out.println(news);
    }

    // Palindrome

    public static void stringpalindrome(String s) {

        char[] rarr = s.toCharArray();
        char[] myarr = new char[s.length()];
        int k = 0;
        for (int i = rarr.length - 1; i >= 0; i--) {
            myarr[k] = rarr[i];
            k++;
        }

        if (Arrays.equals(rarr, myarr)) {
            System.out.println("The strings are palindrome.");
        } else {
            System.out.println("The strings are not palindrome.");
        }

    }

    // Repeating and Nonrepeating numbers

    public static void repnum(int[] arr) {

        int[] temp = new int[arr.length];
        Arrays.sort(arr);
        int a, b;
        a = 0;
        b = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                temp[a] = arr[i];
                i++;
                a++;
            }
        }
        int[] repno = new int[a];
        for (int i = 0; i < a; i++) {
            repno[i] = temp[i];
        }
        int[] temp1 = new int[arr.length - a];

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < a; j++) {
                if (arr[i] == repno[j]) {
                    found = true;
                }
            }
            if (!found) {
                temp1[b] = arr[i];
                b++;
            }
        }

        int[] nonrepno = new int[b];
        for (int i = 0; i < b; i++) {
            nonrepno[i] = temp1[i];
        }

        System.out.println("Repeating numbers :");
        System.out.println(Arrays.toString(repno));
        System.out.println("Nonrepeating numbers :");
        System.out.println(Arrays.toString(nonrepno));
    }

    // Minimum Maximum number

    public static void minmax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Minimum number : " + min);
        System.out.println("Maximum number : " + max);
    }
    // Moving negative numbers to the end

    public static void moveneg(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.println("After moving negative numvbers to the end :");
        System.out.println(Arrays.toString(temp));
    }

    // Duplicates in an Array

    public static void duparr(int[] arr) {

        int[] temp = new int[arr.length];
        Arrays.sort(arr);
        int a;
        a = 0;
        // b = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                temp[a] = arr[i];
                i++;
                a++;
            }
        }
        int[] darr = new int[a];
        for (int i = 0; i < a; i++) {
            darr[i] = temp[i];
        }
        System.out.println("Duplicate numbers in the array : ");
        System.out.println(Arrays.toString(darr));
    }

    public static void main(String[] args) {

        reversestr("savitha");
        stringpalindrome("ada");
        int[] arr = { 8, 9, -6, 8, 5, -1, 8, 5, 0, 1 };
        repnum(arr);
        minmax(arr);
        moveneg(arr);
        duparr(arr);
    }
}
