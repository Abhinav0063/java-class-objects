import java.util.Scanner;

class Circle {
    // Attribute
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display results
    public void displayCircleDetails() {
        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Creating Circle object and displaying details
        Circle circle = new Circle(radius);
        circle.displayCircleDetails();

        scanner.close();
    }
}
