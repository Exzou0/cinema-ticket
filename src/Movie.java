public class Movie {

private String Movie_Name;
private String genre;
private int duration;
private int age;

public  Movie(String Movie_name, String genre, int duration, int age ){
this.Movie_Name = Movie_name;
this.genre = genre;
this.duration = duration;
this.age = age;
}

    public String getTitle() {
        return Movie_Name;
    }

    public String getMovie_Name() {
        return Movie_Name;
    }

    public void setMovie_Name(String movie_Name) {
        Movie_Name = movie_Name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Movie: " + Movie_Name + ", Genre: " + genre + ", Duration: " + duration + " mins, Age Restriction: " + age + "+";
    }
}
