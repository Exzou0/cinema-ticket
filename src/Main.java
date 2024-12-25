//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Chaplin MEGA Silk Way");

        Movie mov1 = new Movie("Interstellar", "Sci-Fi", 148,16);
        Movie mov2 = new Movie("Sonic 3", "Sci-Fi", 121,13);
        Movie mov3 = new Movie("Deadpool 3", "Sci-fi fiction", 112,18);
        cinema.addMovie(mov1);
        cinema.addMovie(mov2);
        cinema.addMovie(mov3);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String viewerName = scanner.nextLine();
        System.out.println("Enter your age: ");
        int viewerAge = scanner.nextInt();
        Viewer viewer = new Viewer(viewerName, viewerAge);

        cinema.showMovies();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the movie you want to book: ");
        int movieIndex = scanner.nextInt();

        cinema.bookTicket(viewer, movieIndex);

        scanner.close();

    }
}