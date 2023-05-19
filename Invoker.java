// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
public class Invoker {
    private Command command;

    public Invoker() {
        Aggregator.getInstance();
    }

    public void invokeDisplayMenu() {
        command = CommandFactory.createCommand("DisplayMenu", 0);
        command.execute();
    }

    public void invokeSubmitOrder(int orderNumber) {
        command = CommandFactory.createCommand("SubmitOrder", orderNumber);
        command.execute();
    }

    public void invokeDisplayTab() {
        command = CommandFactory.createCommand("DisplayTab", 0);
        command.execute();
    }

    public void invokePayTab(boolean isCash) {
        if (isCash) {
            command = CommandFactory.createCommand("PayTabCash", 0);
        } else if (!isCash) {
            command = CommandFactory.createCommand("PayTabCard", 0);
        }
        command.execute();
    }

    public void invokeShowStats() {
        command = CommandFactory.createCommand("ShowStats", 0);
        command.execute();
    }
}