package fr.efrei.cinemabookingproject1.factory;

import fr.efrei.cinemabookingproject1.domain.Concession;

public class ConcessionFactory {
    public static Concession createConcession(String itemName, double price, int availableQuantity) {
        return new Concession.Builder()
                .setItemName(itemName)
                .setPrice(price)
                .setAvailableQuantity(availableQuantity)
                .build();
    }
}
