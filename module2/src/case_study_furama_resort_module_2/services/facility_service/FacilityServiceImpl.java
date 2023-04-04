package case_study_furama_resort_module_2.services.facility_service;

import case_study_furama_resort_module_2.model.facility.Facility;
import case_study_furama_resort_module_2.model.facility.House;
import case_study_furama_resort_module_2.model.facility.Room;
import case_study_furama_resort_module_2.model.facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

import static case_study_furama_resort_module_2.services.facility_service.HouseService.houseMap;
import static case_study_furama_resort_module_2.services.facility_service.RoomService.roomMap;
import static case_study_furama_resort_module_2.services.facility_service.VillaService.villaMap;

public class FacilityServiceImpl implements IFacilityService {
    static Scanner sc = new Scanner(System.in);
    static Map<Facility,Integer> facilityMaintenanceMap = new LinkedHashMap<>();
    static IVillaService villaService = new VillaService();
    static IHouseService houseService = new HouseService();
    static IRoomService roomService = new RoomService();

    @Override
    public void displayMaintenance() {
        System.out.println("________________________________FACILITY MAINTENANCE LIST_____________________________");
        System.out.println("-----------------------Villa Maintenance List-------------------");
        for (Map.Entry<Villa, Integer> villa:villaMap.entrySet()){
            if(villa.getValue()>=5){
                System.out.println(villa.getKey() + ", "+villa.getValue()+" uses");
            }
        }
        System.out.println("-----------------------House Maintenance List-------------------");
        for (Map.Entry<House, Integer> house:houseMap.entrySet()){
            if(house.getValue()>=5){
                System.out.println(house.getKey() + ", "+house.getValue()+" uses");
            }
        }
        System.out.println("-----------------------Room Maintenance List---------------------");
        for (Map.Entry<Room, Integer> room:roomMap.entrySet()){
            if(room.getValue()>=5){
                System.out.println(room.getKey() + ", "+room.getValue()+" uses");
            }
        }
    }

    @Override
    public void add() {
        boolean flag;
        do{
            flag = true;
            System.out.print("Add a new service:  \n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "Enter selection 1 -> 4 at here: ");
            String choose = sc.nextLine();
            switch (choose){
                case "1":
                    villaService.add();
                    break;
                case "2":
                    houseService.add();
                    break;
                case "3":
                    roomService.add();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.print("Please enter selection 1 -> 4 at here: ");
        }
        }while (flag);
    }

    @Override
    public void display() {
        System.out.println("----------------------------------VILLA LIST----------------------------------");
        villaService.display();
        System.out.println("----------------------------------HOUSE LIST----------------------------------");
        houseService.display();
        System.out.println("----------------------------------ROOM LIST-----------------------------------");
        roomService.display();
    }

    @Override
    public void edit() {

    }

    @Override
    public void save() {

    }
    public static String getRentalType(){
        String rentalType = "";
        boolean flag;
        do{
            flag = false;
            System.out.print("Choose the rental type: " +
                    "\n1. Year" +
                    "\n2. Month" +
                    "\n3. Day" +
                    "\nEnter selection 1->3 here: ");
            String choose = sc.nextLine();
            switch (choose){
                case "1":
                    rentalType = "Year";
                    break;
                case "2":
                    rentalType = "Month";
                    break;
                case "3":
                    rentalType = "Day";
                    break;
                default:
                    flag = true;
                    System.out.print("Please enter selection 1->3 at here: ");
            }
        }while (flag);
        return rentalType;
    }
}
