package case_study_furama_resort_module_2.services;

import case_study_furama_resort_module_2.model.person.Employee;
import case_study_furama_resort_module_2.repository.EmployeeRepoImpl;
import case_study_furama_resort_module_2.util.regex.Validate;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static Scanner sc = new Scanner(System.in);
    static EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();
    static Employee employee = new Employee();
    static List<Employee> employeeList = employeeRepo.display();

    public static String getGender() {
        String gender = "";
        boolean flag;
        do {
            flag = false;
            System.out.print("Choose the gender: " +
                    "\n1. Male" +
                    "\n2. Female" +
                    "\n3. Other" +
                    "\nEnter selection: ");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    gender = "Male";
                    break;
                case "2":
                    gender = "Female";
                    break;
                case "3":
                    System.out.print("Enter gender: ");
                    gender = sc.nextLine();
                    break;
                default:
                    System.out.print("Please enter selection 1->3 here again: ");
                    flag = true;
            }
        } while (flag);
        return gender;
    }

    public static String getLevel() {
        String level = "";
        boolean flag;
        do {
            flag = false;
            System.out.println("Choose employ lever: " +
                    "\n1. Intermediate" +
                    "\n2. College" +
                    "\n3. University" +
                    "\n4. After University");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    level = "Intermediate";
                    break;
                case "2":
                    level = "College";
                    break;
                case "3":
                    level = "University";
                    break;
                case "4":
                    level = "After University";
                    break;
                default:
                    System.out.print("Please enter selection 1->4 here again: ");
                    flag = true;
            }
        } while (flag);
        return level;
    }

    public static String getPosition() {
        String position = "";
        boolean flag;
        do {
            flag = false;
            System.out.println("Choose the job position: " +
                    "\n1. Receptionist" +
                    "\n2. Serve" +
                    "\n3. Counselor" +
                    "\n4. Monitor" +
                    "\n5. Manager" +
                    "\n6. Director");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    position = "Receptionist";
                    break;
                case "2":
                    position = "Serve";
                    break;
                case "3":
                    position = "Counselor";
                    break;
                case "4":
                    position = "Monitor";
                    break;
                case "5":
                    position = "Manager";
                    break;
                case "6":
                    position = "Director";
                    break;
                default:
                    System.out.println("Please enter selection 1->6 here again!!!");
                    flag = true;
            }
        } while (flag);
        return position;
    }

    public static boolean checkId(String id) {
        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(employeeList.get(i).getId(), id)) {
                count++;
            }
        }
        if (count != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkIdEdit(String id) {
        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(employeeList.get(i).getId(), id)) {
                count++;
            }
        }
        if (count >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkNumberOfIdCard(String id) {
        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(employeeList.get(i).getNumberOfIdCard(), id)) {
                count++;
            }
        }
        if (count != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkNumberOfIdCardEdit(String id) {
        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(employeeList.get(i).getNumberOfIdCard(), id)) {
                count++;
            }
        }
        if (count >= 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void add() {
        System.out.println("ADD NEW EMPLOYEE: ");
        boolean flag;
        String employeeId;
        System.out.print("Enter employee ID: ");
        do {
            flag = false;
            employeeId = Validate.checkIdPerson();
            if (checkId(employeeId)) {
                flag = true;
                System.out.println("Employee ID is already in the system, please enter again here: ");
            }
        } while (flag);
        System.out.print("Enter the employee name: ");
        String fullName = Validate.checkNamePerson();
        System.out.print("Enter the birthday: ");
        String birirthday = Validate.checkBirthday();
        String gender = getGender();
        System.out.print("Enter identity card number: ");
        String numberOfIdCard;
        do {
            flag = false;
            numberOfIdCard = Validate.checkIdCard();
            if (checkNumberOfIdCard(numberOfIdCard)) {
                flag = true;
                System.out.println("The identity card number is already in the system, please enter here again");
            }
        } while (flag);
        System.out.print("Enter phone number: ");
        String numberPhone = Validate.checkPhoneNumber();
        System.out.print("Enter Email: ");
        String email = Validate.checkEmail();
        String level = getLevel();
        String position = getPosition();
        System.out.print("Enter the salary: ");
        String wage = Validate.checkPositiveInteger();
        employee = new Employee(employeeId, fullName, birirthday, gender, numberOfIdCard, numberPhone,
                email, level, position, wage);
        employeeList.add(employee);
        save();
        System.out.println("Added");
    }


    @Override
    public void display() {
        if (employeeList.size() == 0) {
            System.out.println("Empty list!!!");
        } else {
            for (Employee e : employeeList) {
                System.out.println(e);
            }
        }
    }

    @Override
    public void edit() {
        System.out.println("EDIT EMPLOYEE: ");
        boolean flag;
        String employeeId;
        System.out.print("Enter the employee ID need edit: ");
        do {
            flag = false;
            employeeId = sc.nextLine();
            if (checkId(employeeId)) {
                flag = true;
                System.out.println("Employee ID is already in the system, edit here: ");
            } else {
                System.out.println("Employee ID is not already in the system, please enter here again: ");
            }
        } while (!flag);
        System.out.print("Enter the employee name: ");
        String fullName = sc.nextLine();
        System.out.print("Enter the birthday: ");
        String birirthday = sc.nextLine();
        String gender = getGender();
        System.out.print("Enter identity card number: ");
        String numberOfIdCard;
        do {
            flag = false;
            numberOfIdCard = sc.nextLine();
            if (checkNumberOfIdCardEdit(numberOfIdCard)) {
                flag = true;
                System.out.println("The identity card number is already in the system, please enter here again");
            }
        } while (flag);
        System.out.print("Enter phone number: ");
        String numberPhone = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = Validate.checkEmail();
        String level = getLevel();
        String position = getPosition();
        System.out.print("Enter the salary: ");
        String wage = sc.nextLine();
        employee = new Employee(employeeId, fullName, birirthday, gender, numberOfIdCard, numberPhone,
                email, level, position, wage);
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(employeeList.get(i).getId(), employeeId)) {
                employeeList.set(i, employee);
            }
        }
        save();
        System.out.println("Edited!!!");
    }

    @Override
    public void save() {
        employeeRepo.save(employeeList);
    }
}
