package fr.efrei.cinemabookingproject1.factory;

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