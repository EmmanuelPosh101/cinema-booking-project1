package repository;
//2222750014 Sesona Panca
import fr.efrei.cinemabookingproject1.domain.Showtime;
import java.util.List;
import java.util.Optional;

public interface IShowtime {


    Showtime create(Showtime showtime);


    Optional<Showtime> read(String movie);


    Showtime update(Showtime showtime);


    boolean delete(String movie);


    List<Showtime> findAll();
}