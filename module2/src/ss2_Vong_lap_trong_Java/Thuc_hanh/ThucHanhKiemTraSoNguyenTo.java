package ss2_Vong_lap_trong_Java.Thuc_hanh;

import java.util.Scanner;

public class ThucHanhKiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nập số cần kiểm tra: ");
        int a = sc.nextInt();
        if (a < 2) {
            System.out.print(a + " không phải là số nguyên tố.");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(a)) {
                if (a % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print(a + " là số nguyên tố");
            }else {
                System.out.print(a + " không phải là số nguyên tố");
            }
        }
    }
}
