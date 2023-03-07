package ss1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quyDoi = usd * 23000;
        System.out.print("Giá trị VND: " + quyDoi +"đ");
    }
}
