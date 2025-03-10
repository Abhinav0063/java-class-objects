import java.util.Scanner;

class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        System.out.print("Enter Book Price: ");
        double price = scanner.nextDouble();

        // Creating Book object and displaying details
        Book book = new Book(title, author, price);
        book.displayDetails();

        scanner.close();
    }
}
