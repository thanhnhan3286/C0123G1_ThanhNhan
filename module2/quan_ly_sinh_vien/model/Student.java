package src.demo.mvc_demo.quan_ly_sinh_vien.model;

public class Student extends Person {
    private String classes;
    private double grade;

    public Student() {
    }

    public Student(String classes) {
        this.classes = classes;
    }

    public Student(int id, String name, boolean gender, String classes, double grade) {
        super(id, name, gender);
        this.classes = classes;
        this.grade = grade;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{ " +
                super.toString() +
                "classes='" + classes + '\'' +
                ", grade=" + grade +
                '}';
    }
//    int id, String name, boolean gender, String classes, doble grade.

    public String getInfoToCsv() {
        return this.getId() + "," + this.getName() + "," + this.isGender() + "," +
                this.getClasses() + "," + this.getGrade();
    }
}
