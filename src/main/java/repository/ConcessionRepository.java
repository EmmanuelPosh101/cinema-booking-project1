package repository;

import fr.efrei.cinemabookingproject1.domain.Concession;

import java.util.List;
// 222134763 sinokhanyo ntantiso

public interface ConcessionRepository {
    void addConcession(Concession concession);
    List<Concession> getAllConcessions();
}