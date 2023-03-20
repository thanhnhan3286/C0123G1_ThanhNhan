package ss12_java_colection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.controller;

import ss12_java_colection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.service.ProductManagerment;

import java.util.Scanner;

public class Menu {
    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        ProductManagerment productManager = new ProductManagerment();
        boolean flag = true;
        do {
            System.out.println("Danh sách lựa chọn:\n" +
                    "1. Thêm mới \n" +
                    "2. Xóa \n" +
                    "3. Sửa\n" +
                    "4. Hiển thị\n" +
                    "5. Tìm kiếm\n" +
                    "6. Sắp xếp\n" +
                    "7. Thoát\n" +
                    "Nhập chức năng:");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.delete();
                    break;
                case 3:
                    productManager.edit();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    productManager.arrange();
                    break;
                case 7:
                    System.out.println("Bạn đã thoát ");
                    flag = false;
                    break;
                default:
                    System.out.println("Chỉ nhập từ 1 tới 7, xin mời nhập lại");
            }
        } while (flag);
    }
}
