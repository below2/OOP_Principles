// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 04/12/2023
public class Menu {

    static final int MAX_ITEMS = 100;
    int itemIndex = 0;
    MenuItem[] items;

    public Menu() {
        items = new MenuItem[MAX_ITEMS];
        items[0] = new MenuItem(1, "Ribeye", 49.99);
        items[1] = new MenuItem(2, "Flan", 8.50);
        items[2] = new MenuItem(3, "Carbonara", 24.99);
        items[3] = new MenuItem(4, "Lobster", 52.99);
        items[4] = new MenuItem(5, "Salad", 7.99);
        items[5] = new MenuItem(6, "Cheesecake", 9.00);
        items[6] = new MenuItem(7, "Shrimp", 13.00);
    }

    public void add(int itemNum, String description, double price) {
        MenuItem newItem = new MenuItem(itemNum, description, price);
        items[itemIndex] = newItem;
        itemIndex++;
    }

    public MenuItem[] getMenuItems() {
        return items;
    }

    // public void delete(MenuIterator itr) {

    // AllItemsIterator itemsIterator = (AllItemsIterator) itr;
    // int indexToDelete = itemsIterator.i - 1;

    // for (int i = indexToDelete; i < items.length - 1; i++) {
    // items[i] = items[i + 1];
    // }
    // if (items.length == MAX_ITEMS) {
    // items[items.length - 1] = null;
    // }
    // itemIndex--;
    // }

    // public MenuIterator getAllItemsIterator() {
    // return new AllItemsIterator();
    // }

    // public MenuIterator getItemIterator(int category) {
    // return new ItemIterator(category);
    // }

    // public MenuIterator getHeartHealthyIterator(boolean healthValue) {
    // return new HeartHealthyIterator(healthValue);
    // }

    // public MenuIterator getPriceIterator(double price) {
    // return new PriceIterator(price);
    // }

    // Iterate over all Menu items
    // private class AllItemsIterator implements MenuIterator {
    // private int i; // index

    // public boolean hasNext() {

    // return !(i >= items.length || items[i] == null);
    // }

    // public MenuItem next() {

    // return items[i++];
    // }
    // }

    // // Iterates over specific category of menu items
    // private class ItemIterator implements MenuIterator {
    // private int i; // index
    // private int category; //food category

    // public ItemIterator(int category) {

    // this.category = category;
    // }

    // public boolean hasNext() {

    // return !(i >= items.length || items[i] == null) && filter();
    // }

    // public boolean filter() {

    // if (items[i].getCategory() == category) {
    // return true;
    // } else {
    // i++;
    // return hasNext();
    // }
    // }

    // public MenuItem next() {

    // return items[i++];

    // }
    // }

    // // Iterates over the heart healthy items
    // private class HeartHealthyIterator implements MenuIterator {
    // private int i; // index
    // private boolean healthValue;

    // public HeartHealthyIterator(boolean healthValue) {

    // this.healthValue = healthValue;
    // }

    // public boolean hasNext() {

    // return !(i >= items.length || items[i] == null) && filter();
    // }

    // public boolean filter() {
    // if (items[i].isHeartHealthy() == healthValue) {
    // return true;
    // } else {
    // i++;
    // return hasNext();
    // }
    // }

    // public MenuItem next() {

    // return items[i++];
    // }
    // }

    // // Iterates over the main dishes that are under a price chosen by user
    // private class PriceIterator implements MenuIterator {
    // double priceCapacity;
    // private int i;

    // public PriceIterator(double priceCapacity) {

    // this.priceCapacity = priceCapacity;
    // }

    // public boolean hasNext() {

    // return !(i >= items.length || items[i] == null) && filter();
    // }

    // public boolean filter() {

    // if (items[i].getPrice() <= priceCapacity) {
    // return true;
    // } else {
    // i++;
    // return hasNext();
    // }
    // }

    // public MenuItem next() {

    // return items[i++];
    // }
    // }
}
