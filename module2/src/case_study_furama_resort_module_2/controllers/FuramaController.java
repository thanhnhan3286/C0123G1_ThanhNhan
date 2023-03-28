package case_study_furama_resort_module_2.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("MENU:" +
                    "\n1. Employee Management" +
                    "\n2. Customer Management" +
                    "\n3. Facility Management" +
                    "\n4. Booking Management" +
                    "\n5. Promotion Management" +
                    "\n6. Exit" +
                    "\nChọn chức năng bằng cách nhấn nhấn số từ 1->6 rồi nhấn Enter");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    boolean flag1= true;
                    do{
                    System.out.println("1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tEdit employee`\n" +
                            "4\tReturn main menu");
                    int choose1 = Integer.parseInt(sc.nextLine());
                    switch (choose1){
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:
                            flag1 = false;
                            break;
                        default:
                            System.out.println("Chọn lại");
                    }}while (flag1);
                    break;
                case 2:
                    boolean flag2 = true;
                    do{
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    int choose2 = Integer.parseInt(sc.nextLine());
                    switch (choose2){
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:
                            flag2 = false;
                            break;
                        default:
                            System.out.println("Chọn lại");
                    }}while (flag2);
                    break;
                case 3:
                    boolean flag3 = true;
                    do{
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    int choose3 = Integer.parseInt(sc.nextLine());
                    switch (choose3){
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:
                            flag3 = false;
                            break;
                        default:
                            System.out.println("Chọn lại");
                    }}while (flag3);
                    break;
                case 4:
                    boolean flag4 = true;
                    do{
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new contract\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    int choose4 = Integer.parseInt(sc.nextLine());
                    switch (choose4){
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        case 5:

                            break;
                        case 6:
                            flag4 = false;
                            break;
                        default:
                            System.out.println("Chọn lại");
                    }}while (flag4);
                    break;
                case 5:
                    boolean flag5=true;
                    do{
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    int choose5 = Integer.parseInt(sc.nextLine());
                    switch (choose5){
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            flag5 = false;
                            break;
                        default:
                            System.out.println("Chọn lại");
                    }}while (flag5);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Mời nhập lại!!!");
            }
        }while (flag);
    }
}
