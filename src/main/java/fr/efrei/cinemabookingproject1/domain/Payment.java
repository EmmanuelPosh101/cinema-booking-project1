package fr.efrei.cinemabookingproject1.domain;
//222750014 Sesona Panca
import java.time.LocalTime;

public class Payment {
    private  String  PaymentMethod;
    private int TransactionID;
    private double Amount;
    private LocalTime Time;

    private Payment(Payment.Builder builder) {
        this.PaymentMethod = builder.PaymentMethod;
        this.TransactionID = builder.TransactionID;
        this.Amount = builder.Amount;
        this.Time = builder.Time;
    }

    public int getTransactionID() {
        return TransactionID;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public double getAmount() {
        return Amount;
    }

    public LocalTime getTime() {
        return Time;
    }
    public static class Builder {
        private  String  PaymentMethod;
        private int TransactionID;
        private double Amount;
        private LocalTime Time;

        public Builder setPaymentMethod(String paymentMethod) {
            PaymentMethod = paymentMethod;
            return this;
        }

        public Builder setTransactionID(int transactionID) {
            TransactionID = transactionID;
            return this;
        }

        public  Builder setAmount(double amount) {
            Amount = amount;
            return this;
        }

        public Builder setTime(LocalTime time) {
            Time = time;
            return this;
        }
        public Payment build() {
            return new Payment(this);
        }
    }
    }

