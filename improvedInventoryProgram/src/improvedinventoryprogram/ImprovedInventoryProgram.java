/** ****************************************************************************
 * StoreInventory.java
 * Kevin Bell
 *
 * This program keeps track of a store inventory and allows the user to
 * purchase items from inventory
 **************************************************************************** */
package improvedinventoryprogram;

import java.util.Scanner;

public class ImprovedInventoryProgram {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        String name, keepSelling;
        int quantity;
        double cost;
        System.out.println("Ch 10 Inventory by Kevin Bell\n");
        Store store = new Store(); //instantiate, populate inventory
        store.display(); //display inventory
        do { //loop to sell items from inventory
            System.out.print("Which item? ");
            name = computerKeyboardInput.nextLine();
            System.out.print("How many? ");
            quantity = computerKeyboardInput.nextInt();
            computerKeyboardInput.nextLine(); //flush newline
            //sell
            cost = store.sell(name, quantity);
            if (cost == 0) {
                System.out.println("We don't have that quantity to sell");
            } else {
                System.out.printf("Cost: $%-7.2f\n", (cost * quantity));
            }
            store.display(); //display inventory after each transaction
            System.out.print("Continue? "); //user exit if desired
            keepSelling = computerKeyboardInput.nextLine();
        } while (keepSelling.equalsIgnoreCase("y")); //end do-while
    } //end main  
} //end class StoreInventory
