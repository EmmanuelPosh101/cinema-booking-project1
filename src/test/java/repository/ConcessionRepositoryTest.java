package repository;

import fr.efrei.cinemabookingproject1.domain.Concession;
import fr.efrei.cinemabookingproject1.repository.impl.ConcessionImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ConcessionRepositoryTest {
    @Test
    public void testAddAndRetrieveConcession() {
        // Arrange
        ConcessionRepository concessionRepository = new ConcessionImplementation();
        Concession concession = new Concession.Builder()
                .setItemName("Popcorn")
                .setPrice(5.50)
                .setAvailableQuantity(100)
                .build();

        // Act
        concessionRepository.addConcession(concession);
        Concession retrievedConcession = concessionRepository.getAllConcessions().get(0);

        // Assert
        assertEquals(concession.getItemName(), retrievedConcession.getItemName());
        assertEquals(concession.getPrice(), retrievedConcession.getPrice());
        assertEquals(concession.getAvailableQuantity(), retrievedConcession.getAvailableQuantity());
    }

    @Test
    public void testFindConcessionByName() {
        // Arrange
        ConcessionRepository concessionRepository = new ConcessionImplementation();
        Concession concession = new Concession.Builder()
                .setItemName("Nachos")
                .setPrice(4.00)
                .setAvailableQuantity(50)
                .build();
        concessionRepository.addConcession(concession);

        // Act
        Concession foundConcession = concessionRepository.findConcessionByName("Nachos");

        // Assert
        assertEquals(concession.getItemName(), foundConcession.getItemName());
    }
}
