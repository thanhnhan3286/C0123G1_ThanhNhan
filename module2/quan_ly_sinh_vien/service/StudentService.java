package src.demo.mvc_demo.quan_ly_sinh_vien.service;

import src.demo.mvc_demo.quan_ly_sinh_vien.model.Student;
import src.demo.mvc_demo.quan_ly_sinh_vien.repository.IStudentRepository;
import src.demo.mvc_demo.quan_ly_sinh_vien.repository.StudentRepositoryImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    static Scanner scanner = new Scanner(System.in);

    private IStudentRepository studentRepository = new StudentRepositoryImpl();

    @Override
    public void addNewStudent() {
        System.out.println("----Thêm mới sinh viên------");
        System.out.print("Nhập mã sinh viên: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        boolean gender = true;
        do {
            System.out.print("Chọn giới tính: \n" + "1. Nam \n" + "2. Nữ \n" + "---> ");
            String chooseGender = scanner.nextLine();
            if (chooseGender.equals("2")) {
                gender = false;
                break;
            } else if (chooseGender.equals("1")) {
                break;
            } else {
                System.out.print("Chọn ngu, chọn lại.");
            }
        } while (true);

        System.out.print("Nhập tên lớp sinh viên: ");
        String classes = scanner.nextLine();
        System.out.print("Nhập tên điểm sinh viên: ");
        double grade = Double.parseDouble(scanner.nextLine());
        Student newStudent = new Student(id, name, gender, classes, grade);
        studentRepository.addNewStudent(newStudent);
        System.out.println("Thêm thành công sinh viên " + name);
    }

    @Override
    public void deleteStudent() {
        this.displayStudentList();
        System.out.print("Nhập id sinh viên bạn muốn xoá: ");
        int idStudentDelete = Integer.parseInt(scanner.nextLine());
       boolean isDeleted =  studentRepository.deleteStudent(idStudentDelete);
       if(isDeleted) {
           System.out.println("Xoa thanh cong!");
       } else {
           System.out.println("Khong tim thay sinh vien.");
       }
    }

    @Override
    public void displayStudentList() {
        List<Student> studentList = studentRepository.getStudentList();
        System.out.println("--------Danh sách sinh viên--------");
        String leftAlignFormat = "| %-2d | %-15s | %-8s | %-5s |%n";
        System.out.format("+----+-----------------+----------+-------+%n");
        System.out.format("| ID |      Tên        | Giới tính| Lớp   |%n");
        System.out.format("+----+-----------------+----------+-------+%n");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.format(leftAlignFormat, studentList.get(i).getId(), studentList.get(i).getName(), studentList.get(i).isGender() ? "  Nam" : "   Nữ", studentList.get(i).getClasses());
        }
        System.out.format("+----+-----------------+----------+-------+%n");
    }
}
