package case_study_furama_resort_module_2.services;

import case_study_furama_resort_module_2.model.Booking;
import case_study_furama_resort_module_2.model.Contract;
import case_study_furama_resort_module_2.repository.BookingRepoImpl;
import case_study_furama_resort_module_2.repository.ContractsRepoImpl;
import case_study_furama_resort_module_2.repository.IBookingRepo;
import case_study_furama_resort_module_2.repository.IContractsRepo;
import case_study_furama_resort_module_2.util.regex.Validate;

import java.util.*;

public class ContactServiceImpl implements IContactService {
    static Scanner sc = new Scanner(System.in);
    static IContractsRepo contractsRepo = new ContractsRepoImpl();
    static IBookingRepo bookingRepo = new BookingRepoImpl();
    static Set<Booking> bookingSet = bookingRepo.display();
    static Queue<Booking> bookingQueue = new LinkedList<>();
    Queue<Contract> contractList = contractsRepo.display();

    static {
        bookingQueue.addAll(bookingSet);
    }

    @Override
    public void add() {
        System.out.println("Create new contract: ");
        for(Booking b : bookingQueue){
            System.out.println(b);
        }
        String bookingId = "", customerId = "";
        for (int i = 0; i < bookingQueue.size(); i++) {
            customerId = bookingQueue.poll().getCustomerId();
            bookingId = bookingQueue.peek().getBookingId();
            for (Contract contract : contractList) {
                if (Objects.equals(bookingId, contract.getBookingId()) ) {
                    bookingId = "";
                    customerId = "";
                }
            }
            if (!Objects.equals(bookingId, "") && !Objects.equals(customerId, "")) {
                System.out.println("Booking ID: " + bookingId + " and Customer ID: " + customerId);
                break;
            }
        }
        System.out.print("Enter contrac number: ");
        String contractNumber = checkContractNumber();
        System.out.print("Enter advance deposit amount: ");
        String deposit = Validate.checkPositiveInteger();
        System.out.print("Enter total payment: ");
        String totalPayment = Validate.checkPositiveInteger();
        Contract contract = new Contract(contractNumber, bookingId, deposit, totalPayment, customerId);
        contractList.add(contract);
        contractsRepo.create(contractList);
        System.out.println("Created!!!");
    }

    public String checkContractNumber() {
        boolean flag;
        String contractNumber = "";
        do {
            flag = false;
            int count = 0;
            contractNumber = Validate.checkServiceNumb();
            for (Contract contract : contractList) {
                if (Objects.equals(contractNumber, contract.getContractNumber())) {
                    count++;
                }
            }
            if (count > 0) {
                flag = true;
                System.out.println("Contract number already in the system, please enter again!!!");
            }
        } while (flag);
        return contractNumber;
    }

    public String checkContractNumberEdit() {
        boolean flag;
        String contractNumber = "";
        do {
            flag = false;
            int count=0;
            contractNumber = Validate.checkServiceNumb();
            for (Contract contract : contractList) {
                if (Objects.equals(contractNumber, contract.getContractNumber())) {
                    count++;
                }
            }
            if(count == 1){
                System.out.println("Contract number already in the system, edit here!!!");
            }else {
                flag = true;
                System.out.println("Contract number not already in the system, please enter again!!!");
            }
        } while (flag);
        return contractNumber;
    }

    @Override
    public void display() {
        System.out.println("\n" +
                "-------------------CONSTRACT LIST-----------------");
        if (contractList.size() == 0) {
            System.out.println("Empty list!!!");
        } else {
            for (Contract contract : contractList) {
                System.out.println(contract);
            }
        }
    }

    @Override
    public void edit() {
        System.out.println("EDIT CONTRACT: ");
        System.out.print("Enter contrac number: ");
        String contractNumber = checkContractNumberEdit();
        System.out.print("Enter advance deposit amount: ");
        String deposit = Validate.checkPositiveInteger();
        System.out.print("Enter total payment: ");
        String totalPayment = Validate.checkPositiveInteger();
        for (Contract contract : contractList) {
            if (Objects.equals(contractNumber, contract.getContractNumber())) {
                contract.setDeposit(deposit);
                contract.setTotalPayment(totalPayment);
            }
        }
        contractsRepo.save(contractList);
    }

    @Override
    public void save() {

    }
}
