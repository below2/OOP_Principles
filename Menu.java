// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
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

    public String[] getMenuOutput() {
        String[] menu = new String[MAX_ITEMS];
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                menu[i] = items[i].toString();
            }
        }

        return menu;
    }
}
