
//import java.io.CharArrayReader;
import java.util.Arrays;

public class Anagrams {

    public static boolean strtochar(String myStr1, String myStr2) {
        char[] temp1 = myStr1.toCharArray();
        Arrays.sort(temp1);

        char[] temp2 = myStr2.toCharArray();
        Arrays.sort(temp2);
        return Arrays.equals(temp1, temp2);
    }

    public static void anagrams(String[] strAr) {
        int l = strAr.length;

        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                // anayes[k]=strAr[i];
                if (strtochar(strAr[i], strAr[j])) {
                    System.out.println(strAr[i] + " is anagram of " + strAr[j]);

                }
            }

        }
    }

    public static void main(String[] args) {
        String[] strAr = { "act", "god", "cat", "dog", "tac" };
        anagrams(strAr);

    }

}
