// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
public class CommandPayTabCard implements Command {
    private PaymentStrategy paymentStrategy;
    private double total = new Tab().getTotal();

    public CommandPayTabCard(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void execute() {
        total = paymentStrategy.pay(total);
        displayCommand();
    }

    public void displayCommand() {
        System.out.println("Tab paid with card for $" + total);
    }
}
