package fr.efrei.cinemabookingproject1.factory;

/*  
Author: Emmanuel Posholi Posholi (222144408) 
Date: 28 March 2025 
*/

import fr.efrei.cinemabookingproject1.domain.Promotion;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.*;

public class PromotionFactoryTest {

    @Test
    void testCreateValidPromotion() {
        Promotion promo = PromotionFactory.createPromotion(
                "SUMMER25", "25% off during summer", LocalDate.of(2025, 6, 30)
        );

        assertNotNull(promo);
        assertEquals("SUMMER25", promo.getDiscountCode());
        assertEquals("25% off during summer", promo.getDescription());
        assertEquals(LocalDate.of(2025, 6, 30), promo.getValidity());
    }

    @Test
    void testCreatePromotionWithNullDiscountCode() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PromotionFactory.createPromotion(null, "Special Discount", LocalDate.of(2025, 6, 30))
        );
        assertEquals("Discount code cannot be null or empty", exception.getMessage());
    }

    @Test
    void testCreatePromotionWithEmptyDiscountCode() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PromotionFactory.createPromotion("", "Special Discount", LocalDate.of(2025, 6, 30))
        );
        assertEquals("Discount code cannot be null or empty", exception.getMessage());
    }

    @Test
    void testCreatePromotionWithNullDescription() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PromotionFactory.createPromotion("SPRING20", null, LocalDate.of(2025, 6, 30))
        );
        assertEquals("Description cannot be null or empty", exception.getMessage());
    }

    @Test
    void testCreatePromotionWithEmptyDescription() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PromotionFactory.createPromotion("SPRING20", "", LocalDate.of(2025, 6, 30))
        );
        assertEquals("Description cannot be null or empty", exception.getMessage());
    }

    @Test
    void testCreatePromotionWithNullValidity() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PromotionFactory.createPromotion("AUTUMN15", "Autumn Sales", null)
        );
        assertEquals("Validity date must be in the future", exception.getMessage());
    }

    @Test
    void testCreatePromotionWithPastValidity() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PromotionFactory.createPromotion("WINTER10", "Winter Sale", LocalDate.of(2024, 1, 1))
        );
        assertEquals("Validity date must be in the future", exception.getMessage());
    }
}
