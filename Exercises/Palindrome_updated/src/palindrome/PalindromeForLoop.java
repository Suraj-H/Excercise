package palindrome;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromeForLoop {
    public void forLoopPalindromeString() {
        System.out.print("Enter string: ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            String reverseStr = "";

            char[] strArray = str.toCharArray();

            for (int i = strArray.length - 1; i >= 0; --i) {
                reverseStr += strArray[i];
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