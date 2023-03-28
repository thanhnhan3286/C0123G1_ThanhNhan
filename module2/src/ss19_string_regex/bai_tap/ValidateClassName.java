package ss19_string_regex.bai_tap;

import java.util.Scanner;

public class ValidateClassName {
    public static void main(String[] args) {
        String classsName = "^[CAP]\\d{4}[GHIK]$";
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("Nhập tên lớp cần kiểm tra: ");
            String classsNameCheck = sc.nextLine();
            if(classsNameCheck.matches(classsName)){
                System.out.println("Tên lớp hợp lệ");
                flag = false;
            }
        }while (flag);
    }
}
