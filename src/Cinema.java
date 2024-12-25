import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private List<Movie> movies;

    public Cinema(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
    }
    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }
    public void showMovies() {
        System.out.println("Movies available at " + name + ":");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
    public void bookTicket(Viewer viewer, int movieIndex) {
        Movie movie = movies.get(movieIndex - 1);
        System.out.println(viewer.getName() + " successfully booked a ticket for " + movie.getTitle());
    }

}
