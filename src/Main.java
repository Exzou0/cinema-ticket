import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Chaplin MEGA Silk Way");

        Movie mov1 = new Movie("Interstellar", "Sci-Fi", 148, 16);
        Movie mov2 = new Movie("Sonic 3", "Sci-Fi", 121, 13);
        Movie mov3 = new Movie("Deadpool 3", "Sci-Fi Fiction", 112, 18);
        Movie vipMov = new VIPMovie("Avengers: Endgame", "Action", 180, 12, true);

        cinema.addMovie(mov1);
        cinema.addMovie(mov2);
        cinema.addMovie(mov3);
        cinema.addMovie(vipMov);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String viewerName = scanner.nextLine();
        System.out.println("Enter your age: ");
        int viewerAge = scanner.nextInt();
        Viewer viewer = new Viewer(viewerName, viewerAge);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Show all movies");
            System.out.println("2. Filter movies by genre");
            System.out.println("3. Search movie by title");
            System.out.println("4. Sort movies by duration");
            System.out.println("5. Count VIP seats");
            System.out.println("6. Book a ticket");
            System.out.println("7. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    cinema.showMovies();
                    break;
                case 2:
                    System.out.println("Enter genre to filter by: ");
                    String genre = scanner.nextLine();
                    List<Movie> filteredMovies = cinema.filterbygenre(genre);
                    if (filteredMovies.isEmpty()) {
                        System.out.println("No movies found for genre: " + genre);
                    } else {
                        for (Movie movie : filteredMovies) {
                            System.out.println(movie);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter movie title to search: ");
                    String title = scanner.nextLine();
                    Movie searchedMovie = cinema.searchbytitle(title);
                    if (searchedMovie == null) {
                        System.out.println("Movie not found: " + title);
                    } else {
                        System.out.println("Found movie: " + searchedMovie);
                    }
                    break;
                case 4:
                    cinema.sortduration();
                    System.out.println("Movies sorted by duration:");
                    cinema.showMovies();
                    break;
                case 5:
                    int vipCount = 0;
                    for (Movie movie : cinema.getMovies()) {
                        if (movie instanceof VIPMovie && ((VIPMovie) movie).hasVIPSeat()) {
                            vipCount++;
                        }
                    }
                    System.out.println("Number of movies with VIP seats: " + vipCount);
                    break;
                case 6:
                    cinema.showMovies();
                    System.out.println("Enter the number of the movie you want to book: ");
                    int movieIndex = scanner.nextInt();
                    cinema.bookTicket(viewer, movieIndex);
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again");
                    break;
            }
        }

        scanner.close();
    }
}
