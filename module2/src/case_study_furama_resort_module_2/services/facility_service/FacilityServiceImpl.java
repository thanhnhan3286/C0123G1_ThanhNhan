package case_study_furama_resort_module_2.services.facility_service;

import case_study_furama_resort_module_2.model.facility.Facility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    static Scanner sc = new Scanner(System.in);
    static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static IVillaService villaService = new VillaService();
    static IHouseService houseService = new HouseService();
    static IRoomService roomService = new RoomService();

    @Override
    public void displayMaintenance() {


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
