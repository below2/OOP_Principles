public class Orders {

    static final int MAX_ORDERS = 100;
    int itemIndex = 0;
    OrderItem[] items;

    public Orders() {
        items = new OrderItem[MAX_ORDERS];
    }

    public void add(int itemNum) {
        OrderItem newItem = new OrderItem(itemNum);
        items[itemIndex] = newItem;
        itemIndex++;
    }

    public OrderItem[] getOrderItems() {
        return items;
    }
}