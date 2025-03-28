package fr.efrei.cinemabookingproject1.factory;

import fr.efrei.cinemabookingproject1.domain.Concession;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class ConcessionFactoryTest {

        @Test //Author: sinokhanyontantiso
        public void testCreateConcession() {
            // Now we are Arranging
            String itemName = "Popcorn";
            double price = 5.50;
            int availableQuantity = 100;

            //  Now we Act
            Concession concession = ConcessionFactory.createConcession(itemName, price, availableQuantity);

            // We areAsserting
            assertEquals(itemName, concession.getItemName());
            assertEquals(price, concession.getPrice());
            assertEquals(availableQuantity, concession.getAvailableQuantity());
        }
    }

