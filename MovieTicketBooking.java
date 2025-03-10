import java.util.Scanner;

class MovieTicket {
    // Attributes
    String movieName;
    int seatNumber;
    double price;

    // Constructor
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("\n🎬 Movie Ticket Details:");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for movie details
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();
        System.out.print("Enter Seat Number: ");
        int seatNumber = scanner.nextInt();
        System.out.print("Enter Ticket Price: ");
        double price = scanner.nextDouble();

        // Creating a MovieTicket object and displaying details
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);
        ticket.displayTicketDetails();

        scanner.close();
    }
}
