package fr.efrei.cinemabookingproject1.factory;
//222750014Sesona Panca
import fr.efrei.cinemabookingproject1.domain.Showtime;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ShowtimeFactoryTest {

    @Test
    void testCreateShowtimeValid() {
        LocalDate date = LocalDate.of(2025, 3, 26);
        Showtime showtime = ShowtimeFactory.CreateShowtime(
                "Inception",
                "Screen 1",
                date,
                "2D",
                "English"
        );

        assertNotNull(showtime);
        assertEquals("Inception", showtime.getMovie());
        assertEquals("Screen 1", showtime.getScreen());
        assertEquals(date, showtime.getDate());
        assertEquals("2D", showtime.getFormat());
        assertEquals("English", showtime.getLanguage());
    }

    @Test
    void testCreateShowtimeInvalidMovie() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                ShowtimeFactory.CreateShowtime(
                        "",
                        "Screen 1",
                        LocalDate.of(2025, 3, 26),
                        "2D",
                        "English"
                ));

        assertEquals("Movie cannot be null or empty", exception.getMessage());
    }

    @Test
    void testCreateShowtimeInvalidScreen() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                ShowtimeFactory.CreateShowtime(
                        "Inception",
                        "",
                        LocalDate.of(2025, 3, 26),
                        "2D",
                        "English"
                ));

        assertEquals("Screen cannot be null or empty", exception.getMessage());
    }

    @Test
    void testCreateShowtimeInvalidDate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                ShowtimeFactory.CreateShowtime(
                        "Inception",
                        "Screen 1",
                        null,
                        "2D",
                        "English"
                ));

        assertEquals("Date cannot be null", exception.getMessage());
    }

    @Test
    void testCreateShowtimeInvalidFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                ShowtimeFactory.CreateShowtime(
                        "Inception",
                        "Screen 1",
                        LocalDate.of(2025, 3, 26),
                        "",
                        "English"
                ));

        assertEquals("Format cannot be null or empty", exception.getMessage());
    }

    @Test
    void testCreateShowtimeInvalidLanguage() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                ShowtimeFactory.CreateShowtime(
                        "Inception",
                        "Screen 1",
                        LocalDate.of(2025, 3, 26),
                        "2D",
                        ""
                ));

        assertEquals("Language cannot be null or empty", exception.getMessage());
    }
}