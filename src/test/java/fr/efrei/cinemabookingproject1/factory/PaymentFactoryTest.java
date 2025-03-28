package fr.efrei.cinemabookingproject1.factory;
//222750014Sesona Panca

import fr.efrei.cinemabookingproject1.domain.Payment;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    @Test
    void createPayment_validInput_shouldCreatePayment() {
        // Arrange
        String paymentMethod = "Credit Card";
        int transactionId = 12345;
        double amount = 500.00;
        LocalTime time = LocalTime.now();

        // Act
        Payment payment = PaymentFactory.createPayment(paymentMethod, transactionId, amount, time);

        // Assert
        assertNotNull(payment);
        assertEquals(paymentMethod, payment.getPaymentMethod());
        assertEquals(transactionId, payment.getTransactionId());
        assertEquals(amount, payment.getAmount());
        assertEquals(time, payment.getTime());
    }

    @Test
    void createPayment_nullPaymentMethod_shouldThrowException() {
        // Arrange
        String paymentMethod = null;
        int transactionId = 12345;
        double amount = 500.00;
        LocalTime time = LocalTime.now();

        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PaymentFactory.createPayment(paymentMethod, transactionId, amount, time));
        assertEquals("paymentMethod cannot be null or empty", exception.getMessage());
    }

    @Test
    void createPayment_invalidTransactionId_shouldThrowException() {
        // Arrange
        String paymentMethod = "Debit Card";
        int transactionId = 0; // Invalid Transaction ID
        double amount = 500.00;
        LocalTime time = LocalTime.now();

        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PaymentFactory.createPayment(paymentMethod, transactionId, amount, time));
        assertEquals("Transaction ID must be greater than 0", exception.getMessage());
    }

    @Test
    void createPayment_invalidAmount_shouldThrowException() {
        // Arrange
        String paymentMethod = "Digital Wallet";
        int transactionId = 12345;
        double amount = -50.00; // Invalid Amount
        LocalTime time = LocalTime.now();

        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PaymentFactory.createPayment(paymentMethod, transactionId, amount, time));
        assertEquals("Amount must be greater than 0", exception.getMessage());
    }

    @Test
    void createPayment_nullTime_shouldThrowException() {
        // Arrange
        String paymentMethod = "Credit Card";
        int transactionId = 12345;
        double amount = 500.00;
        LocalTime time = null; // Invalid Time

        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PaymentFactory.createPayment(paymentMethod, transactionId, amount, time));
        assertEquals("Time must be provided", exception.getMessage());
    }
}
