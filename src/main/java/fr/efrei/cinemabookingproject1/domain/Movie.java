/*
Movie.java
Entity for Movie
Author: Vuyolwethu Ramncwana (220618534)
Date: 14 March 2025
 */

package fr.efrei.cinemabookingproject1.domain;

public class Movie {
    private String title;
    private String genre;
    private String duration;
    private String language;
    private String description;
    private String releaseDate;

    public Movie() {
    }

    private Movie(Builder builder) {
        this.title = builder.title;
        this.genre = builder.genre;
        this.duration = builder.duration;
        this.language = builder.language;
        this.description = builder.description;
        this.releaseDate = builder.releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDuration() {
        return duration;
    }

    public String getLanguage() {
        return language;
    }

    public String getDescription() {
        return description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", duration='" + duration + '\'' +
                ", language='" + language + '\'' +
                ", description='" + description + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }


    public static class Builder {
        //3.VARIABLES
        private String title;
        private String genre;
        private String duration;
        private String language;
        private String description;
        private String releaseDate;


        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = duration;
            return this;
        }

        public Builder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Movie build() {return new Movie(this);}

    }
}
