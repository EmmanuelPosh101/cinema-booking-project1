package repository;
//222750014

import fr.efrei.cinemabookingproject1.domain.Showtime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShowtimeRepository implements IShowtime {
    private final List<Showtime> showtimeList;


    public ShowtimeRepository() {
        this.showtimeList = new ArrayList<>();
    }

    @Override
    public Showtime create(Showtime showtime) {
        if (showtime != null && !showtimeList.contains(showtime)) {
            showtimeList.add(showtime); // Add the showtime to the list
            return showtime;
        }
        return null; // Return null if the showtime is invalid or already exists
    }

    @Override
    public Optional<Showtime> read(String movie) {
        for (Showtime showtime : showtimeList) {
            if (showtime.getMovie().equalsIgnoreCase(movie)) {
                return Optional.of(showtime);
            }
        }
        return Optional.empty(); // Return empty Optional if no match is found
    }

    @Override
    public Showtime update(Showtime updatedShowtime) {
        for (int i = 0; i < showtimeList.size(); i++) {
            Showtime existingShowtime = showtimeList.get(i);
            if (existingShowtime.getMovie().equalsIgnoreCase(updatedShowtime.getMovie())) {
                showtimeList.set(i, updatedShowtime);
                return updatedShowtime;
            }
        }
        return null; // Return null if no matching showtime was found
    }

    @Override
    public boolean delete(String movie) {
        Showtime showtimeToDelete = null;
        for (Showtime showtime : showtimeList) {
            if (showtime.getMovie().equalsIgnoreCase(movie)) {
                showtimeToDelete = showtime;
                break;
            }
        }
        if (showtimeToDelete != null) {
            showtimeList.remove(showtimeToDelete);
            return true; // Return true to indicate successful deletion
        }
        return false;
    }

    @Override
    public List<Showtime> findAll() {
        return new ArrayList<>(showtimeList); // Return a copy of the list of showtimes
    }
}