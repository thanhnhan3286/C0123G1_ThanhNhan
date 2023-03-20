package ss12_java_colection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.service;

import ss12_java_colection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.Product;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagerment implements IProductMagerment {
    Scanner sc = new Scanner(System.in);
    static LinkedList<Product> productsList = new LinkedList<>();

    static {
        productsList.add(new Product(1, "Bút bi xanh", 4000));
        productsList.add(new Product(2, "Bút bi đỏ", 4000));
        productsList.add(new Product(3, "Bút bi đen", 4000));
    }

    @Override
    public void add() {
        System.out.println("Nhập id sản phẩm:");
        int id;
        boolean flag = true;
        do {
            int count = 0;
            id = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < productsList.size(); i++) {
                if (id == productsList.get(i).getId()) {
                    count++;
                }
            }
            if (count == 0) {
                flag = false;
            } else {
                System.out.println("ID đã tồn tại, hãy nhập lại");
            }
        } while (flag);
        System.out.println("Nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("Nhập giá sảm phẩm");
        int price = Integer.parseInt(sc.nextLine());
        productsList.add(new Product(id, name, price));
        System.out.println("Đã thêm thành công sản phẩm");
    }

    @Override
    public void edit() {
        System.out.println("Nhập ID sản phẩm cần sửa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < productsList.size(); i++) {
            if (id == productsList.get(i).getId()) {
                System.out.println("Nhập tên sản phẩm");
                String name = sc.nextLine();
                System.out.println("Nhập giá sảm phẩm");
                int price = Integer.parseInt(sc.nextLine());
                productsList.set(id, new Product(id, name, price));
                System.out.println("Đã sửa thành công sản phẩm");
            } else {
                System.out.println("ID không tồn tại, mời bạn nhập lại");
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập ID sản phẩm muốn xóa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < productsList.size(); i++) {
            if (id == productsList.get(i).getId()) {
                productsList.remove(id);
                System.out.println("Đã xóa sản phẩm");
            } else {
                System.out.println("ID không tồn tại, mời bạn nhập lại");
            }
        }
    }

    @Override
    public void display() {
        System.out.println("Danh sách sản phẩm");
        for (Product p : productsList) {
            System.out.println(p);
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập tên sản phẩm muốn tìm");
        String name = sc.nextLine();
        for (int i = 0; i < productsList.size(); i++) {
            if (name.equals(productsList.get(i).getName())) {
                System.out.println(productsList.get(i));
            } else {
                System.out.println("Sản phẩm không tồn tại");
            }
        }
    }

    @Override
    public void arrange() {

    }
}
