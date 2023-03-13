package ss6_inheritance.bai_tap.lop_point_2d_va_lop_point_3d;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x, y, z lan luot:");
        float x = Float.parseFloat(sc.nextLine());
        float y = Float.parseFloat(sc.nextLine());
        float z = Float.parseFloat(sc.nextLine());
        point2D.setX(x);
        point3D.setX(x);
        point2D.setY(y);
        point3D.setY(y);
        point3D.setZ(z);
        System.out.println(point2D);
        System.out.println(point3D);
    }
}
