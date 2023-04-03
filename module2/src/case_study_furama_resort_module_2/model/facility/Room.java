package case_study_furama_resort_module_2.model.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String id, String serviceName, String usableArea, String rentalCosts,
                String maximumPeople, String rentalType, String freeService) {
        super(id, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + getId() + '\'' +
                ", serviceName='" + getServiceName() +
                ", usableArea=" + getUsableArea() +
                ", rentalCosts=" + getRentalCosts() +
                ", maximumPeople=" + getMaximumPeople() +
                ", rentalType='" + getRentalType() + '\'' +
                "freeService='" + freeService + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return getId() + "," + getServiceName() + "," + getUsableArea() + "," + getRentalCosts() + "," +
                getMaximumPeople() + "," + getRentalType() + "," + getFreeService();
    }
}
