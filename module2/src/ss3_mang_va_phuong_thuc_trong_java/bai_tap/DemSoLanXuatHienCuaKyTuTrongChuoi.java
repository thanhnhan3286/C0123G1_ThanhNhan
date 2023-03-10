package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự:");
        String str = sc.nextLine();
        System.out.println(str);
        boolean flag;
        do {
            System.out.println("Nhập ký tự cần tìm:");
            String b = sc.nextLine();
            if (b.length() > 1) {
                System.out.println("Chỉ nhập 1 ký tự");
                flag = true;
            } else {
                System.out.println("So lan xuat hien cua " + b + " là: " + countChar(b, str));
                flag = false;
            }
        } while (flag);
    }

    public static int countChar(String a, String str) {
        int count = 0;
        char b = a.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == b) {
                count++;
            }
        }
        return count;
    }
}