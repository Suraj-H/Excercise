package palindrome;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PalindromeStack {
    public void stackPalindromeString() {
        System.out.print("Enter string: ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            Stack stack = new Stack();

            for (int i = 0; i < str.length(); ++i) {
                stack.push(str.charAt(i));
            }

            String reverseStr = "";

            while (!stack.isEmpty()) {
                reverseStr += stack.pop();
            }

            if (str.equals(reverseStr))
                System.out.println(str + " is a palindrome string.");
            else
                System.out.println(str + " is not a palindrome string.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}