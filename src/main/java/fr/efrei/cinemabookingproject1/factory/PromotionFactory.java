package fr.efrei.cinemabookingproject1.factory;
/*  
Author: Emmanuel Posholi Posholi (222144408) 
Date: 28 March 2025 
*/

import fr.efrei.cinemabookingproject1.domain.Promotion;

import java.time.LocalDate;

public class PromotionFactory {
    public static Promotion createPromotion(String discountCode, String description, LocalDate validity) {
        if (discountCode == null || discountCode.isEmpty()) {
            throw new IllegalArgumentException("Discount code cannot be null or empty");
        }
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        if (validity == null || validity.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Validity date must be in the future");
        }

        return new Promotion.Builder()
                .setDiscountCode(discountCode)
                .setDescription(description)
                .setValidity(validity)
                .build();
    }
}

