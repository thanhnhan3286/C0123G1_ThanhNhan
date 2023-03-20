package ss10_dsa_danh_sach.bai_tap.bai_tap_them.service;

import ss10_dsa_danh_sach.bai_tap.bai_tap_them.model.Instructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InstructorInfo implements IManagement{
    static ArrayList<Instructor> instructors = new ArrayList<>();
    static {
        instructors.add(new Instructor(1,"Trung","1998","Nam","Tutor"));
    }
Scanner sc = new Scanner(System.in);
    @Override
    public void add() {
        System.out.println("Nhập id:");
        int id;
        boolean flag = true;
        do {
            int count = 0;
            id = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < instructors.size(); i++) {
                if (id == instructors.get(i).getId()) {
                    count ++;
                }
            }
            if(count == 0) {
                flag = false;
            }else {
                System.out.println("ID đã tồn tại, hãy nhập lại");
            }
        }while (flag);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String birthday = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = sc.nextLine();
        System.out.println("Nhập chuyên môn: ");
        String specialize = sc.nextLine();
        instructors.add(new Instructor(id,name,birthday,gender,specialize));
        System.out.println("Đã thêm thành công");
    }


    @Override
    public void delete() {
        System.out.println("Nhập ID giảng viên cần xóa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < instructors.size(); i++) {
            if(instructors.get(i).getId() == id){
                instructors.remove(instructors.get(id));
                System.out.println("Đã xóa thành công");
            }else {
                System.out.println("ID không tồn tại");
            }
        }
    }

    @Override
    public void dislay() {
        System.out.println("Danh sách giáo viên:" );
        for(Instructor i : instructors){
            System.out.println(i);
        }
    }
}
