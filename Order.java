import java.util.ArrayList;

public class Order {


    // Member variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();


    // Constructors
    public Order(){
        this.name = "Guest";
        this.ready = false;
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;
    }


    // Getters
    public String getName() {
        return this.name;
    }

    public boolean getReady() {
        return this.ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }


    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // Methods
    public void addItem(Item item) {
        this.items.add(item);
    }

    public double getOrderTotal() {
        double total = 0.00;
        for(Item item:this.items) {
            total += item.getPrice();
        }
        return total;
    }

    public String getStatusMessage() {
        if(this.ready == true) {
            return ("Your order is ready!");
        } else {
            return ("Your order will be ready shortly.");
        }
    }

    public void display() {
        System.out.printf("\n\nCustomer Name: %s", this.name);

        for(Item item:this.items) {
            System.out.printf("\n%s - $%s",item.getName(),item.getPrice());
        }

        System.out.printf("\nTotal: $%s\n\n", this.getOrderTotal());
    }
}