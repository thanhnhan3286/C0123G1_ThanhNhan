package Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (1 > 0) {
            System.out.print("Nhập số từ 0 -> 999: ");
            int so = Integer.parseInt(sc.nextLine());
            if (so >= 0) {
                if (so <= 13) {
                    switch (so) {
                        case 0:
                            System.out.print("Zero");
                            break;
                        case 1:
                            System.out.print("One");
                            break;
                        case 2:
                            System.out.print("Two");
                            break;
                        case 3:
                            System.out.print("Three");
                            break;
                        case 4:
                            System.out.print("Four");
                            break;
                        case 5:
                            System.out.print("Five");
                            break;
                        case 6:
                            System.out.print("Six");
                            break;
                        case 7:
                            System.out.print("Seven");
                            break;
                        case 8:
                            System.out.print("Eight");
                            break;
                        case 9:
                            System.out.print("Nine");
                            break;
                        case 10:
                            System.out.print("Ten");
                            break;
                        case 11:
                            System.out.print("Eleven");
                            break;
                        case 12:
                            System.out.print("Twelve");
                            break;
                        case 13:
                            System.out.print("Thirteen");
                            break;
                    }
                } else if (so <= 19) {

                }
            } else {
                System.out.print("Số không hợp lệ");
            }
        }
    }
}
