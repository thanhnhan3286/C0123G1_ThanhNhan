package case_study_furama_resort_module_2.repository;

import case_study_furama_resort_module_2.model.Booking;
import case_study_furama_resort_module_2.util.read_and_write.ReadAndWriteBooking;

import java.util.Set;

public class BookingRepoImpl implements IBookingRepo {
    private static final String PATH_FILE_BOOKING = "src\\case_study_furama_resort_module_2\\data\\booking.csv";
    static Set<Booking> bookingSet = ReadAndWriteBooking.readFile(PATH_FILE_BOOKING);

    @Override
    public void add(Set<Booking> bookingSet) {
        save(bookingSet);
    }

    @Override
    public Set<Booking> display() {
        return bookingSet;
    }


    @Override
    public void save(Set<Booking> bookingSet) {
        ReadAndWriteBooking.writeFile(PATH_FILE_BOOKING,bookingSet);
    }
}
