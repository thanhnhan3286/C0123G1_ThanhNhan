package case_study_furama_resort_module_2.services.facility_service;

import case_study_furama_resort_module_2.model.facility.Villa;
import case_study_furama_resort_module_2.repository.facility_repo.IVillaRepo;
import case_study_furama_resort_module_2.repository.facility_repo.VillaRepoImpl;
import case_study_furama_resort_module_2.util.regex.Validate;

import java.util.Map;
import java.util.Scanner;

public class VillaService implements IVillaService {
    static Scanner sc = new Scanner(System.in);
    static IVillaRepo villaRepo = new VillaRepoImpl();
    static Villa villa = new Villa();
    static Map<Villa, Integer> villaMap = villaRepo.display();

    @Override
    public void add() {
        System.out.println("ADD NEW VILLA: ");
        System.out.print("Enter the ID service: ");
        String id = Validate.checkServiceIdVilla();
        System.out.print("Enter the name service: ");
        String name = Validate.checkServiceNameVilla();
        System.out.print("Enter the usable area: ");
        String usableArea = Validate.checkUseArea();
        System.out.print("Enter the rental costs: ");
        String rentalCosts = Validate.checkPositiveInteger();
        System.out.print("Enter the maximum person: ");
        String maxPeople = Validate.checkMaxPeople();
        String rentalType = FacilityServiceImpl.getRentalType();
        System.out.print("Enter the room standard: ");
        String roomStandard = Validate.checkServiceNameVilla();
        System.out.println("Enter the swimming pool area: ");
        String swimmingPoolArea = Validate.checkUseArea();
        villa = new Villa(id, name, usableArea, rentalCosts, maxPeople, rentalType, roomStandard, swimmingPoolArea);
        villaMap.put(villa, 0);
        save();
        System.out.println("Added!!!");
    }

    @Override
    public void display() {
        if (villaMap.size() <= 0) {
            System.out.println("Empty list!!!");
        } else {
            for (Map.Entry<Villa, Integer> entry : villaMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + " uses");
            }
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void save() {
        villaRepo.save(villaMap);
    }
}
