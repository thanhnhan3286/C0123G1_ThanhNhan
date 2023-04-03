package case_study_furama_resort_module_2.services;

import case_study_furama_resort_module_2.model.person.Employee;
import case_study_furama_resort_module_2.repository.EmployeeRepo;
import case_study_furama_resort_module_2.util.regex.Validate;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static Scanner sc = new Scanner(System.in);
    static EmployeeRepo employeeRepo = new EmployeeRepo();
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
                    "\nEnter choose: ");
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
            System.out.println("Choose customer lever: " +
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
                    System.out.print("Please enter choose here again: ");
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
            System.out.println("Chọn chức vụ: " +
                    "\n1. Lễ tân" +
                    "\n2. Phục vụ" +
                    "\n3. Chuyên viên" +
                    "\n4. Giám sát" +
                    "\n5. Quản lý" +
                    "\n6. Giám đốc");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    position = "Lễ tân";
                    break;
                case "2":
                    position = "Phục vụ";
                    break;
                case "3":
                    position = "Chuyên viên";
                    break;
                case "4":
                    position = "Giám sát";
                    break;
                case "5":
                    position = "Quản lý";
                    break;
                case "6":
                    position = "Giám đốc";
                    break;
                default:
                    System.out.println("Mời chọn lại");
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
        System.out.println("Thêm mới nhân viên: ");
        boolean flag;
        String employeeId;
        System.out.print("Nhập mã nhân viên: ");
        do {
            flag = false;
            employeeId = Validate.checkIdPerson();
            if (checkId(employeeId)) {
                flag = true;
                System.out.println("ID đã tồn tại, mời nhập lại");
            }
        } while (flag);
        System.out.print("Nhập tên: ");
        String fullName = Validate.checkNamePerson();
        System.out.print("Nhập ngày sinh: ");
        String birirthday = Validate.checkBirthday();
        String gender = getGender();
        System.out.print("Nhập số CMND: ");
        String numberOfIdCard;
        do {
            flag = false;
            numberOfIdCard = Validate.checkIdPerson();
            if (checkNumberOfIdCard(numberOfIdCard)) {
                flag = true;
                System.out.println("Số CMND đã tồn tại, mời nhập lại");
            }
        } while (flag);
        System.out.print("Nhập số điện thoại: ");
        String numberPhone = Validate.checkPhoneNumber();
        System.out.print("Nhập Email: ");
        String email = sc.nextLine();
        String level = getLevel();
        String position = getPosition();
        System.out.print("Nhập lương: ");
        String wage = Validate.checkPositiveInteger();
        employee = new Employee(employeeId, fullName, birirthday, gender, numberOfIdCard, numberPhone,
                email, level, position, wage);
        employeeList.add(employee);
        save();
        System.out.println("Đã thêm thành công");
    }


    @Override
    public void display() {
        if (employeeList.size() == 0) {
            System.out.println("Danh sách rỗng");
        } else {
            for (Employee e : employeeList) {
                System.out.println(e);
            }
        }
    }

    @Override
    public void edit() {
        boolean flag;
        String employeeId;
        System.out.print("Nhập mã nhân viên ần sửa đổi: ");
        do {
            flag = false;
            employeeId = sc.nextLine();
            if (checkId(employeeId)) {
                flag = true;
                System.out.println("ID có trong danh sách, bắt đầu sửa đổi: ");
            } else {
                System.out.println("ID không tồn tại, mời nhập lại:");
            }
        } while (!flag);
        System.out.print("Nhập tên: ");
        String fullName = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String birirthday = sc.nextLine();
        String gender = getGender();
        System.out.print("Nhập số CMND: ");
        String numberOfIdCard;
        do {
            flag = false;
            numberOfIdCard = sc.nextLine();
            if (checkNumberOfIdCardEdit(numberOfIdCard)) {
                flag = true;
                System.out.println("Số CMND đã tồn tại, mời nhập lại");
            }
        } while (flag);
        System.out.print("Nhập số điện thoại: ");
        String numberPhone = sc.nextLine();
        System.out.print("Nhập Email: ");
        String email = sc.nextLine();
        String level = getLevel();
        String position = getPosition();
        System.out.print("Nhập lương: ");
        String wage = sc.nextLine();
        employee = new Employee(employeeId, fullName, birirthday, gender, numberOfIdCard, numberPhone,
                email, level, position, wage);
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(employeeList.get(i).getId(), employeeId)) {
                employeeList.set(i, employee);
            }
        }
        save();
        System.out.println("Đã sửa thành công");
    }

    @Override
    public void save() {
        employeeRepo.save(employeeList);
    }
}
