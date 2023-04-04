package case_study_furama_resort_module_2.model.facility;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Villa extends Facility {
    private String roomStandard;
    private String swimmingPoolArea;

    public Villa() {
    }

    public Villa(String id, String serviceName, String usableArea, String rentalCosts, String maximumPeople, String rentalType,
                 String roomStandard, String swimmingPoolArea) {
        super(id, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(String swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    @Override
    public String toString() {
        return "Villa{" + "id=" + getId() +
                ", serviceName=" + getServiceName() +
                ", usableArea=" + getUsableArea() +
                ", rentalCosts=" + getRentalCosts() +
                ", maximumPeople=" + getMaximumPeople() +
                ", rentalType=" + getRentalType() +
                ", roomStandard=3" +
                "" + roomStandard +
                ", swimmingPoolArea=" + swimmingPoolArea +
                '}';
    }

    public String getInfoToCSV() {
        return getId() + "," + getServiceName() + "," + getUsableArea() + "," +
                getRentalCosts() + "," + getMaximumPeople() + "," +
                getRentalType() + "," + getRoomStandard() + "," +
                getSwimmingPoolArea();
    }
}
