import java.util.*;

public class Balance {

    public static void isBalanced(String s) {
        Stack<Character> myst = new Stack();
        boolean answer = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                myst.push(ch);
                continue;
            }
            if (myst.empty()) {
                answer = false;
            }
            if (ch == ')') {
                if (myst.peek() == '(') {
                    myst.pop();
                } else {
                    answer = false;
                }
            }
            if (ch == ']') {
                if (myst.peek() == '[') {
                    myst.pop();
                } else {
                    answer = false;

                }
            }
            if (ch == '}') {
                if (myst.peek() == '{') {
                    myst.pop();
                } else {
                    answer = false;

                }
            }
        }
        if (!myst.isEmpty()) {
            answer = false;
        }
        if (answer) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

    public static void main(String[] args) {
        String s = "[()]{}{[()()]()}";
        // String s = "[(])";
        isBalanced(s);
    }

}
