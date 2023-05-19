// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
public class Aggregator {
    private Menu menu;
    private Orders orders;

    private static Aggregator instance;

    private Aggregator() {
        menu = new Menu();
        orders = new Orders();
    }

    public static Aggregator getInstance() {
        if (instance == null) {
            instance = new Aggregator();
        }
        return instance;
    }

    public Menu getMenu() {
        return menu;
    }

    public Orders getOrders() {
        return orders;
    }
}