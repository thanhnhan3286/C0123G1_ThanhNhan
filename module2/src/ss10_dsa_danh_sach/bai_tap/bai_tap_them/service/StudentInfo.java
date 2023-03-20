package ss10_dsa_danh_sach.bai_tap.bai_tap_them.service;

import ss10_dsa_danh_sach.bai_tap.bai_tap_them.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfo implements IManagement {
    static ArrayList<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1,"Nhân","2000","Nam","C0123G1",8));
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void add() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<students.size();i++){
            if(id == students.get(i).getId()){
                System.out.println("ID đã tồn tại");
                return;
            }
        }

        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String birthday = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = sc.nextLine();
        System.out.println("Nhâp lớp: ");
        String classes = sc.nextLine();
        System.out.println("Nhập điểm: ");
        int point = Integer.parseInt(sc.nextLine());
        students.add(new Student(id,name,birthday,gender,classes,point));
        System.out.println("Đã thêm thành công");
    }


    @Override
    public void delete() {
        System.out.println("Nhập ID học viên cần xóa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId() == id){
                students.remove(students.get(id));
                System.out.println("Đã xóa thành công");
            }else {
                System.out.println("ID không tồn tại");
            }
        }
    }

    @Override
    public void dislay() {
        System.out.println("Danh sách học viên:" );
        for(Student i : students){
            System.out.println(i);
        }
    }
}
