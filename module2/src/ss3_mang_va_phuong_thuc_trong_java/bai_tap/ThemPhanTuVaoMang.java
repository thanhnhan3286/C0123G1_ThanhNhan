package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 7, 5, 9, 4, 3, 1, 5};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can them: ");
        int numb = sc.nextInt();
        System.out.print("Nhap vi tri muon them: ");
        int index = sc.nextInt();
        if (index < -1 || index > arr.length - 1) {
            System.out.print("Khong chen duoc phan tu vao mang");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (index == i) {
                    for (int j = arr.length - 1; j > i; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[index] = numb;
                    i++;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
