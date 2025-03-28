package repository;

import fr.efrei.cinemabookingproject1.domain.Movie;

import java.util.Set;

public interface IMovieRepository extends IRepository{
    public Set<Movie> getAllMovies();

    Movie read(String description);

    Movie read(Movie ID);

    Movie update(Movie movie);

    boolean delete(String releaseDate);
}


