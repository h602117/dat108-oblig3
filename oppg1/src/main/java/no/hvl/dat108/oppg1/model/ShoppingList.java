package no.hvl.dat108.oppg1.model;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    private final ArrayList<ShoppingListItem> items = new ArrayList<>();

    public ArrayList<ShoppingListItem> getItems() {
        return items;
    }

    public void addItem(ShoppingListItem item) {
        items.add(item);
    }

    public void removeItem(String item) {
        ShoppingListItem itemToRemove = items.stream().filter(i -> i.getName().equals(item)).findFirst().orElse(null);
        items.remove(itemToRemove);
    }

    @Override
    public String toString() {
        return Arrays.toString(items.toArray());
    }

}
