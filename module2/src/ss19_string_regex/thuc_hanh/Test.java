package ss19_string_regex.thuc_hanh;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test tên học sinh");
        String s1 = "^([A-Z][a-z]{1,}(\\s))([A-Z][a-z]{1,}(\\s))*([A-Z][a-z]{1,})$";
        String s2 = "Do Nhan Thanh";
        System.out.println(s2.matches(s1));
    }
}
