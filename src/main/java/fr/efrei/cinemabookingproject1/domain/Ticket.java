package fr.efrei.cinemabookingproject1.domain;



public class Ticket {
    private String customerName;
    private String movieName;
    private int screenNumber;
    private int seatNumber;
    private String bookingStatus;
    private double Price;
    private int Showtime;

    public Ticket(Object o) {
    }

    public Ticket() {

    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public void setScreenNumber(int screenNumber) {
        this.screenNumber = screenNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getShowtime() {
        return Showtime;
    }

    public void setShowtime(int showtime) {
        Showtime = showtime;
    }

    private void screenNumber(int screenNumber) {
    }

    private void bookingStatus(String successful) {
    }

    public Object movieName(String movieName) {
        return null;
    }

    private Ticket price(double price) {
        return null;
    }


    public Ticket bookTicket(String movieName, int screenNumber, int seatNumber, double Price) {
        Ticket ticket = new Ticket();
                movieName(movieName);
                screenNumber(screenNumber);
                seatNumber(seatNumber);
                price(Price);
                bookingStatus("Successful");
        return ticket;
    }

    private void seatNumber(int seatNumber) {
    }

    public static Ticket builder() {
        return null;
    }}

