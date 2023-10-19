import java.util.*;

class Books_Library {
    private List<String> Books;

    public Books_Library(){
        this.Books = new ArrayList<>();
    }
    public void addBook(String book) {
        this.Books.add(book);
    }

    public void removeBook(String book) {
        if (this.Books.contains(book)) {
            this.Books.remove(book);
        }
    }

    public List<String> getBooks() {
        return this.Books;
    }
}

class Library {
    public static void main(String[] args) {
        Books_Library books = new Books_Library();
        Scanner sc = new Scanner(System.in);
        books.addBook("Wings of Fire");
        books.addBook("When breath becomes air");
        books.addBook("Think and Grow rich");

        System.out.println("Do you want to add a book");
        String choice = sc.nextLine().toLowerCase();
        while (!choice.equalsIgnoreCase("no")){
            System.out.print("Enter the name of the Book: ");
            String bookName = sc.nextLine();
            books.addBook(bookName);
            System.out.println("Wanna add another book?");
            choice = sc.nextLine().toLowerCase();
        }
        System.out.println("Do you want to remove a book");
        choice = sc.nextLine().toLowerCase();
        while(!choice.equalsIgnoreCase("no")){
            System.out.print("Enter the name of the Book: ");
            String bookName = sc.nextLine();
            books.removeBook(bookName);
            System.out.println("Wanna remove another book?");
            choice = sc.nextLine().toLowerCase();
        }
        System.out.println("The list of books is now:" + books.getBooks());
    }
}