import java.util.Scanner;

class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayPhoneDetails() {
        System.out.println("\nMobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter Mobile Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter Mobile Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Mobile Price: ");
        double price = scanner.nextDouble();

        // Creating MobilePhone object and displaying details
        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.displayPhoneDetails();

        scanner.close();
    }
}
