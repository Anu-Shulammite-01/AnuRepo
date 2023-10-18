import java.util.*;

class Movie {
    private String Title;
    private String director;
    private String actors;
    private String reviews;

    public String getReviews() {
        return this.reviews;
    }

}

class Test_Movie {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        System.out.println("Enter the title of movie");
        Scanner sc = new Scanner(System.in);
        String Title = sc.nextLine();
        String director = sc.nextLine();
        String actors = sc.nextLine();
        String reviews = sc.nextLine();
        System.out.println("The review for the movie " + Title + " is: " + m1.getReviews());
        System.out.println("The actor is: " + actors + " and director is: " + director);
    }
}