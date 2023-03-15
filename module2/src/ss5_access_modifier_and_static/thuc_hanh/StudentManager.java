package ss5_access_modifier_and_static.thuc_hanh;

import java.util.Scanner;

public class StudentManager {
    static Student[] students = new Student[10];
    static {
        students[0] = new Student(1,"Nhan1");
        students[1] = new Student(2,"Nhan2");
        students[2] = new Student(3,"Nhan3");
    }
    public void display(){
        for(Student s : students){
            if (s!=null){
                System.out.println(s);
            }else{
                break;
            }
        }
    }
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten");
        String name = sc.nextLine();
        Student student = new Student(id, name);
        for(int i=0; i< students.length; i++){
            if(students[i]==null){
                students[i] = student;
                break;
            }
        }
    }
}
