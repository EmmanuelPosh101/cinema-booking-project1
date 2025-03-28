package repository;

import fr.efrei.cinemabookingproject1.domain.Concession;
import fr.efrei.cinemabookingproject1.repository.ConcessionRepository;

import java.util.ArrayList;
import java.util.List;
//222134763
public class ConcessionRepositoryImpl implements ConcessionRepository {
    private final List<Concession> concessions = new ArrayList<>();

    @Override
    public void addConcession(Concession concession) {
        concessions.add(concession);
    }

    @Override
    public List<Concession> getAllConcessions() {
        return new ArrayList<>(concessions);
    }
}
