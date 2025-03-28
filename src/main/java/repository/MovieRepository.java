package repository;

import fr.efrei.cinemabookingproject1.domain.Movie;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class MovieRepository implements IMovieRepository{
    private static IMovieRepository repository = null;
    private Set<Movie> movieDB;

    private MovieRepository(){
        movieDB = new HashSet<Movie>();
    }

    public static IMovieRepository getRepository(){
        if(repository == null){
            repository = new MovieRepository();
        }
        return repository;
    }

    @Override
    public Set<Movie> getAllMovies() {
        return Set.of();
    }

    @Override
    public Movie read(Movie ID) {
        return null;
    }

    @Override
    public Movie read(String description) {
        for (Movie movie : movieDB) {
            if (movie.getDescription().equals(description)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public Object create(Object entity) {
        return null;
    }

    @Override
    public Movie update(Movie movie) {
        Movie oldMovie = read(movie.getDescription());
        if (oldMovie != null) {
            movieDB.remove(oldMovie);
            movieDB.add(movie);
            return movie;
        }
        return null;
    }

    @Override
    public boolean delete(String releaseDate) {
        Movie movieToDelete = read(releaseDate);
        if (movieToDelete != null) {
            movieDB.remove(movieToDelete);
            return true;

        }
        return false;
    }

    @Override
    public Optional read(Object o) {
        return Optional.empty();
    }

    @Override
    public Object update(Object entity) {
        return null;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public List findAll() {
        return List.of();
    }


}

