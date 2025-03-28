/*
Movie.java
Entity for Booking
Author: Vuyolwethu Ramncwana (220618534)
Date: 14 March 2025
 */
package fr.efrei.cinemabookingproject1.domain;

public class Booking {
    private String customer;
    private String seat;
    private String price;
    private String time;
    private String paymentMethod;
    private String status;

    public Booking() {
    }

    private Booking(Builder builder) {
        this.customer = builder.customer;
        this.seat = builder.seat;
        this.price = builder.price;
        this.time = builder.time;
        this.paymentMethod = builder.paymentMethod;
        this.status = builder.status;
    }

    public String getCustomer() {
        return customer;
    }

    public String getSeat() {
        return seat;
    }

    public String getPrice() {
        return price;
    }

    public String getTime() {
        return time;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "customer='" + customer + '\'' +
                ", seat='" + seat + '\'' +
                ", price='" + price + '\'' +
                ", time='" + time + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static class Builder {
        //3.VARIABLES
        private String customer;
        private String seat;
        private String price;
        private String time;
        private String paymentMethod;
        private String status;

        public Builder() {
            this.customer = customer;
            this.seat = seat;
            this.price = price;
            this.time = time;
            this.paymentMethod = paymentMethod;
            this.status = status;
        }

        public Builder setCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public Builder setSeat(String seat) {
            this.seat = seat;
            return this;
        }

        public Builder setPrice(String price) {
            this.price = price;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }

}