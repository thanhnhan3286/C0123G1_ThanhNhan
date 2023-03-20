package ss10_dsa_danh_sach.bai_tap.bai_tap_them.model;

import java.util.Scanner;

public class Student extends PeopleInCodeGym {
    String classes;
    float point;

    public Student() {
    }

    public Student(int id, String name, String birthday, String gender, String classes, float point) {
        super(id, name, birthday, gender);
        this.classes = classes;
        this.point = point;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        birthday = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        gender = sc.nextLine();
        System.out.println("Nhâp lớp: ");
        classes = sc.nextLine();
        System.out.println("Nhập điểm: ");
        while (true) {
            float pointInput = Float.parseFloat(sc.nextLine());
            boolean check = setPoint(pointInput);
            if (check) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "classes='" + classes + '\'' +
                ", point=" + point +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public float getPoint() {
        return point;
    }

    public boolean setPoint(float point) {
        if (point >= 0 || point <= 10) {
            this.point = point;
            return true;
        } else {
            System.err.println("Nhập lại điểm");
            return false;
        }
    }
}
