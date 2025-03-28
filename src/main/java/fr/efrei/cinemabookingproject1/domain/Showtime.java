package fr.efrei.cinemabookingproject1.domain;
//222750014 Sesona Panca
import java.time.LocalDate;

public class Showtime {
    private String Movie;
    private String Screen;
    private LocalDate Date;
    private String Language;
    private String Format; // 2D, 3D, etc.

    private Showtime(Showtime.Builder builder) {
        this.Movie = builder.Movie;
        this.Screen = builder.Screen;
        this.Date = builder.Date;
        this.Format = builder.Format;
        this.Language = builder.Language;
    }

    public String getMovie() {
        return Movie;
    }

    public String getScreen() {
        return Screen;
    }

    public LocalDate getDate() {
        return Date;
    }

    public String getLanguage() {
        return Language;
    }

    public String getFormat() {
        return Format;
    }

    public static class Builder {
        private String Movie;
        private String Screen;
        private LocalDate Date;
        private String Language;
        private String Format;

        public Builder setMovie(String movie) {
            Movie = movie;
            return this;
        }

        public Builder setScreen(String screen) {
            Screen = screen;
            return this;
        }

        public Builder setDate(LocalDate date) {
            Date = date;
            return this;
        }

        public Builder setLanguage(String language) {
            Language = language;
            return this;
        }

        public Builder setFormat(String format) {
            Format = format;
            return this;
        }

        public Showtime build() {
            return new Showtime(this);
        }
    }
}