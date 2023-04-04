package src.demo.mvc_demo.quan_ly_sinh_vien.repository;

import src.demo.mvc_demo.quan_ly_sinh_vien.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getStudentList();

    void addNewStudent(Student newStudent);

    boolean deleteStudent(Integer studentId);
}
