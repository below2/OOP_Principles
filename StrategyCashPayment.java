// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
public class StrategyCashPayment implements PaymentStrategy {
    Aggregator aggregator = Aggregator.getInstance();
    double total;

    public double pay(double amount) {
        aggregator.getOrders().clearOrders();
        return amount;
    }
}
