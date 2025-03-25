package fr.efrei.cinemabookingproject1.factory;
//222750014 Sesona Panca

import fr.efrei.cinemabookingproject1.domain.Payment;


import java.time.LocalTime;


public class PaymentFactory {
    public static Payment createPayment(String paymentMethod, int transactionId, double amount, LocalTime time){
        if (paymentMethod == null || paymentMethod.isEmpty()) {
            throw new IllegalArgumentException("paymentMethod cannot be null or empty");
        }
        if (transactionId <= 0) {
            throw new IllegalArgumentException("Transaction ID must be greater than 0");
        }

        if (amount <= 0) {
        throw new IllegalArgumentException("Amount must be greater than 0");
        }

        if (time == null) {
            throw new IllegalArgumentException("Time must be provided");
        }


        return new Payment.PaymentBuilder()
                .setPaymentMethod(paymentMethod)
                .setTransactionId(transactionId)
                .setAmount(amount)
                .setTime(time)
                .build();


    }

}
