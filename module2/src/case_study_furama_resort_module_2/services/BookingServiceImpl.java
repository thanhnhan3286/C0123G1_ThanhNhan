package case_study_furama_resort_module_2.services;

import case_study_furama_resort_module_2.model.Booking;
import case_study_furama_resort_module_2.model.facility.House;
import case_study_furama_resort_module_2.model.facility.Room;
import case_study_furama_resort_module_2.model.facility.Villa;
import case_study_furama_resort_module_2.model.person.Customer;
import case_study_furama_resort_module_2.repository.BookingRepoImpl;
import case_study_furama_resort_module_2.repository.CustomerRepoImpl;
import case_study_furama_resort_module_2.repository.IBookingRepo;
import case_study_furama_resort_module_2.repository.ICustomerRepo;
import case_study_furama_resort_module_2.repository.facility_repo.*;
import case_study_furama_resort_module_2.services.facility_service.*;
import case_study_furama_resort_module_2.util.regex.Validate;

import java.util.*;

import static case_study_furama_resort_module_2.services.CustomerServiceImpl.checkId;

public class BookingServiceImpl implements IBookingService {
    static Scanner sc = new Scanner(System.in);
    static IBookingRepo bookingRepo = new BookingRepoImpl();
    Set<Booking> bookingSet = bookingRepo.display();
    static ICustomerRepo customerRepo = new CustomerRepoImpl();
    static IHouseService houseService = new HouseService();
    static IHouseRepo houseRepo = new HouseRepoImpl();
    Map<House, Integer> houseMap = houseRepo.display();
    static IVillaService villaService = new VillaService();
    static IVillaRepo villaRepo = new VillaRepoImpl();
    Map<Villa, Integer> villaMap = villaRepo.display();
    static IRoomService roomService = new RoomService();
    static IRoomRepo roomRepo = new RoomRepoImpl();
    Map<Room, Integer> roomMap = roomRepo.display();
    List<Customer> customerList = customerRepo.display();

    @Override
    public void add() {
        System.out.println("\n" +
                "----------ADD NEW BOOKING----------");
        System.out.print("Enter booking ID here:  ");
        String bookingId;
        boolean flag;
        do {
            flag = true;
            bookingId = Validate.checkServiceNumb();
            if (checkIdBooking(bookingId)) {
                System.out.print("ID ALREADY EXIST, ENTER HERE AGAIN:    ");
            } else {
                flag = false;
            }
        } while (flag);
        System.out.println("---------------------CUSTOMER LIST-------------------------");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println("Customer: " + customerList.get(i).getFullName() +
                    " ---|:|--- ID: " + customerList.get(i).getId());
        }
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
        System.out.println("Choose service: ");
        String serviceType = enterService();
        System.out.println("________________________SERVICE LIST__________________________");
        String serviceName = getServiceNameAndUsedPlus1(serviceType);
        String startDay = checkStartDay(serviceName,serviceType);
        String endDay = checkEndDay(startDay);
        Booking booking = new Booking(bookingId, startDay, endDay, customerId, serviceName, serviceType);
        bookingSet.add(booking);
        save();
        System.out.println("Added!!!");
    }

    public String getServiceNameAndUsedPlus1(String serviceType) {
        String serviceName = "";
        String serviceId = "";
        switch (serviceType) {
            case "Villa":
                villaService.display();
                System.out.print("\n" +
                        "\nEnter ID service: ");
                serviceId = Validate.checkServiceIdVilla();
                for (Map.Entry<Villa, Integer> villa : villaMap.entrySet()) {
                    if (Objects.equals(serviceId, villa.getKey().getId())) {
                        serviceName = villa.getKey().getServiceName();
                    }
                }
                for (Villa villa : villaMap.keySet()) {
                    if (villa.getId().equals(serviceId)) {
                        villaMap.put(villa, villaMap.get(villa) + 1);
                        villaRepo.save(villaMap);
                    }
                }
                break;
            case "House":
                houseService.display();
                System.out.print("\n" +
                        "\nEnter ID service: ");
                serviceId = Validate.checkServiceIdHouse();
                for (Map.Entry<House, Integer> house : houseMap.entrySet()) {
                    if (Objects.equals(serviceId, house.getKey().getId())) {
                        serviceName = house.getKey().getServiceName();
                    }
                }
                for (House house : houseMap.keySet()) {
                    if (house.getId().equals(serviceId)) {
                        houseMap.put(house, houseMap.get(house) + 1);
                        houseRepo.save(houseMap);
                    }
                }
                break;
            case "Room":
                roomService.display();
                System.out.print("\n" +
                        "\nEnter ID service: ");
                serviceId = Validate.checkServiceIdRoom();
                for (Map.Entry<Room, Integer> room : roomMap.entrySet()) {
                    if (Objects.equals(serviceId, room.getKey().getId())) {
                        serviceName = room.getKey().getServiceName();
                    }
                }
                for (Room room : roomMap.keySet()) {
                    if (room.getId().equals(serviceId)) {
                        roomMap.put(room, roomMap.get(room) + 1);
                        roomRepo.save(roomMap);
                    }
                }
                break;
            default:
                System.out.println("Empty list!!!");
        }
        return serviceName;
    }

    public String enterService() {
        String service = "";
        boolean flag;
        do {
            flag = false;
            System.out.println("1. Villa" +
                    "\n2. House" +
                    "\n3. Room" +
                    "\nEnter choose: ");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    service = "Villa";
                    break;
                case "2":
                    service = "House";
                    break;
                case "3":
                    service = "Room";
                    break;
                default:
                    flag = true;
                    System.out.print("Please choose 1->3, enter choose here: ");
            }
        } while (flag);
        return service;
    }

    public String checkStartDay(String name, String type) {
        boolean flag;
        String startDay = "";
        do {
            flag = true;
            System.out.print("Enter start day booking: ");
            startDay = Validate.checkDayBooking();

            String endDay = "";
            for (Booking b : bookingSet) {
                if (Objects.equals(name, b.getServiceName()) && Objects.equals(type, b.getServiceType())) {
                    endDay = b.getEndDay();
                }
            }
            Date start = new Date(startDay);
            Date end = new Date(endDay);
            if (startDay.equals(endDay) || (start.before(end) ? 1 : -1) == 1) {
                System.out.println("Invalid date, please re-enter!!!");
            } else {
                flag = false;
            }
        } while (flag);
        return startDay;
    }

    public String checkEndDay(String startDay) {
        boolean flag;
        String endDay = "";
        do {
            flag = true;
            System.out.print("Enter end day booking: ");
            endDay = Validate.checkDayBooking();
            Date start = new Date(startDay);
            Date end = new Date(endDay);
            if (startDay.equals(endDay) || (start.before(end) ? 1 : -1) == 1) {
                flag = false;
            } else {
                System.out.println("Invalid date, please re-enter!!!");
            }
        } while (flag);
        return endDay;
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
        if (bookingSet.size() <= 0) {
            System.out.println("Empty list!!!");
        } else {
            for (Booking b : bookingSet) {
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
