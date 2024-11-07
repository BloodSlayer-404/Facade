package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Inventory {

    private List<String> items = new ArrayList<>();

    /**
     * Put an item inside Link's inventory
     * @param item: The item to be added in the inventory
     * @return "Link gets an item and puts it in his inventory"
     */
    public String getItem(String item){
        items.add(item);
        return "Link gets a " + item + " and puts it in his inventory";
    }

    /**
     * Indicates Link to use an item
     * @param item: The item to be used from the inventory
     * @return A text describing if Link can use the item or not
     */
    public String useItem(String item){
        if (items.contains(item)){
            items.remove(item);
            return "Link uses the " + item + " that he has in his inventory";
        }

        return "Link did not have a " + item + " in his inventory";
    }

}
