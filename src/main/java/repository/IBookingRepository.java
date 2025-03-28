package repository;

import fr.efrei.cinemabookingproject1.domain.Booking;

import java.util.Set;

public interface IBookingRepository extends IRepository{
    Booking read(String status);

    Set<Booking> getAllBookings();

    Booking update(Booking booking);

    Object create(Booking booking);

    boolean delete(String status);
}
