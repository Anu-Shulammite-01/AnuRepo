import java.util.*;

class Movie {
    private String Title;
    private String director;
    private List<String> actors;
    private List<String> reviews;

    public Movie(String Title, String director) {
        this.Title = Title;
        this.director = director;
        this.actors = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setdirector(String director) {
        this.director = director;
    }

    public List<String> getReviews() {
        return this.reviews;
    }

    public void addReview(String review) {
        this.reviews.add(review);
    }

    public void addActors(String actor) {
        this.actors.add(actor);
    }

    public List<String> getActors() {
        return this.actors;
    }
}

class Test_M {
    public static void main(String[] args) {
        System.out.println("Enter the title of movie");
        Scanner sc = new Scanner(System.in);
        String Title = sc.nextLine();
        String director = sc.nextLine();
        Movie m1 = new Movie(Title, director);
        m1.addActors(sc.nextLine());
        m1.addReview(sc.nextLine());
        System.out.println("The review for the movie " + Title + " is: " + m1.getReviews());
    }
}