import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + ". " + movies.get(i));
        }
    }

    public List<Movie> filterbygenre(String genre) {
        return movies.stream()
                .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public Movie searchbytitle(String title) {
        return movies.stream()
                .filter(movie -> movie.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    public void sortduration() {
        movies.sort((movie1, movie2) -> Integer.compare(movie1.getDuration(), movie2.getDuration()));
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void bookTicket(Viewer viewer, int movieIndex) {
        if (movieIndex < 1 || movieIndex > movies.size()) {
            System.out.println("Invalid movie selection.");
            return;
        }

        Movie movie = movies.get(movieIndex - 1);

        if (viewer.getAge() < movie.getAge()) {
            System.out.println("Sorry, you are not old enough to watch " + movie.getTitle());
        } else {
            System.out.println(viewer.getName() + " successfully booked a ticket for " + movie.getTitle());
        }
    }
}
