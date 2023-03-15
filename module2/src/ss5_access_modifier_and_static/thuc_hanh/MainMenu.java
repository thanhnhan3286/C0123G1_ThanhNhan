package ss5_access_modifier_and_static.thuc_hanh;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        dislayMenu();
    }
    public static void dislayMenu(){
        StudentManager studentManager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("Chọn chức năng "+
                    "\n 1.Display" +
                    "\n 2.Add"+
                    "\n 3.Delete"+
                    "\n 4.Exit");
            System.out.println("Chọn chúc năng");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Chức năng them mới");
                    studentManager.add();
                    break;
                case 2:
                    System.out.println("Chức năng xóa");
                    break;
                default:System.out.println("Thoát");
                flag = false;
            }
        }while (flag);
    }
}
