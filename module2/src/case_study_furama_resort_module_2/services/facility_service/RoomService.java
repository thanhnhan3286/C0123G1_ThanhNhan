package case_study_furama_resort_module_2.services.facility_service;

import case_study_furama_resort_module_2.model.facility.Room;
import case_study_furama_resort_module_2.repository.facility_repo.IRoomRepo;
import case_study_furama_resort_module_2.repository.facility_repo.RoomRepoImpl;
import case_study_furama_resort_module_2.util.regex.Validate;

import java.util.Map;
import java.util.Scanner;

public class RoomService implements IRoomService {
    static Scanner sc = new Scanner(System.in);
    static IRoomRepo roomRepo = new RoomRepoImpl();
    static Room room = new Room();
    static Map<Room, Integer> roomMap = roomRepo.display();

    @Override
    public void add() {
        System.out.println("ADD NEW ROOM: ");
        System.out.print("Enter the ID service: ");
        String id = Validate.checkServiceIdRoom();
        System.out.print("Enter the name service: ");
        String name = Validate.checkServiceNameRoom();
        System.out.print("Enter the usable area: ");
        String usableArea = Validate.checkUseArea();
        System.out.print("Enter the rental costs: ");
        String rentalCosts = Validate.checkPositiveInteger();
        System.out.print("Enter the maximum person: ");
        String maxPeople = Validate.checkMaxPeople();
        String rentalType = FacilityServiceImpl.getRentalType();
        System.out.println("Enter the free service attach: ");
        String freeService = sc.nextLine();
        room = new Room(id, name, usableArea, rentalCosts, maxPeople, rentalType, freeService);
        roomMap.put(room, 0);
        save();
        System.out.println("Added!!!");
    }

    @Override
    public void display() {
        if (roomMap.size() <= 0) {
            System.out.println("Empty list!!!");
        } else {
            for (Map.Entry<Room, Integer> entry : roomMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + " uses");
            }
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void save() {
        roomRepo.save(roomMap);
    }
}
