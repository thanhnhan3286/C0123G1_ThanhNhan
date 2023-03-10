package ss5_access_modifier_and_static.bai_tap.xay_dung_lop_chi_ghi_trong_java;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên học sinh:");
        String name = sc.nextLine();
        Student student = new Student();
        if (name.length() == 0) {
            System.out.println("Nhập lớp:");
            String classe = sc.nextLine();
            if (classe.length() == 0) {
                System.out.println(student.display());
            } else {
                student.setClasse(classe);
                System.out.println(student.display());
            }
        } else {
            System.out.println("Nhập lớp:");
            String classe = sc.nextLine();
            if (classe.length() == 0) {
                student.setName(name);
                System.out.println(student.display());
            } else {
                student.setName(name);
                student.setClasse(classe);
                System.out.println(student.display());
            }
        }
    }
}
