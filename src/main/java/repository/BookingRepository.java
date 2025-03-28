package repository;

import fr.efrei.cinemabookingproject1.domain.Booking;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class BookingRepository implements IBookingRepository {
    private static IBookingRepository repository = null;
    private Set<Booking> bookingDB;

    private BookingRepository(){
        bookingDB = new HashSet<>();
    }

    public static IBookingRepository getIRepository(){
        if(repository == null){
            repository = new BookingRepository();
        }
        return repository;
    }


    @Override
    public Booking read(String status) {
        for (Booking a : bookingDB) {
            if (a.getStatus().equals(status)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public Set<Booking> getAllBookings() {return bookingDB;}

    @Override
    public Booking update(Booking booking) {
        Booking Booking = read(booking.getStatus());
        if(Booking != null){
            bookingDB.remove(Booking);
            bookingDB.add(booking);
            return Booking;
        }
        return null;
    }


    @Override
    public Booking create(Booking booking) {
        this.bookingDB.add(booking);
            return booking;

        }
    @Override
    public boolean delete(String status) {
        Booking deleteBooking = read(status);
        if(deleteBooking != null){}
        bookingDB.remove(deleteBooking);
        return true;
    }

    @Override
    public Object create(Object entity) {
        return null;
    }

    @Override
    public Optional read(Object o) {
        return Optional.empty();
    }

    @Override
    public Object update(Object entity) {
        return null;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public List findAll() {
        return List.of();
    }
}
