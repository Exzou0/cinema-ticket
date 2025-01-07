public class VIPMovie extends Movie {
    private boolean hasVIPSeat;

    public VIPMovie(String movieName, String genre, int duration, int age, boolean hasVIPSeat) {
        super(movieName, genre, duration, age);
        this.hasVIPSeat = hasVIPSeat;
    }

    public boolean hasVIPSeat() {
        return hasVIPSeat;
    }

    @Override
    public String toString() {
        return super.toString() + ", VIP Movie: " + (hasVIPSeat ? "Yes" : "No");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        VIPMovie vipMovie = (VIPMovie) obj;
        return hasVIPSeat == vipMovie.hasVIPSeat && super.equals(obj);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + (hasVIPSeat ? 1 : 0);
    }
}
