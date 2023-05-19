// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
public class CommandPayTabCash implements Command {
    private PaymentStrategy paymentStrategy;
    private double total = new Tab().getTotal();

    public CommandPayTabCash(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void execute() {
        total = paymentStrategy.pay(total);
        displayCommand();
    }

    public void displayCommand() {
        System.out.println("Tab paid with cash for $" + total);
    }
}
