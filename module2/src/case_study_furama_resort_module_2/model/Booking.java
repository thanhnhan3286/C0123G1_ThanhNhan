package case_study_furama_resort_module_2.model;

import java.util.Date;
import java.util.Objects;

public class Booking implements Comparable<Booking>{
    private String bookingId;
    private String startDay;
    private String endDay;
    private String customerId;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(String bookingId, String startDay, String endDay, String customerId,
                   String serviceName, String serviceType) {
        this.bookingId = bookingId;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerId = customerId;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customerId='" + customerId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return bookingId + "," + startDay +
                "," + endDay + "," + customerId +
                "," + serviceName + "," + serviceType;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Booking booking = (Booking) o;
//        return bookingId.equals(booking.bookingId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(bookingId);
//    }

    @Override
    public int compareTo(Booking o) {
        if (startDay.equals(o.startDay)){
             Date endDay = new Date(this.endDay);
             Date endDayObj = new Date(o.endDay);
             return endDay.after(endDayObj) ? 1 : -1;
        }
        Date startDate = new Date(startDay);
        Date startDateObj = new Date(o.startDay);
        return startDate.after(startDateObj) ? 1 : -1;
    }
//        return this.getStartDay().compareTo(o.getStartDay());
//    }
}
