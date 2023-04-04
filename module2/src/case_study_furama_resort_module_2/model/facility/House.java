package case_study_furama_resort_module_2.model.facility;

public class House extends Facility {
    private String roomStandard;
    private String numberOfFloors;

    public House() {
    }

    public House(String id, String serviceName, String usableArea, String rentalCosts, String maximumPeople, String rentalType, String roomStandard, String numberOfFloors) {
        super(id, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" + "id=" + getId() + ", serviceName=" + getServiceName() +
                ", usableArea=" + getUsableArea() +
                ", rentalCosts=" + getRentalCosts() +
                ", maximumPeople=" + getMaximumPeople() +
                ", rentalType=" + getRentalType() +
                ", roomStandard=3" +
                "" + roomStandard +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    public String getInfoToCSV() {
        return getId() + "," + getServiceName() + "," + getUsableArea() + "," +
                getRentalCosts() + "," + getMaximumPeople() + "," +
                getRentalType() + "," + getRoomStandard() + "," +
                getNumberOfFloors();
    }
}
