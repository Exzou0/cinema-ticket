import java.util.Objects;

public class Movie {
    public Movie(String movieName, String genre, int duration, int age) {
        this.movieName = movieName;
        this.genre = genre;
        this.duration = duration;
        this.age = age;
    }



    private String movieName;
    private String genre;
    private int duration;
    private int age;


    public String getTitle() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Movie: " + movieName + ", Genre: " + genre + ", Duration: " + duration + " mins, Age Restriction: " + age + "+";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return duration == movie.duration &&
                age == movie.age &&
                Objects.equals(movieName, movie.movieName) &&
                Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, genre, duration, age);
    }
}
