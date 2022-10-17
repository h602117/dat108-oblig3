package no.hvl.dat108.oppg1.model;

public class ShoppingListItem {

    private String name;

    public ShoppingListItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("ShoppingListItem{name='%s'}", this.name);
    }

}
