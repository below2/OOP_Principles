// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
public class CommandSubmitOrder implements Command {
    private Aggregator aggregator;
    private int orderNumber;
    private String order;

    public CommandSubmitOrder(int orderNumber) {
        aggregator = Aggregator.getInstance();
        this.orderNumber = orderNumber;
    }

    public void execute() {
        aggregator.getOrders().add(orderNumber);
        order = aggregator.getOrders().getOrderOutput(orderNumber);
        displayCommand();
    }

    public void displayCommand() {
        System.out.println(order.toString());
    }
}