package case_study_furama_resort_module_2.repository;

import case_study_furama_resort_module_2.model.Booking;

import java.util.Set;

public interface IBookingRepo {
    void add(Set<Booking> bookingSet);
    Set<Booking> display();
    void save(Set<Booking> bookingSet);
}
