package ss7_abstract_inface;

public class Instructor extends Employee implements IAttendance{

    public void teach(){
        System.out.println("Giảng viên đang dạy");
    }

    @Override
    public void doTask() {
        System.out.println("dạy học và nhận lương");
    }

    @Override
    public void attendance() {
        System.out.println("Giảng viên có thể điểm danh");
    }
}
