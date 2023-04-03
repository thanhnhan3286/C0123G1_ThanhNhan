package case_study_furama_resort_module_2.util.regex;

import java.util.Scanner;

public class Validate {
    static Scanner sc = new Scanner(System.in);
    static boolean flag;
    public static String checkServiceIdVilla(){
        String id = "";
        do{
            id = sc.nextLine();
            if(RegEx.checkServiceIdVilla(id)){
                flag = false;
            }else {
                flag = true;
                System.out.println("Not in accordance with the rules, please enter here again (Ex: SVVL-YYYY");
            }
        }while (flag);
        return id;
    }
    public static String checkServiceIdHouse(){
        String id = "";
        do{
            id = sc.nextLine();
            if(RegEx.checkServiceIdHouse(id)){
                flag = false;
            }else {
                flag = true;
                System.out.println("Not in accordance with the rules, please enter here again (Ex: SVHO-YYYY");
            }
        }while (flag);
        return id;
    }
    public static String checkServiceIdRoom(){
        String id = "";
        do{
            id = sc.nextLine();
            if(RegEx.checkServiceIdRoom(id)){
                flag = false;
            }else {
                flag = true;
                System.out.println("Not in accordance with the rules, please enter here again (Ex: SVRO-YYYY");
            }
        }while (flag);
        return id;
    }
    public static String checkServiceNameVilla(){
        String name = "";
        do{
            name = sc.nextLine();
            if(RegEx.checkServiceNameVilla(name)){
                flag = false;
            }else {
                flag = true;
                System.out.println("Not in accordance with the rules, please enter here again (Ex: Villa)");
            }
        }while (flag);
        return name;
    }
    public static String checkServiceNameHouse(){
        String name = "";
        do{
            name = sc.nextLine();
            if(RegEx.checkServiceNameHouse(name)){
                flag = false;
            }else {
                flag = true;
                System.out.println("Not in accordance with the rules, please enter here again (Ex: House)");
            }
        }while (flag);
        return name;
    }
    public static String checkServiceNameRoom(){
        String name = "";
        do{
            name = sc.nextLine();
            if(RegEx.checkServiceNameRoom(name)){
                flag = false;
            }else {
                flag = true;
                System.out.println("Not in accordance with the rules, please enter here again (Ex: Room)");
            }
        }while (flag);
        return name;
    }
    public static String checkUseArea(){
        String useArea = "";
        do{
            useArea = sc.nextLine();
            if(RegEx.checkUseArea(useArea)){
                flag = false;
            }else {
                flag = true;
                System.out.println("Not in accordance with the rules, please enter here again (> 30 m2)");
            }
        }while (flag);
        return useArea;
    }
    public static String checkPositiveInteger(){
        String numb = "";
        do{
            numb = sc.nextLine();
            if(RegEx.checkPositiveInteger(numb)){
                flag = false;
            }else {
                flag = true;
                System.out.println("Not in accordance with the rules, please enter here again (>0)");
            }
        }while (flag);
        return numb;
    }
    public static String checkMaxPeople(){
        String numb = "";
        do{
            numb = sc.nextLine();
            if(RegEx.checkMaxPeople(numb)){
                flag = false;
            }else {
                flag = true;
                System.out.println("Not in accordance with the rules, please enter here again (>0 & <20)");
            }
        }while (flag);
        return numb;
    }
    public static String checkIdPerson(){
        String id = "";
        do{
            id = sc.nextLine();
            if(RegEx.checkIdPerson(id)){
                flag = false;
            }else {
                flag = true;
                System.out.println("Not in accordance with the rules, please enter here again (Ex: 1234)");
            }
        }while (flag);
        return id;
    }
    public static String checkIdCard(){
        String id = "";
        do{
            id = sc.nextLine();
            if(RegEx.checkIdCard(id)){
                flag = false;
            }else {
                flag = true;
                System.out.println("Not in accordance with the rules, please enter here again (Ex: 123456)");
            }
        }while (flag);
        return id;
    }
    public static String checkPhoneNumber(){
        String numb = "";
        do{
            numb = sc.nextLine();
            if(RegEx.checkPhoneNumber(numb)){
                flag = false;
            }else {
                flag = true;
                System.out.println("Not in accordance with the rules, please enter here again (Ex: 0123456789)");
            }
        }while (flag);
        return numb;
    }
    public static String checkBirthday(){
        String birthday = "";
        do{
            birthday = sc.nextLine();
            if(RegEx.checkBirthday(birthday)){
                flag = false;
            }else {
                flag = true;
                System.out.println("Not in accordance with the rules, please enter here again (dd/mm/YYYY ---- >18 & <100)");
            }
        }while (flag);
        return birthday;
    }
    public static String checkNamePerson(){
        String name = "";
        do{
            name = sc.nextLine();
            if(RegEx.checkNamePerson(name)){
                flag = false;
            }else {
                System.out.println("Not in accordance with the rules, please enter here again (Ex: Do Thanh Nhan)");
                flag = true;
            }
        }while (flag);
        return name;
    }
}
