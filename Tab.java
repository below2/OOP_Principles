
// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tab {
    private Aggregator aggregator;

    public Tab() {
        aggregator = Aggregator.getInstance();
    }

    public String[] getTab() {
        Orders orders = aggregator.getOrders();
        Menu menu = aggregator.getMenu();
        String[] tab = new String[orders.getCurrentOrderItems().length + 1];

        double total = 0;
        int i = 0;

        for (OrderItem order : orders.getCurrentOrderItems()) {
            for (MenuItem menuItem : menu.getMenuItems()) {
                if (order != null && menuItem != null && order.getItemNum() == menuItem.getItemNum()) {
                    tab[i] = "Tab: Item #" + order.getItemNum() + " " + menuItem.getDescription() + " $"
                            + menuItem.getPrice();
                    total += menuItem.getPrice();
                }
            }
            i++;
        }

        for (i = 0; i < tab.length; i++) {
            if (tab[i] == null) {
                tab[i] = "Total: $" + total;
                break;
            }
        }

        return tab;
    }

    public ArrayList<String> showStats() {
        Orders orders = aggregator.getOrders();
        Menu menu = aggregator.getMenu();
        MenuItem[] orderedMenuItems = new MenuItem[orders.getAllOrderItems().length];
        ArrayList<String> stats = new ArrayList<String>();
        int i = 0;

        for (OrderItem orderItem : orders.getAllOrderItems()) {
            for (MenuItem menuItem : menu.getMenuItems()) {
                if (orderItem != null && menuItem != null && orderItem.getItemNum() == menuItem.getItemNum()) {
                    orderedMenuItems[i] = menuItem;
                }
            }
            i++;
        }

        Map<MenuItem, Integer> duplicates = new HashMap<>();
        for (MenuItem element : orderedMenuItems) {
            if (duplicates.containsKey(element)) {
                int count = duplicates.get(element);
                duplicates.put(element, count + 1);
            } else {
                duplicates.put(element, 1);
            }
        }

        for (Map.Entry<MenuItem, Integer> entry : duplicates.entrySet()) {
            if (entry.getKey() != null) {
                String element = entry.getKey().toString();
                int count = entry.getValue();
                stats.add(element + ", Count: " + count);
            }
        }

        return stats;
    }

    public double getTotal() {
        Orders orders = aggregator.getOrders();
        Menu menu = aggregator.getMenu();
        double total = 0;

        for (OrderItem order : orders.getCurrentOrderItems()) {
            for (MenuItem menuItem : menu.getMenuItems()) {
                if (order != null && menuItem != null && order.getItemNum() == menuItem.getItemNum()) {
                    total += menuItem.getPrice();
                }
            }
        }

        return total;
    }
}
