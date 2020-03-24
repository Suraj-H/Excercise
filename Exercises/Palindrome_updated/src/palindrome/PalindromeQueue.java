package palindrome;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeQueue {
    public void queuePalindromeString() {
        System.out.print("Enter any string : ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();

            Queue<Character> queue = new LinkedList<>();

            for (int i = str.length() - 1; i >= 0; --i) {
                queue.add(str.charAt(i));
            }

            String reverseStr = "";

            while (!queue.isEmpty()) {
                reverseStr += queue.remove();
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