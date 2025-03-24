package fr.efrei;

import fr.efrei.cinemabookingproject1.domain.Promotion;
import fr.efrei.cinemabookingproject1.factory.PromotionFactory;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        try {
            Promotion promo = PromotionFactory.createPromotion(
                    "SUMMER25", "25% off during summer", LocalDate.of(2025, 6, 30)
            );
            System.out.println("Promotion created successfully: " + promo);
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating promotion: " + e.getMessage());
        }


        try {
            Promotion invalidPromo = PromotionFactory.createPromotion(
                    "", "Special Discount", LocalDate.of(2025, 6, 30)
            );
            System.out.println("Promotion created successfully: " + invalidPromo);
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating promotion: " + e.getMessage());
        }


        try {
            Promotion pastPromo = PromotionFactory.createPromotion(
                    "WINTER10", "Winter Sale", LocalDate.of(2024, 1, 1)
            );
            System.out.println("Promotion created successfully: " + pastPromo);
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating promotion: " + e.getMessage());

            System.out.println("Movie built successfully using builder pattern");
            System.out.println("Seat built successfully using builder pattern");
        }
    }

}
