package ss10_dsa_danh_sach.bai_tap.bai_tap_them.controller;

import ss10_dsa_danh_sach.bai_tap.bai_tap_them.model.Instructor;
import ss10_dsa_danh_sach.bai_tap.bai_tap_them.model.Student;
import ss10_dsa_danh_sach.bai_tap.bai_tap_them.service.InstructorInfo;
import ss10_dsa_danh_sach.bai_tap.bai_tap_them.service.StudentInfo;

import java.util.Scanner;

public class MainMenu {
    public static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag;
        do {
            flag = true;
            System.out.println("1. Học viên" + "\n2. Giảng viên" + "\n3. Exix");
            System.out.println("Nhập '1' nếu là học viên, '2' nếu là giảng viên, '3' để thoát");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    displayMenuStudent();
                    break;
                case 2:
                    displayMenuInstructor();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    flag = true;
            }
        }
        while (flag);
    }

    public static void displayMenuInstructor() {
        InstructorInfo instructor = new InstructorInfo();
        Scanner sc = new Scanner(System.in);
        boolean flag;
        do {
            flag = true;
            System.out.println("1. Thêm mới giảng viên" +
                    "\n2. Xóa giảng viên" +
                    "\n3. Xem danh sách giảng viên" +
                    "\n4. Thoát");
            System.out.println("Chọn cức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    instructor.add();
                    break;
                case 2:
                    instructor.delete();
                    break;
                case 3:
                    instructor.dislay();
                    break;
                case 4:
                    displayMenu();
                    flag = false;
                    break;
                default:
                    flag = true;
            }

        } while (flag);
    }

    public static void displayMenuStudent() {
        StudentInfo student = new StudentInfo();
        Scanner sc = new Scanner(System.in);
        boolean flag;
        do {
            flag = true;
            System.out.println("1. Thêm mới học viên" +
                    "\n2. Xóa học viên" +
                    "\n3. Xem danh sách học viên" +
                    "\n4. Thoát");
            System.out.println("Chọn cức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    student.add();
                    break;
                case 2:
                    student.delete();
                    break;
                case 3:
                    student.dislay();
                    break;
                case 4:
                    displayMenu();
                    flag = false;
                    break;
                default:
                    flag = true;
            }

        } while (flag);
    }
}
