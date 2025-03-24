/*
Movie.java
Entity for Seat
Author: Vuyolwethu Ramncwana (220618534)
Date: 14 March 2025
 */

package fr.efrei.cinemabookingproject1.domain;

public class Seat {
    private String seatNumber;
    private String seatType;
    private String seatRow;


    public Seat() {
    }
    //7.CHANGE PUBLIC TO PRIVATE & BUILDER OBJECT
    private Seat(Builder builder) {
        this.seatNumber = builder.seatNumber;
        this.seatType = builder.seatType;
        this.seatRow = builder.seatRow;

    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSeatType() {
        return seatType;
    }

    public String getSeatRow() {
        return seatRow;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber='" + seatNumber + '\'' +
                ", seatType='" + seatType + '\'' +
                ", seatRow='" + seatRow + '\'' +
                '}';
    }

    //2.BUILDER CLASS
    public static class Builder {
        //3.VARIABLES
        private String seatNumber;
        private String seatType;
        private String seatRow;

        //8.CONSTRUCTOR
        public Builder() {
            this.seatNumber = seatNumber;
            this.seatType = seatType;
            this.seatRow = seatRow;
        }

        //4.CHANGE VOID TO BUILDER & RETURN STATEMENT
        public Builder setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }

        public Builder setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }

        public Builder setSeatRow(String seatRow) {
            this.seatRow = seatRow;
            return this;
        }
        //9.RETURN
        public Seat build() {return new Seat(this);}
    }

}
