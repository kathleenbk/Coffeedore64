import java.util.ArrayList;

public class CoffeeKiosk {

    // Member Variables
    private ArrayList<Item> menu= new ArrayList<Item>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    // Constructor
    public CoffeeKiosk() {

    }

    // Methods
    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);

        menu.add(newItem);

        int index = menu.indexOf(newItem);
        newItem.setIndex(index);
    }

    public void displayMenu() {
        for(Item item:this.menu) {
            System.out.printf("\n\n%s  %s --- $%s", item.getIndex(), item.getName(), item.getPrice());
        }
    }

    public void newOrder() {

        // Shows the user a message prompt and sets their input to a variable, name
        System.out.println("Please enter a name for the order.");
        String name = System.console().readLine();

        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order newOrder = new Order(name);
        displayMenu();

        // Prompts the user to enter an item number.
        System.out.println("Please enter a menu item number, or enter q to quit.");
        String itemNum = System.console().readLine();

        // Write a while loop to collect all user's orderitems
        while(!itemNum.equals("q")) {

        int i = Integer.parseInt(itemNum);

        if(i < this.menu.size()) {
            Item orderItem = menu.get(i);
            newOrder.addItem(orderItem);
        } else {
            System.out.println("That item does not exist.");
        }
        System.out.println("\nPlease enter a menu item number, or enter q to quit.");
        itemNum = System.console().readLine();
        }
        newOrder.display();
        this.orders.add(newOrder);
        
    } 
}