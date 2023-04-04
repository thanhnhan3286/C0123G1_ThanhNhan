package src.demo.mvc_demo.quan_ly_sinh_vien.utils;


import src.demo.mvc_demo.quan_ly_sinh_vien.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteStudent {
    static Scanner scanner = new Scanner(System.in);
    private static final String STUDENT_LIST_PATH = "src/demo/mvc_demo/quan_ly_sinh_vien/data/students.csv";

    public static void writeStudentToFile(Student student) {
        File file = new File(STUDENT_LIST_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(student.getInfoToCsv());
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Student> readStudentFromFile() {
        ArrayList<Student> studentList = new ArrayList();
        File file = new File(STUDENT_LIST_PATH);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null && !(str).equals("")) {
                String[] strings = str.split(",");
                Student student = new Student(Integer.parseInt(strings[0]), strings[1], Boolean.parseBoolean(strings[2]),
                        strings[3], Double.parseDouble(strings[4]));
                studentList.add(student);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return studentList;
    }

    public static void saveListToFile(List<Student> studentList) {
        File file = new File(STUDENT_LIST_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            for (int i = 0; i < studentList.size(); i++) {
                fileWriter.write(studentList.get(i).getInfoToCsv());
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
