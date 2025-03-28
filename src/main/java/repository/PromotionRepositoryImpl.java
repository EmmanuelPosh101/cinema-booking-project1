package repository;

import fr.efrei.cinemabookingproject1.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PromotionRepositoryImpl implements PromotionRepository {

    private final List<Promotion> promotions = new ArrayList<>();

    @Override
    public Promotion create(Promotion promotion) {
        promotions.add(promotion);
        return promotion;
    }

    @Override
    public Optional<Promotion> read(String discountCode) {
        return promotions.stream()
                .filter(p -> p.getDiscountCode().equals(discountCode))
                .findFirst();
    }

    @Override
    public Promotion update(Promotion promotion) {
        delete(promotion.getDiscountCode());
        create(promotion);
        return promotion;
    }

    @Override
    public boolean delete(String discountCode) {
        Optional<Promotion> promotion = read(discountCode);
        return promotion.map(promotions::remove).orElse(false);
    }

    @Override
    public List<Promotion> findAll() {
        return new ArrayList<>(promotions);
    }
}
