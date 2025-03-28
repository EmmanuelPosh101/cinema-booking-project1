package repository;

import fr.efrei.cinemabookingproject1.domain.Concession;
//222134763
import java.util.List;
public interface ConcessionRepository {
    void addConcession(Concession concession);
    List<Concession> getAllConcessions();

}
