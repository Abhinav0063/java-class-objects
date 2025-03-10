import java.util.Scanner;

class Item {
    // Attributes
    String itemCode;
    String itemName;
    double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("\nItem Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: $" + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for item details
        System.out.print("Enter Item Code: ");
        String itemCode = scanner.nextLine();
        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter Item Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        // Creating Item object and displaying details
        Item item = new Item(itemCode, itemName, price);
        item.displayItemDetails();

        // Calculating and displaying total cost
        System.out.println("Total Cost for " + quantity + " units: $" + item.calculateTotalCost(quantity));

        scanner.close();
    }
}
