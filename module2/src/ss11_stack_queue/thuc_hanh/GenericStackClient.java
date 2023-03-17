package ss11_stack_queue.thuc_hanh;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of intergers");
        stackOfInterger();
        System.out.println("\n2.Stack of String");
        stackOfString();
    }

    private static void stackOfString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2 Pop element form stack: ");
//        while (!stack.isEmpty()) {
//            System.out.println(" %", stack.pop());
//        }
//        System.out.println("\n3.3 Size of stack after pop prerations: " + stack.size());
//
    }

    private static void stackOfInterger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2 Pop element form stack: ");
//        while (!stack.isEmpty()) {
//            System.out.println(" %", stack.pop());
//        }
//        System.out.println("\n3.3 Size of stack after pop prerations: " + stack.size());

    }
}
