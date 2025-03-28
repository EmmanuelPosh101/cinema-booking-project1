package fr.efrei.cinemabookingproject1.domain;
//Sesona panca 222750014

import java.time.LocalTime;

public class Payment {
    private final String PaymentMethod;//(Credit/Debit/Digital Wallet etc)
    private final int TransactionId;
    private final double Amount;
    private final LocalTime Time;

    private Payment(PaymentBuilder builder){
        this.PaymentMethod = builder.PaymentMethod;
        this.TransactionId = builder.TransactionId;
        this.Amount =  builder.Amount;
        this.Time= builder.Time;
    }



    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public int getTransactionId() {
        return TransactionId;
    }

    public double getAmount() {
        return Amount;
    }

    public LocalTime getTime() {
        return Time;
    }



    public static class PaymentBuilder {
        private String PaymentMethod;//(Credit/Debit/Digital Wallet etc)
        private int TransactionId;
        private  double Amount;
        private LocalTime Time;


        @Override
        public String toString() {
            return "PaymentBuilder{" +
                    "PaymentMethod='" + PaymentMethod + '\'' +
                    ", TransactionId=" + TransactionId +
                    ", Amount=" + Amount +
                    ", Time='" + Time + '\'' +
                    '}';
        }

        public PaymentBuilder setPaymentMethod(String paymentMethod) {
            this.PaymentMethod = paymentMethod;
            return this;
        }

        public PaymentBuilder setTransactionId(int transactionId) {
            this.TransactionId = transactionId;
            return this;
        }

        public PaymentBuilder setAmount(double amount) {
            this.Amount = amount;
            return this;
        }

        public PaymentBuilder setTime(LocalTime time) {
            this.Time = time;
            return this;
        }
        public Payment build (){
            return new Payment(this);
        }
    }
}



