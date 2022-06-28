/** ****************************************************************************
 * Inventory.java
 * Kevin Bell
 *
 * This class of objects stores and manipulates information for inventory items
 **************************************************************************** */
package improvedinventoryprogram;

public class Inventory {

    private String name;
    private double price;
    private int quantity;

    public Inventory(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    } //end Inventory constructor

    public String getName() {
        return name;
    } //end getName

    public double getPrice() {
        return price;
    } //end getPrice

    public int getQuantity() {
        return quantity;
    } //end getQuantity

    public String display() {
        String display = String.format("Item: %-12s Price: $%-7.2f Quantity: %d",  
                name, price, quantity);
        return display;
    } //end display

    public double sell(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            return price;
        } else {
            return 0;
        } //end if
    } //end sell
} //end class Inventory
