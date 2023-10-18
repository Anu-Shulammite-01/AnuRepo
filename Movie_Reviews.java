import java.util.*;

public class Movie_Reviews {
    private String title;
    private String director;
    private List<String> actors;
    private List<String> reviews;

    public Movie_Reviews(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
    }

    public void addReview(String review) {
        this.reviews.add(review);
    }

    public List<String> getReviews() {
        return this.reviews;
    }

    // getters and setters for other attributes

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> actors = Arrays.asList("Actor 1", "Actor 2");
        Movie_Reviews movie = new Movie_Reviews("Title", "Director", actors);

        movie.addReview("Great movie!");
        movie.addReview(sc.nextLine());

        System.out.println(movie.getReviews());
    }
}
