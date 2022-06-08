public class Test {
    public static void main(String[] args) {

        // Create a coffee kiosk
        CoffeeKiosk kiosk = new CoffeeKiosk();

        // Add menu items
        kiosk.addMenuItem("Mocha", 25.99);
        kiosk.addMenuItem("Latte", 12.99);
        kiosk.addMenuItem("Drip Coffee", 45.99);
        kiosk.addMenuItem("Capuccino", 33.99);

        // Create order
        kiosk.newOrder();

    }
}