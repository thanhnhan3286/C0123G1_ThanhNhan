package ss2_Vong_lap_trong_Java.Bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        boolean flag;
        do {
            flag = true;
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    retangle();
                    break;
                case 2:
                    squareTriangle();
                    break;
                case 3:
                    isoscelesTriangle();
                    break;
                default:
                    flag = false;
            }

        } while (flag);
    }

    public static void retangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        int n = sc.nextInt();
        System.out.print("Nhập chiều dài: ");
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == m - 1) {
                    System.out.print("*" + "\n");
                }else {
                    System.out.print("*");
                }
            }
        }
    }

    public static void squareTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ cao: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void isoscelesTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ cao: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int x = n; x > i; x--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}