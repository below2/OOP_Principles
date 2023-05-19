// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
public class OrderItem {

    private int itemNum;

    public OrderItem(int itemNum) {
        this.itemNum = itemNum;
    }

    public int getItemNum() {
        return itemNum;
    }

    public String toString() {
        return ("Item #" + itemNum);
    }
}