package repository;

import fr.efrei.cinemabookingproject1.domain.Customer;
import fr.efrei.cinemabookingproject1.factory.CustomerFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryTest {

    private CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        // Initialize the repository before each test
        customerRepository = new CustomerRepositoryImpl();
    }

    @Test
    void testCreateCustomer() {

        Customer customer = CustomerFactory.createCustomer(
                "John Doe",
                "johndoe@gmail.com",
                "0787593081",
                50);

        Customer savedCustomer = customerRepository.create(customer);


        assertNotNull(savedCustomer, "Saved customer should not be null");
        assertEquals(customer.getEmail(), savedCustomer.getEmail(), "Emails should match");
    }

    @Test
    void testReadCustomer() {

        Customer customer = CustomerFactory.createCustomer(
                "Jane Marry", "janemarry@gmail.com", "0798758494", 20);
        customerRepository.create(customer);


        Optional<Customer> retrievedCustomer = customerRepository.read("janemarry@gmail.com");


        assertTrue(retrievedCustomer.isPresent(), "Retrieved customer should be present");
        assertEquals("Jane Marry", retrievedCustomer.get().getName(), "Customer names should match");
    }

    @Test
    void testUpdateCustomer() {

        Customer customer = CustomerFactory.createCustomer(
                "Mike Smith", "mike@example.com", "0687593871", 30);
        customerRepository.create(customer);

        Customer updatedCustomer = CustomerFactory.createCustomer(
                "Michael Smith", "mike@example.com", "0687593871", 40);


        Customer result = customerRepository.update(updatedCustomer);


        assertNotNull(result, "Updated customer should not be null");
        assertEquals("Michael Smith", result.getName(), "Updated customer name should match new details");
        assertEquals(40, result.getLoyaltyPoints(), "Loyalty points should be updated");
    }

    @Test
    void testDeleteCustomer() {

        Customer customer = CustomerFactory.createCustomer(
                "Alice Johnson", "alice@example.com", "0829447875", 10);
        customerRepository.create(customer);


        boolean deleted = customerRepository.delete("alice@example.com");


        assertTrue(deleted, "Customer should be successfully deleted");
        assertFalse(customerRepository.read("alice@example.com").isPresent(),
                "Deleted customer should no longer exist");
    }

    @Test
    void testFindAllCustomers() {

        customerRepository.create(CustomerFactory.createCustomer(
                "Tom", "tom@example.com", "0605857978", 15));
        customerRepository.create(CustomerFactory.createCustomer(
                "Jerry", "jerry@example.com", "0618759308", 25));


        List<Customer> customers = customerRepository.findAll();
        assertNotNull(customers, "Customer list should not be null");
        assertEquals(2, customers.size(), "Customer count should match the number of entries");
    }
}