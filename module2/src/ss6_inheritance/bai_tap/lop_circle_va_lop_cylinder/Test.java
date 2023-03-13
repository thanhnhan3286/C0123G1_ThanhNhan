package ss6_inheritance.bai_tap.lop_circle_va_lop_cylinder;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap radius:");
        double r = Double.parseDouble(sc.nextLine());
        circle.setRadius(r);
        cylinder.setRadius(r);
        System.out.println("Nhap color:");
        String color = sc.nextLine();
        circle.setColor(color);
        cylinder.setColor(color);
        System.out.println(circle);
        System.out.println("Nhap height:");
        double h = Double.parseDouble(sc.nextLine());
        cylinder.setHeight(h);
        System.out.println(cylinder);
    }
}
