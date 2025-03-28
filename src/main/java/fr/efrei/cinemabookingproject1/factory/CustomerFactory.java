package fr.efrei.cinemabookingproject1.factory;
/*  
Author: Emmanuel Posholi Posholi (222144408) 
Date: 28 March 2025 
*/
import fr.efrei.cinemabookingproject1.domain.Customer;

public class CustomerFactory {
    public static Customer createCustomer(String name, String email, String phone, Integer loyaltyPoints) {
        if (loyaltyPoints == null) {
            loyaltyPoints = 0;
        }
        return new Customer.Builder()
                .setName(name)
                .setEmail(email)
                .setPhone(phone)
                .setLoyaltyPoints(loyaltyPoints)
                .build();
    }
}
