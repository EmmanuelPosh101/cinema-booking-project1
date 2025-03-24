/*
Movie.java
Factory for Movie
Author: Vuyolwethu Ramncwana (220618534)
Date: 17 March 2025
 */

package fr.efrei.cinemabookingproject1.factory;

import fr.efrei.cinemabookingproject1.domain.Movie;

public class MovieFactory {
    public Movie createMovie(String title, String genre, String duration, String language, String description, String releaseDate) {

        return new Movie.Builder()
                .setTitle(title)
                .setGenre(genre)
                .setDuration(duration)
                .setLanguage(language)
                .setDescription(description)
                .setReleaseDate(releaseDate)
                .build();
    }
}