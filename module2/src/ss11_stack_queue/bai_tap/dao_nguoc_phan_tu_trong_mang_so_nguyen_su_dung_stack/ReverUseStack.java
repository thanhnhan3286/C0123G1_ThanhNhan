package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class ReverUseStack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Mảng ban đầu: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            stack.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.print("\nMảng sau khi đảo ngược: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        Stack<Character> stack1 = new Stack<>();
        String str = "Hello world!";
        System.out.print("\nChuỗi kí tự ban đầu: "+str);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            stack1.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack1.isEmpty()) {
            reversed.append(stack1.pop());
        }
        System.out.print("\nChuôĩ sau ki đảo ngược: "+reversed);
    }
}
