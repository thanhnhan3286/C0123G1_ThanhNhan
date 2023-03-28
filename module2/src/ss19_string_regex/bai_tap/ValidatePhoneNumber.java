package ss19_string_regex.bai_tap;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String phoneNumber = "^\\(84\\)\\-\\(0\\d{9}\\)$";
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("Nhập số điện thoại cần kiểm tra: ");
            String phoneNumberCheck = sc.nextLine();
            if(phoneNumberCheck.matches(phoneNumber)){
                System.out.println("Số điện thoại hợp lệ");
                flag = false;
            }
        }while (flag);
    }
}
