/*
Booking.java
Factory for Booking
Author: Vuyolwethu Ramncwana (220618534)
Date: 17 March 2025
 */

package fr.efrei.cinemabookingproject1.factory;

import fr.efrei.cinemabookingproject1.domain.Booking;

public class BookingFactory {
    public Booking createBooking(String customer, String seat, String price, String time, String paymentMethod, String status){

        return new Booking.Builder()
                .setCustomer(customer)
                .setSeat(seat)
                .setPrice(price)
                .setTime(time)
                .setPaymentMethod(paymentMethod)
                .setStatus(status)
                .build();
    }
}
