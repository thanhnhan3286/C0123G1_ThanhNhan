package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang 1 ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Nhap do dai mang 2 ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[n + m];
        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = n; i < (n + m); i++) {
            arr3[i] = arr2[i - n];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
