package ss5_access_modifier_and_static.bai_tap.access_modifier;

import java.util.Scanner;

public class TestCricle {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn:");
        double r = sc.nextDouble();
        if (r > 0) {
            cricle.setRadius(r);
            System.out.println("Nhập màu bạn muốn: ");
            String color = sc.nextLine();
            cricle.setColor(color);
            System.out.println(cricle.display());
        } else {
            System.out.println(cricle.display());
        }
    }
}
