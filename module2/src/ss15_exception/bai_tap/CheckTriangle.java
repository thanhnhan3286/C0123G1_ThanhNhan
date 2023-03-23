package ss15_exception.bai_tap;

import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lần lượt độ dài 3 cạnh a, b, c của tam giác: ");
        int a, b, c;
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());
        try {
            checkTriangleSize(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkTriangleSize(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b) <= c || (a + c) <= b || (b + c) <= a) {
            throw new IllegalTriangleException("3 số đã nhập không phải là cạnh tam giác");
        } else {
            System.out.println("Là 3 cạnh của tam giác");
        }
    }
}
