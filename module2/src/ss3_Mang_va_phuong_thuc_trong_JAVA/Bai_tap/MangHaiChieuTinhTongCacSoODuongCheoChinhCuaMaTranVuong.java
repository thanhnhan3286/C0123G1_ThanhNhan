package ss3_Mang_va_phuong_thuc_trong_JAVA.Bai_tap;

import java.util.Scanner;

public class MangHaiChieuTinhTongCacSoODuongCheoChinhCuaMaTranVuong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai canh cua ma tran vuong");
        int n = sc.nextInt();
        int[][] arr = importArray(n);
        System.out.println("Tong duong cheo la: "+sumMainDiagonal(arr));
    }
    public static int[][] importArray(int n){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Phan tu thu: " + i + "-" + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        return arr;
    }
    public static int sumMainDiagonal(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j<arr[i].length;j++){
                if(j==i){
                    sum = sum + arr[i][j];
                }
            }
        }
        return sum;
    }
}
