// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 04/12/2023
public class MenuItem {

    private int itemNum;
    private String description;
    private double price;

    public MenuItem(int itemNum, String description, double price) {
        this.itemNum = itemNum;
        this.description = description;
        this.price = price;
    }

    public int getItemNum() {
        return itemNum;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return ("Item #" + itemNum + ", $" + price + "\n" + description);
    }
}