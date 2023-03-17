package ss11_stack_queue.bai_tap.kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_stack;

import java.util.Stack;

public class BracketCheck {
    public static boolean bracketCheck(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char charac = str.charAt(i);
            if (charac == '(') {
                stack.push(charac);
            } else if (charac == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((charac == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String string1 = "s * (s – a) * (s – b) * (s – c) ";
        String string2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String string3 = "s * (s – a) * (s – b * (s – c)";
        String string4 = "s * (s – a) * s – b) * (s – c)";
        String string5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a)) ";
        System.out.println(string1 + " -> " + bracketCheck(string1));
        System.out.println(string2 + " -> " + bracketCheck(string2));
        System.out.println(string3 + " -> " + bracketCheck(string3));
        System.out.println(string4 + " -> " + bracketCheck(string4));
        System.out.println(string5 + " -> " + bracketCheck(string5));
    }
}
