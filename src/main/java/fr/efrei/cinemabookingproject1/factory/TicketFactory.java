package fr.efrei.cinemabookingproject1.factory;

import fr.efrei.cinemabookingproject1.domain.Ticket;

public class TicketFactory {

    public static Ticket createTicket(String movieName, int screenNumber, int seatNumber, String bookingStatus) {
        return new Ticket.Builder()
                .movieName(movieName)
                .screenNumber(screenNumber)
                .seatNumber(seatNumber)
                .bookingStatus(bookingStatus)
                .build();
    }
}