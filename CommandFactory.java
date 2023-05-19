// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
public class CommandFactory {
    public static Command createCommand(String commandType, int orderNumber) {
        if (commandType.equalsIgnoreCase("DisplayMenu")) {
            return new CommandDisplayMenu();
        } else if (commandType.equalsIgnoreCase("SubmitOrder")) {
            return new CommandSubmitOrder(orderNumber);
        } else if (commandType.equalsIgnoreCase("DisplayTab")) {
            return new CommandDisplayTab();
        } else if (commandType.equalsIgnoreCase("PayTabCash")) {
            return new CommandPayTabCash(new StrategyCashPayment());
        } else if (commandType.equalsIgnoreCase("PayTabCard")) {
            return new CommandPayTabCard(new StrategyCardPayment());
        } else if (commandType.equalsIgnoreCase("ShowStats")) {
            return new CommandShowStats();
        }
        return null;
    }
}