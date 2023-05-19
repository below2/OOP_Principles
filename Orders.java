// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
public class Orders {

    static final int MAX_ORDERS = 100;
    int itemIndex = 0;
    OrderItem[] items;
    OrderItem[] orderedItems;

    public Orders() {
        items = new OrderItem[MAX_ORDERS];
        orderedItems = new OrderItem[MAX_ORDERS];
    }

    public void add(int itemNum) {
        OrderItem newItem = new OrderItem(itemNum);
        items[itemIndex] = newItem;
        orderedItems[itemIndex] = newItem;
        itemIndex++;
    }

    public OrderItem[] getCurrentOrderItems() {
        return items;
    }

    public OrderItem[] getAllOrderItems() {
        return orderedItems;
    }

    public String getOrderOutput(int orderNumber) {
        String order = "";
        for (OrderItem orderItem : items) {
            if (orderItem != null && orderItem.getItemNum() == orderNumber) {
                order = "Ordered item: " + orderItem.toString();
            }
        }

        return order;
    }

    public void clearOrders() {
        items = new OrderItem[MAX_ORDERS];
        itemIndex = 0;
    }
}