package case_study_furama_resort_module_2.services.facility_service;

import case_study_furama_resort_module_2.model.facility.House;
import case_study_furama_resort_module_2.repository.facility_repo.HouseRepoImpl;
import case_study_furama_resort_module_2.repository.facility_repo.IHouseRepo;
import case_study_furama_resort_module_2.util.regex.Validate;


import java.util.Map;
import java.util.Scanner;

public class HouseService implements IHouseService {
    static Scanner sc = new Scanner(System.in);
    static IHouseRepo houseRepo = new HouseRepoImpl();
    static House house = new House();
    static Map<House, Integer> houseMap = houseRepo.display();

    @Override
    public void add() {
        System.out.println("ADD NEW HOUSE: ");
        System.out.print("Enter the ID service: ");
        String id = Validate.checkServiceIdHouse();
        System.out.print("Enter the name service: ");
        String name = Validate.checkServiceNameHouse();
        System.out.print("Enter the usable area: ");
        String usableArea = Validate.checkUseArea();
        System.out.print("Enter the rental costs: ");
        String rentalCosts = Validate.checkPositiveInteger();
        System.out.print("Enter the maximum person: ");
        String maxPeople = Validate.checkMaxPeople();
        String rentalType = FacilityServiceImpl.getRentalType();
        System.out.print("Enter the room standard: ");
        String roomStandard = sc.nextLine();
        System.out.print("Enter number of floors: ");
        String numberOfFloors = sc.nextLine();
        house = new House(id, name, usableArea, rentalCosts, maxPeople, rentalType, roomStandard, numberOfFloors);
        houseMap.put(house, 0);
        save();
        System.out.println("Added!!!");
    }

    @Override
    public void display() {
        if (houseMap.size() <= 0) {
            System.out.println("Empty list!!!");
        } else {
            for (Map.Entry<House, Integer> entry : houseMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + " uses");
            }
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void save() {
        houseRepo.save(houseMap);
    }
}
