package ss3_Mang_va_phuong_thuc_trong_JAVA.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang ");
        int n = sc.nextInt();
        System.out.println("Nhap do dai mang con");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhap phan tu thu " + i + "-" + j);
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    index1 = i;
                    index2 = j;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("So lon nhat trong mang la " + max);
        System.out.println("Vi tri la " + index1 + "-" + index2);
    }
}
