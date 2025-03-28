/*
Movie.java
Factory for Seat
Author: Vuyolwethu Ramncwana (220618534)
Date: 17 March 2025
 */

package fr.efrei.cinemabookingproject1.factory;

import fr.efrei.cinemabookingproject1.domain.Seat;

public class SeatFactory {
    public Seat CreateSeat(String seatNumber, String seatType, String seatRow) {

        return new Seat.Builder()
                .setSeatNumber(seatNumber)
                .setSeatType(seatType)
                .setSeatRow(seatRow)
                .build();
    }

}
