package repository;

/*
Author: Emmanuel Posholi Posholi (222144408)
Date: 28 March 2025
*/

import fr.efrei.cinemabookingproject1.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {


    Customer create(Customer customer);


    Optional<Customer> read(String email);


    Customer update(Customer customer);


    boolean delete(String email);


    List<Customer> findAll();
}