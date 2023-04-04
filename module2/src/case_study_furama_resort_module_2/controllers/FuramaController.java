package case_study_furama_resort_module_2.controllers;

import case_study_furama_resort_module_2.services.*;
import case_study_furama_resort_module_2.services.facility_service.FacilityServiceImpl;
import case_study_furama_resort_module_2.services.facility_service.IFacilityService;

import java.util.Scanner;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);
    static IEmployeeService employeeService = new EmployeeServiceImpl();
    static ICustomerService customerService = new CustomerServiceImpl();
    static IFacilityService facilityService = new FacilityServiceImpl();
    static IBookingService bookingService = new BookingServiceImpl();
    static IContactService contactService = new ContactServiceImpl();
    static IPromtionService promtionService = new PromotionService();

    public static void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.print("MENU FURAMA MANAGEMENT:" +
                    "\n1. Employee Management" +
                    "\n2. Customer Management" +
                    "\n3. Facility Management" +
                    "\n4. Booking Management" +
                    "\n5. Promotion Management" +
                    "\n0. Exit" +
                    "\nEnter selection here: ");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    employeeManagement();
                    break;
                case "2":
                    customerManagement();
                    break;
                case "3":
                    facilityManagement();
                    break;
                case "4":
                    bookingManagement();
                    break;
                case "5":
                    promotionManagement();
                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    System.out.print("Please enter selection 0->5 at here:  ");
            }
        } while (flag);
    }

    public static void employeeManagement() {
        boolean flag = true;
        do {
            System.out.print("Employee Management:\n" +
                    "1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee`\n" +
                    "4\tReturn main menu" +
                    "\nEnter selection here:  ");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    employeeService.display();
                    break;
                case "2":
                    employeeService.add();
                    break;
                case "3":
                    employeeService.edit();
                    break;
                case "4":
                    employeeService.save();
                    flag = false;
                    break;
                default:
                    System.out.print("Please enter selection 1 -> 4 at here:  ");
            }
        } while (flag);
    }

    public static void customerManagement() {
        boolean flag = true;
        do {
            System.out.print("Customer Management:\n" +
                    "1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n" +
                    "Enter selection here: ");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    customerService.display();
                    break;
                case "2":
                    customerService.add();
                    break;
                case "3":
                    customerService.edit();
                    break;
                case "4":
                    customerService.save();
                    flag = false;
                    break;
                default:
                    System.out.println("Please enter selection 1 -> 4 at here:  ");
            }
        } while (flag);
    }

    public static void facilityManagement() {
        boolean flag = true;
        do {
            System.out.print("Facility Management: \n" +
                    "1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n" +
                    "Enter selection here:  ");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    facilityService.display();
                    break;
                case "2":
                    facilityService.add();
                    break;
                case "3":
                    facilityService.displayMaintenance();
                    break;
                case "4":
                    facilityService.save();
                    flag = false;
                    break;
                default:
                    System.out.print("Please enter selection 1 -> 4 at here:  ");
            }
        } while (flag);
    }

    public static void bookingManagement() {
        boolean flag = true;
        do {
            System.out.print("Booking Management:\n" +
                    "1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new contract\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n" +
                    "Enter selection here: ");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    bookingService.add();
                    break;
                case "2":
                    bookingService.display();
                    break;
                case "3":
                    contactService.add();
                    break;
                case "4":
                    contactService.display();
                    break;
                case "5":
                    contactService.edit();
                    break;
                case "6":
                    bookingService.save();
                    contactService.save();
                    flag = false;
                    break;
                default:
                    System.out.print("Please enter selection 1 -> 6 at here:  ");
            }
        } while (flag);
    }

    public static void promotionManagement() {
        boolean flag = true;
        do {
            System.out.print("Promotion Management:\n" +
                    "1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n" +
                    "Enter selection here: ");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    promtionService.displayCustomerUseService();
                    break;
                case "2":
                    promtionService.displayCustomerGetVoucher();
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.print("Please enter selection 1 -> 3 at here:  ");
            }
        } while (flag);
    }
}
