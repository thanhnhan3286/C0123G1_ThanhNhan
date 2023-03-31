package case_study_furama_resort_module_2.services;

import case_study_furama_resort_module_2.model.person.Customer;
import case_study_furama_resort_module_2.repository.CustomerRepo;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static Scanner sc = new Scanner(System.in);
    static CustomerRepo customerRepo = new CustomerRepo();
    static Customer customer = new Customer();
    static List<Customer> customerList = customerRepo.display();

    @Override
    public void add() {
        System.out.println("Thêm mới khách hàng: ");
        boolean flag;
        String customerId;
        System.out.print("Nhập mã khách hàng: ");
        do {
            flag = false;
            customerId = sc.nextLine();
            if (checkId(customerId)) {
                flag = true;
                System.out.println("ID đã tồn tại, mời nhập lại");
            }
        } while (flag);
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
            if (checkNumberOfIdCard(numberOfIdCard)) {
                flag = true;
                System.out.println("Số CMND đã tồn tại, mời nhập lại");
            }
        } while (flag);
        System.out.print("Nhập số điện thoại: ");
        String numberPhone = sc.nextLine();
        System.out.print("Nhập Email: ");
        String email = sc.nextLine();
        String customerLevel = getCustomerLevel();
        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();
        customer = new Customer(customerId, fullName, birirthday, gender, numberOfIdCard, numberPhone,
                email,customerLevel,address);
        customerList.add(customer);
        save();
        System.out.println("Đã thêm thành công");
    }

    @Override
    public void display() {
        if (customerList.size() == 0) {
            System.out.println("Danh sách rỗng");
        } else {
            for (Customer c : customerList) {
                System.out.println(c);
            }
        }
    }

    @Override
    public void edit() {
        System.out.println("Chỉnh sửa khách hàng: ");
        boolean flag;
        String customerId;
        System.out.print("Nhập mã khách hàng cần sửa: ");
        do {
            flag = false;
            customerId = sc.nextLine();
            if (checkId(customerId)) {
                flag = true;
                System.out.println("ID có trong danh sách, mời sửa đổi");
            }else{
                System.out.println("ID không tồn tại, mời nhập lại: ");
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
            if (checkNumberOfIdCard1(numberOfIdCard)) {
                flag = true;
                System.out.println("Số CMND đã tồn tại, mời nhập lại");
            }
        } while (flag);
        System.out.print("Nhập số điện thoại: ");
        String numberPhone = sc.nextLine();
        System.out.print("Nhập Email: ");
        String email = sc.nextLine();
        String customerLevel = getCustomerLevel();
        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();
        customer = new Customer(customerId, fullName, birirthday, gender, numberOfIdCard, numberPhone,
                email,customerLevel,address);
        customerList.add(customer);
        save();
        System.out.println("Đã thêm thành công");
    }

    @Override
    public void save() {
        customerRepo.save(customerList);
    }
    public static String getGender() {
        String gender = "";
        boolean flag;
        do {
            flag = false;
            System.out.println("Chọn giới tính: " +
                    "\n1. Nam" +
                    "\n2. Nữ" +
                    "\n3. Khác" +
                    "\nNhập lựa chọn");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    gender = "Nam";
                    break;
                case "2":
                    gender = "Nữ";
                    break;
                case "3":
                    System.out.println("Nhập giới tính");
                    gender = sc.nextLine();
                    break;
                default:
                    flag = true;
            }
        } while (flag);
        return gender;
    }
    public static String getCustomerLevel() {
        String level = "";
        boolean flag;
        do {
            flag = false;
            System.out.println("Chọn loại khách hàng: " +
                    "\n1. Diamond" +
                    "\n2. Platinium" +
                    "\n3. Gold" +
                    "\n4. Sliver" +
                    "\n5. Member" +
                    "\nNhập lựa chọn");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    level = "Diamond";
                    break;
                case "2":
                    level = "Platinium";
                    break;
                case "3":
                    level = "Gold";
                    break;
                case "4":
                    level = "Sliver";
                    break;
                case "5":
                    level = "Member";
                    break;
                default:
                    flag = true;
            }
        } while (flag);
        return level;
    }
    public static boolean checkId(String id) {
        int count = 0;
        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(customerList.get(i).getId(), id)) {
                count++;
            }
        }
        if (count != 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkNumberOfIdCard(String id) {
        int count = 0;
        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(customerList.get(i).getNumberOfIdCard(), id)) {
                count++;
            }
        }
        if (count != 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkNumberOfIdCard1(String id) {
        int count = 0;
        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(customerList.get(i).getNumberOfIdCard(), id)) {
                count++;
            }
        }
        if (count >= 1) {
            return true;
        } else {
            return false;
        }
    }
}
