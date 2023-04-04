package src.demo.mvc_demo.quan_ly_sinh_vien.repository;

import src.demo.mvc_demo.quan_ly_sinh_vien.model.Student;
import src.demo.mvc_demo.quan_ly_sinh_vien.utils.ReadAndWriteStudent;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements IStudentRepository{

    static List<Student> studentList = new ArrayList<>();
    @Override
    public List<Student> getStudentList() {
        return studentList = ReadAndWriteStudent.readStudentFromFile();
    }

    @Override
    public void addNewStudent(Student newStudent) {
        ReadAndWriteStudent.writeStudentToFile(newStudent);
        studentList.add(newStudent);
    }

    @Override
    public boolean deleteStudent(Integer studentId) {
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId() == studentId) {
                studentList.remove(i);
                ReadAndWriteStudent.saveListToFile(studentList);
                return true;
            }
        }
        return false;
    }
}
