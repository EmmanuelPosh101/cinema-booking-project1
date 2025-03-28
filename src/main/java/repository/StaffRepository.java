package repository;

import fr.efrei.cinemabookingproject1.domain.Concession;

import java.util.List;
//222134763
public interface StaffRepository {
    void addConcession(Concession concession);
    List<Concession> getAllConcessions();
}
