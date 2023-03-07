package ss3_Mang_va_phuong_thuc_trong_JAVA.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 7, 5, 5, 5, 9, 4, 5, 3, 1, 5};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can xoa: ");
        int numb = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (numb == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }

        }
        System.out.print(Arrays.toString(arr));
    }
}
