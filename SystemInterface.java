// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
public class SystemInterface {
    private static Invoker invoker = new Invoker();

    public static void displayMenu() {
        invoker.invokeDisplayMenu();
    }

    public static void submitOrder(int orderNumber) {
        invoker.invokeSubmitOrder(orderNumber);
    }

    public static void displayTab() {
        invoker.invokeDisplayTab();
    }

    public static void payTab(boolean isCash) {
        invoker.invokePayTab(isCash);
    }

    public static void showStats() {
        invoker.invokeShowStats();
    }
}