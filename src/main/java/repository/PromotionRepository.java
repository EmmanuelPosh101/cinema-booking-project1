package repository;

import fr.efrei.cinemabookingproject1.domain.Promotion;

import java.util.List;
import java.util.Optional;

public interface PromotionRepository {

    Promotion create(Promotion promotion);

    Optional<Promotion> read(String discountCode);

    Promotion update(Promotion promotion);

    boolean delete(String discountCode);

    List<Promotion> findAll();
}