package ss5_access_modifier_and_static.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name = "John";
    private String classe = "C02";

    public Student() {
    }

    public Student(String name, String classe) {
        this.name = name;
        this.classe = classe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getName() {
        return name;
    }

    public String getClasse() {
        return classe;
    }

    public String display() {
        return "Tên học sinh: " + this.name + "\nLớp: " + this.classe;
    }
}
