package repository;




import fr.efrei.cinemabookingproject1.domain.Promotion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PromotionRepositoryTest {

    private PromotionRepository promotionRepository;

    @BeforeEach
    void setUp() {
        promotionRepository = new PromotionRepositoryImpl();
    }

    @Test
    void testCreatePromotion() {
        // Arrange
        Promotion promotion = new Promotion.Builder()
                .setDiscountCode("DISCOUNT10")
                .setDescription("10% off on all tickets")
                .setValidity(LocalDate.of(2025, 5, 1))
                .build();


        Promotion savedPromotion = promotionRepository.create(promotion);


        assertNotNull(savedPromotion, "Saved promotion should not be null");
        assertEquals(promotion, savedPromotion, "Saved promotion should match the input details");
    }

    @Test
    void testReadPromotion() {

        Promotion promotion = new Promotion.Builder()
                .setDiscountCode("DISCOUNT20")
                .setDescription("20% off on all tickets")
                .setValidity(LocalDate.of(2025, 6, 1))
                .build();
        promotionRepository.create(promotion);


        Optional<Promotion> retrievedPromotion = promotionRepository.read("DISCOUNT20");


        assertTrue(retrievedPromotion.isPresent(), "Retrieved promotion should be present");
        assertEquals("DISCOUNT20", retrievedPromotion.get().getDiscountCode(), "Promotion discount codes should match");
    }

    @Test
    void testUpdatePromotion() {

        Promotion promotion = new Promotion.Builder()
                .setDiscountCode("DISCOUNT30")
                .setDescription("30% off on all tickets")
                .setValidity(LocalDate.of(2025, 7, 1))
                .build();
        promotionRepository.create(promotion);
        Promotion updatedPromotion = new Promotion.Builder()
                .setDiscountCode("DISCOUNT30")
                .setDescription("Updated 30% off on all tickets")
                .setValidity(LocalDate.of(2025, 8, 1))
                .build();


        Promotion result = promotionRepository.update(updatedPromotion);


        assertNotNull(result, "Updated promotion should not be null");
        assertEquals("Updated 30% off on all tickets", result.getDescription(), "Updated promotion description should match new details");
    }

    @Test
    void testDeletePromotion() {
        // Arrange
        Promotion promotion = new Promotion.Builder()
                .setDiscountCode("DISCOUNT50")
                .setDescription("50% off on all tickets")
                .setValidity(LocalDate.of(2025, 9, 1))
                .build();
        promotionRepository.create(promotion);


        boolean deleted = promotionRepository.delete("DISCOUNT50");


        assertTrue(deleted, "Promotion should be successfully deleted");
        assertFalse(promotionRepository.read("DISCOUNT50").isPresent(), "Deleted promotion should no longer exist");
    }

    @Test
    void testFindAllPromotions() {

        promotionRepository.create(new Promotion.Builder()
                .setDiscountCode("DISCOUNT5")
                .setDescription("5% off on all tickets")
                .setValidity(LocalDate.of(2025, 10, 1))
                .build());
        promotionRepository.create(new Promotion.Builder()
                .setDiscountCode("DISCOUNT15")
                .setDescription("15% off on all tickets")
                .setValidity(LocalDate.of(2025, 11, 1))
                .build());


        List<Promotion> promotions = promotionRepository.findAll();


        assertNotNull(promotions, "Promotion list should not be null");
        assertEquals(2, promotions.size(), "Promotion count should match the number of entries");
    }
}