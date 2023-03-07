package ss3_Mang_va_phuong_thuc_trong_JAVA.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {8, 5, 6, 7, 5, 9, 4, 3, 1, 5};
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {4, 5, 8, 7, 99, 66, 55, 44, 22};
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int a = arr1.length;
        int b = arr2.length;
        for (int i = a; i < (a + b); i++) {
            arr3[i] = arr2[i-a];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
