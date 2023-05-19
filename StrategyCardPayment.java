// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
public class StrategyCardPayment implements PaymentStrategy {
    Aggregator aggregator = Aggregator.getInstance();
    double total;

    public double pay(double amount) {
        amount = amount * 1.05;
        aggregator.getOrders().clearOrders();
        return amount;
    }
}
