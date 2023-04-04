package case_study_furama_resort_module_2.services;

import case_study_furama_resort_module_2.model.Booking;
import case_study_furama_resort_module_2.model.person.Customer;
import case_study_furama_resort_module_2.repository.BookingRepoImpl;
import case_study_furama_resort_module_2.repository.CustomerRepoImpl;
import case_study_furama_resort_module_2.repository.IBookingRepo;
import case_study_furama_resort_module_2.repository.ICustomerRepo;
import case_study_furama_resort_module_2.services.facility_service.FacilityServiceImpl;
import case_study_furama_resort_module_2.services.facility_service.IFacilityService;
import case_study_furama_resort_module_2.util.regex.Validate;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import static case_study_furama_resort_module_2.services.CustomerServiceImpl.checkId;

public class BookingServiceImpl implements IBookingService{
    static Scanner sc = new Scanner(System.in);
    static IBookingRepo bookingRepo = new BookingRepoImpl();
     Set<Booking> bookingSet = bookingRepo.display();
    static ICustomerRepo customerRepo = new CustomerRepoImpl();
    static IFacilityService facilityService = new FacilityServiceImpl();
    List<Customer> customerList = customerRepo.display();

    @Override
    public void add() {
        System.out.println("---------------------CUSTOMER LIST-------------------------");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println("Customer: "+customerList.get(i).getFullName() +
                    " ---|:|--- ID: " + customerList.get(i).getId());
        }
        System.out.println("________________________SERVICE LIST__________________________");
        facilityService.display();
        System.out.print("Enter booking ID here:  ");
        String bookingId;
        boolean flag;
        do{
            flag=true;
            bookingId = sc.nextLine();
            if(checkIdBooking(bookingId)){
                System.out.print("ID ALREADY EXIST, ENTER HERE AGAIN:    ");
            }else {
                flag = false;
            }
        }while (flag);
        System.out.print("Enter customer ID: ");
        String customerId;
        do {
            flag = false;
            customerId = Validate.checkIdPerson();
            if (checkId(customerId)) {
                flag = true;
                System.out.println("Customer ID is already in the system!!! ");
            } else {
                System.out.println("Customer ID is not already in the system, please enter here again: ");
            }
        } while (!flag);
        String serviceId;
//        for (int i = 0; i < customerList.size(); i++) {
//            if(Objects.equals(customerId, customerList.get(i).getId())){
//                name = customerList.get(i).getFullName();
//            }
//        }
        System.out.print("Enter start day booking: ");
        String startDay = Validate.checkDayBooking();
        System.out.print("Enter end day booking: ");
        String endDay = Validate.checkDayBooking();
        System.out.print("Enter service name: ");
        String serviceName = sc.nextLine();
        System.out.println("Enter service type: ");
        String serviceType = sc.nextLine();
        Booking booking = new Booking(bookingId,startDay,endDay,customerId,serviceName,serviceType);
        bookingSet.add(booking);
        save();
        System.out.println("Added!!!");
    }
    public boolean checkIdBooking(String id) {
        int count = 0;
        for (Booking b : bookingSet) {
            if (Objects.equals(b.getBookingId(), id)) {
                count++;
            }
        }
        if (count != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void display() {
        System.out.println("--------------------BOOKING LIST-----------------");
        if(bookingSet.size()<=0) {
            System.out.println("Empty list!!!");
        }else {
            for (Booking b: bookingSet) {
                System.out.println(b);
            }
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void save() {
        bookingRepo.save(bookingSet);
    }
}
