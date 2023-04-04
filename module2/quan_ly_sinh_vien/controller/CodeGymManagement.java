package src.demo.mvc_demo.quan_ly_sinh_vien.controller;

import src.demo.mvc_demo.quan_ly_sinh_vien.service.StudentService;

import java.util.Scanner;

public class CodeGymManagement {
    static Scanner scanner = new Scanner(System.in);
    private StudentService studentService = new StudentService();

    public void showMenu() {
        boolean flag = true;
        do {
            System.out.println("-------- Hệ thống quản lý CodeGym --------");
            System.out.print(
                    "1. Quản lý sinh viên \n" +
                            "2. Quản lý giảng viên \n" +
                            "0. Thoát \n" +
                            "Mời chọn chức năng: ");
            String choose = scanner.nextLine();
            if (choose.equals("1")) {
                showStudentMenu();
            } else if (choose.equals("2")) {

            }
        } while (flag);
    }

    public void showStudentMenu() {
        boolean flag = true;
        do {
            System.out.println("------- Quản lý sinh viên -------");
            System.out.print(
                    "1. Thêm mới sinh viên \n" +
                            "2. Xoá sinh viên \n" +
                            "3. Xem danh sách sinh viên \n" +
                            "0. Thoát \n" +
                            "Mời chọn chức năng: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentService.addNewStudent();
                    break;
                case "2":
                    studentService.deleteStudent();
                    break;
                case "3":
                    studentService.displayStudentList();
                    break;
                case "0":
                    flag = false;
                    System.out.println("Thoát quản lý sinh viên.");
                    break;
                default:
                    System.out.println("Chọn sai chức năng, vui lòng nhập lại!");
                    break;
            }
        } while (flag);
    }


}
