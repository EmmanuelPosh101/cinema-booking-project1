package fr.efrei.cinemabookingproject1.factory;

import fr.efrei.cinemabookingproject1.domain.Customer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    @Test
    void createCustomer_shouldReturnValidCustomer() {

        String name = "John Doe";
        String email = "johndoe@gmail.com.com";
        String phone = "0787593081";
        int loyaltyPoints = 50;


        Customer customer = CustomerFactory.createCustomer(name, email, phone, loyaltyPoints);


        assertNotNull(customer, "Customer creation failed, customer is null");
        assertEquals(name, customer.getName(), "Name doesn't match the input");
        assertEquals(email, customer.getEmail(), "Email doesn't match the input");
        assertEquals(phone, customer.getPhone(), "Phone doesn't match the input");
        assertEquals(loyaltyPoints, customer.getLoyaltyPoints(), "Loyalty points didn't match the input");
    }

    @Test
    void createCustomer_withoutLoyaltyPoints_shouldSetToZero() {

        String name = "Jane Marry";
        String email = "janemarry@gmail.com.com";
        String phone = "0798758494";


        Customer customer = CustomerFactory.createCustomer(name, email, phone, null);

        assertNotNull(customer, "Customer creation failed, customer is null");
        assertEquals(0, customer.getLoyaltyPoints(), "Loyalty points should default to 0 when not specified");
    }

    @Test
    void createCustomer_withEmptyStrings_shouldCreateValidCustomer() {
        Customer customer = CustomerFactory.createCustomer("", "", "", null);

        assertNotNull(customer, "Customer creation failed, customer is null");
        assertEquals("", customer.getName(), "Name should default to an empty string");
        assertEquals("", customer.getEmail(), "Email should default to an empty string");
        assertEquals("", customer.getPhone(), "Phone should default to an empty string");
        assertEquals(0, customer.getLoyaltyPoints(), "Loyalty points should default to zero in this case");
    }
}
