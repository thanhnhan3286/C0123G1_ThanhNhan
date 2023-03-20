package ss10_dsa_danh_sach.bai_tap.bai_tap_them.model;

import java.util.Scanner;

public class Instructor extends PeopleInCodeGym {
    String specialize;

    public Instructor() {
    }

    public Instructor(int id, String name, String birthday, String gender, String specialize) {
        super(id, name, birthday, gender);
        this.specialize = specialize;
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
        System.out.println("Nhập chuyên môn: ");
        specialize = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "specialize='" + specialize + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }
}
