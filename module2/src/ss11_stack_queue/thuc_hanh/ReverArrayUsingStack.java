package ss11_stack_queue.thuc_hanh;

import java.util.Stack;

public class ReverArrayUsingStack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            stack.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        System.out.print("Mảng sau khi đảo ngược: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
