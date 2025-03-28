package fr.efrei.cinemabookingproject1.domain;
//222750014Sesona Panca
import java.time.LocalDate;

public class Showtime {
    private final  String Movie ;
    private final   String Screen ;
    private final LocalDate Date ;
    private final  String Language; //Subtitles
    private final  String Format;//2D or 3D

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

    private Showtime(ShowtimeBuilder builder){
        this.Movie = builder.Movie;
        this.Screen = builder.Screen;
        this.Date  =  builder.Date ;
        this.Language= builder.Language;
        this.Format= builder.Format;
    }



    @Override
    public String toString() {
        return "Showtime{" +
                "Movie='" + Movie + '\'' +
                ", Screen='" + Screen + '\'' +
                ", Date='" + Date + '\'' +
                ", Language=" + Language +
                ", Format=" + Format +
                '}';
    }
    public static class ShowtimeBuilder {
        private String Movie;
        private String Screen;
        private LocalDate Date;
        private String Language; //Subtitles
        private String Format;//2D or 3D

        public ShowtimeBuilder setMovie(String movie) {
            Movie = movie;
            return this;
        }

        public ShowtimeBuilder setScreen(String screen) {
            Screen = screen;
            return this;
        }

        public ShowtimeBuilder setDate(LocalDate date) {
            Date = date;
            return this;
        }

        public ShowtimeBuilder setFormat(String format) {
            Format = format;
            return this;
        }

        public ShowtimeBuilder setLanguage(String language) {
            Language = language;
            return this;
        }



        public Showtime build (){
            return new Showtime(this);
        }
    }

}
