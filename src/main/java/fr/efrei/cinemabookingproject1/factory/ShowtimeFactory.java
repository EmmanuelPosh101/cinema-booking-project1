package fr.efrei.cinemabookingproject1.factory;
//222750014Sesona Panca
import fr.efrei.cinemabookingproject1.domain.Showtime;

import java.time.LocalDate;

public class ShowtimeFactory {
    public static Showtime CreateShowtime(String movie, String screen, LocalDate date, String format, String language){
        if (movie == null || movie.isEmpty()) {
            throw new IllegalArgumentException("Movie cannot be null or empty");
        }
        if (screen == null || screen.isEmpty()) {
            throw new IllegalArgumentException("Screen cannot be null or empty");
        }
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }

        if (format == null || format.isEmpty()) {
            throw new IllegalArgumentException("Format cannot be null or empty");
        }
        if (language == null || language.isEmpty()) {
            throw new IllegalArgumentException("Language cannot be null or empty");
        }


return new Showtime.Builder()
        .setMovie(movie)
        .setScreen(screen)
        .setDate(date)
        .setFormat(format)
        .setLanguage(language)
        .build();
    }
}
