package case_study_furama_resort_module_2.services;

import case_study_furama_resort_module_2.model.person.Customer;
import case_study_furama_resort_module_2.repository.CustomerRepoImpl;
import case_study_furama_resort_module_2.util.regex.Validate;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static Scanner sc = new Scanner(System.in);
    static CustomerRepoImpl customerRepo = new CustomerRepoImpl();
    static Customer customer = new Customer();
    static List<Customer> customerList = customerRepo.display();

    @Override
    public void add() {
        System.out.println("ADD NEW CUSTOMER: ");
        boolean flag;
        String customerId;
        System.out.print("Enter the customer ID: ");
        do {
            flag = false;
            customerId = sc.nextLine();
            if (checkId(customerId)) {
                flag = true;
                System.out.print("Customer ID is already in the system, please enter again here: ");
            }
        } while (flag);
        System.out.print("Enter the customer name: ");
        String fullName = sc.nextLine();
        System.out.print("Enter the birthday: ");
        String birirthday = sc.nextLine();
        String gender = getGender();
        System.out.print("Enter identity card number: ");
        String numberOfIdCard;
        do {
            flag = false;
            numberOfIdCard = sc.nextLine();
            if (checkNumberOfIdCard(numberOfIdCard)) {
                flag = true;
                System.out.print("The identity card number is already in the system, please enter here again: ");
            }
        } while (flag);
        System.out.print("Enter phone number: ");
        String numberPhone = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        String customerLevel = getCustomerLevel();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        customer = new Customer(customerId, fullName, birirthday, gender, numberOfIdCard, numberPhone,
                email, customerLevel, address);
        customerList.add(customer);
        save();
        System.out.println("Added!!!");
    }

    @Override
    public void display() {
        System.out.println("------------------------ CUSTOMER LIST -------------------------");
        if (customerList.size() <= 0) {
            System.out.println("Empty list!!!");
        } else {
            for (Customer c : customerList) {
                System.out.println(c);
            }
        }
    }

    @Override
    public void edit() {
        System.out.println("EDIT CUSTOMER: ");
        boolean flag;
        String customerId;
        System.out.print("Enter the customer ID need edit: ");
        do {
            flag = false;
            customerId = sc.nextLine();
            if (checkId(customerId)) {
                flag = true;
                System.out.println("Customer ID is already in the system, edit here: ");
            } else {
                System.out.println("Customer ID is not already in the system, please enter here again: ");
            }
        } while (!flag);
        System.out.print("Enter the customer name: ");
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
        String customerLevel = getCustomerLevel();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        customer = new Customer(customerId, fullName, birirthday, gender, numberOfIdCard, numberPhone,
                email, customerLevel, address);
        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(customerList.get(i).getId(), customerId)) {
                customerList.set(i, customer);
            }
        }
        save();
        System.out.println("Edited!!!");
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
                    System.out.print("Enter selection 1->3, please enter here again: ");
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
            System.out.println("Choose the customer level: " +
                    "\n1. Diamond" +
                    "\n2. Platinium" +
                    "\n3. Gold" +
                    "\n4. Sliver" +
                    "\n5. Member" +
                    "\nEnter selection here: ");
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
                    System.out.print("Enter selection 1->5, please enter here again: ");
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

    public static boolean checkNumberOfIdCardEdit(String id) {
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
