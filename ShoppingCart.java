import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    // Attributes
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total price of an item
    public double getTotalPrice() {
        return price * quantity;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();

        while (true) {
            // Display menu
            System.out.println("\n🛒 Shopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Checkout & Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add item
                    System.out.print("Enter Item Name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter Item Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();

                    cart.add(new CartItem(itemName, price, quantity));
                    System.out.println("✅ Item added to cart!");
                    break;

                case 2: // Remove item
                    System.out.print("Enter Item Name to Remove: ");
                    String removeItem = scanner.nextLine();
                    boolean itemRemoved = false;

                    for (CartItem item : cart) {
                        if (item.itemName.equalsIgnoreCase(removeItem)) {
                            cart.remove(item);
                            System.out.println("❌ Item removed from cart.");
                            itemRemoved = true;
                            break;
                        }
                    }
                    if (!itemRemoved) System.out.println("⚠ Item not found in cart.");
                    break;

                case 3: // Display cart
                    if (cart.isEmpty()) {
                        System.out.println("🛒 Your cart is empty.");
                    } else {
                        System.out.println("\n📦 Your Cart Items:");
                        double totalCost = 0;
                        for (CartItem item : cart) {
                            System.out.println(item.quantity + "x " + item.itemName + " - $" + item.getTotalPrice());
                            totalCost += item.getTotalPrice();
                        }
                        System.out.println("💰 Total Cost: $" + totalCost);
                    }
                    break;

                case 4: // Checkout & exit
                    double total = 0;
                    System.out.println("\n🛍 Final Cart Summary:");
                    for (CartItem item : cart) {
                        System.out.println(item.quantity + "x " + item.itemName + " - $" + item.getTotalPrice());
                        total += item.getTotalPrice();
                    }
                    System.out.println("💳 Total Amount Payable: $" + total);
                    System.out.println("🛒 Thank you for shopping with us!");
                    scanner.close();
                    return;

                default:
                    System.out.println("⚠ Invalid option. Please try again.");
            }
        }
    }
}
