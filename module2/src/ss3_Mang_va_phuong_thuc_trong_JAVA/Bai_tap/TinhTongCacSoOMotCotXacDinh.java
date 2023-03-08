package ss3_Mang_va_phuong_thuc_trong_JAVA.Bai_tap;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu con trong mang");
        int m = sc.nextInt();
        System.out.println("Nhap so phan tu cua mang con");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Phan tu thu: " + i + "-" + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Nhap so cua cot can tinh tong");
        int a = sc.nextInt();
        System.out.println("Tong cua cot " + a + " la: " + sumColumn(a, arr));
    }

    public static int sumColumn(int a, int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == a) {
                    sum = sum + arr[i][a];
                }
            }
        }
        return sum;
    }
}