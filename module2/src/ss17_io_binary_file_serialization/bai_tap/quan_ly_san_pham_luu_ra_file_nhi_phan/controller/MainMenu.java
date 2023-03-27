package ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.controller;

import ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.service.ProductService;

import java.util.Scanner;

public class MainMenu {
    static ProductService productService = new ProductService();

    public static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn 1 trong các chức năng:" +
                    "\n1.Thêm mới sản phẩm" +
                    "\n2.Hiển thị danh sách sản phẩm" +
                    "\n3.Tìm kiếm sản phẩm qua id" +
                    "\n4.Thoát");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    productService.add();
                    break;
                case "2":
                    productService.display();
                    break;
                case "3":
                    productService.search();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Mời chọn lại");
            }
        } while (flag);
    }
}
