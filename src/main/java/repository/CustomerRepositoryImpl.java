package repository;

import fr.efrei.cinemabookingproject1.domain.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

public class CustomerRepositoryImpl implements CustomerRepository {

    private final Map<String, Customer> customerDB = new HashMap<>();

    @Override
    public Customer create(Customer customer) {
        customerDB.put(customer.getEmail(), customer);
        return customer;
    }

    @Override
    public Optional<Customer> read(String email) {
        return Optional.ofNullable(customerDB.get(email));
    }

    @Override
    public Customer update(Customer customer) {
        if (customerDB.containsKey(customer.getEmail())) {
            customerDB.put(customer.getEmail(), customer);
            return customer;
        }
        throw new NoSuchElementException("Customer not found.");
    }

    @Override
    public boolean delete(String email) {
        return customerDB.remove(email) != null;
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerDB.values());
    }
}