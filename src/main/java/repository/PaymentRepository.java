package repository;

import fr.efrei.cinemabookingproject1.domain.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PaymentRepository implements IPayment {
    private final List<Payment> paymentList;

    // Constructor initializes an empty list of payments
    public PaymentRepository() {
        this.paymentList = new ArrayList<>();
    }

    @Override
    public Payment create(Payment payment) {
        if (payment != null && !paymentList.contains(payment)) {
            paymentList.add(payment); // Add the payment to the list
            return payment;
        }
        return null; // Return null if payment is invalid or already exists
    }

    @Override
    public Optional<Payment> read(int transactionID) {
        for (Payment payment : paymentList) {
            if (payment.getTransactionID() == transactionID) { // Compare transaction ID
                return Optional.of(payment); // Wrap the matching payment in an Optional
            }
        }
        return Optional.empty(); // Return empty Optional if no match is found
    }

    @Override
    public Payment update(Payment updatedPayment) {
        for (int i = 0; i < paymentList.size(); i++) {
            Payment existingPayment = paymentList.get(i);
            if (existingPayment.getTransactionID() == updatedPayment.getTransactionID()) {
                paymentList.set(i, updatedPayment); // Update the payment in the list
                return updatedPayment; // Return the updated payment
            }
        }
        return null; // Return null if no match is found
    }

    @Override
    public boolean delete(int transactionID) {
        Payment paymentToDelete = null;
        for (Payment payment : paymentList) {
            if (payment.getTransactionID() == transactionID) {
                paymentToDelete = payment;
                break;
            }
        }
        if (paymentToDelete != null) {
            paymentList.remove(paymentToDelete); // Remove the payment from the list
            return true; // Return true to indicate successful deletion
        }
        return false; // Return false if no match is found
    }

    @Override
    public List<Payment> findAll() {
        return new ArrayList<>(paymentList); // Return a copy of the payment list
    }
}