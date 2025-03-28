package repository;

import fr.efrei.cinemabookingproject1.domain.Payment;

import java.util.List;
import java.util.Optional;

public interface IPayment {

    Payment create(Payment payment);

    Optional<Payment> read(int TransactionID);

    Payment update(Payment payment);

    boolean delete(int TransactionID);

    List<Payment> findAll();
}
