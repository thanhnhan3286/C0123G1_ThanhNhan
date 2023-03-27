package ss17_io_binary_file_serialization.thuc_hanh.bai_2_danh_sach_hoc_sinh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<StudentThucHanh> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<StudentThucHanh> readDataFromFile(String path){
        List<StudentThucHanh> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<StudentThucHanh>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }
    public static void main(String[] args) {
        List<StudentThucHanh> students = new ArrayList<>();
        students.add(new StudentThucHanh(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new StudentThucHanh(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new StudentThucHanh(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new StudentThucHanh(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new StudentThucHanh(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeDataToFile("src/ss17_io_binary_file_serialization/thuc_hanh/bai_2_danh_sach_hoc_sinh/student.txt",
                students);
        List<StudentThucHanh> studentDataFromFile = readDataFromFile("src/ss17_io_binary_file_serialization/thuc_hanh/bai_2_danh_sach_hoc_sinh/student.txt");
        for (StudentThucHanh student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
