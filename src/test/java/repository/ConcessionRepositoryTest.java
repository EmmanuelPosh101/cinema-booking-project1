package repository;

import fr.efrei.cinemabookingproject1.domain.Concession;
import fr.efrei.cinemabookingproject1.repository.impl.ConcessionImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//222134763
public class ConcessionRepositoryTest {
    @Test
    public void testAddAndRetrieveConcession() {
        // Arrange
        ConcessionRepository concessionRepository = new ConcessionImplementation();
        Concession concession = new Concession.Builder()
                .setItemName("Soda")
                .setPrice(3.00)
                .setAvailableQuantity(50)
                .build();

        // Act
        concessionRepository.addConcession(concession);
        Concession retrievedConcession = concessionRepository.getAllConcessions().get(0);

        // Assert
        assertEquals(concession.getItemName(), retrievedConcession.getItemName());
        assertEquals(concession.getPrice(), retrievedConcession.getPrice());
        assertEquals(concession.getAvailableQuantity(), retrievedConcession.getAvailableQuantity());
    }
}
