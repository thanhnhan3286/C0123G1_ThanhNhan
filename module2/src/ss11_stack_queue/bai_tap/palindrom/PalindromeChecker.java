package ss11_stack_queue.bai_tap.palindrom;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        String string = str.replaceAll(" ", "").toLowerCase();
        Queue<Character> queue = new LinkedList<Character>();
        for (int i = 0; i < string.length(); i++) {
            queue.add(string.charAt(i));
        }
        while (queue.size() > 1) {
            if (queue.poll() != ((LinkedList<Character>) queue).removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "n ha a h n";
        String str2 = "hellEH";

        if (isPalindrome(str1)) {
            System.out.println(str1 + " is a palindrome");
        } else {
            System.out.println(str1 + " is not a palindrome");
        }

        if (isPalindrome(str2)) {
            System.out.println(str2 + " is a palindrome");
        } else {
            System.out.println(str2 + " is not a palindrome");
        }
    }
}
