package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {

    }
    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {

    }


    HashMap<String , Integer> inventoryList = new HashMap<>();

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        inventoryList.put(item, 1);
        inventoryList.put(item, 1 + 1);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        return;
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return null;
    }
}
