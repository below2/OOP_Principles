// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
public class CommandDisplayMenu implements Command {
    private Aggregator aggregator;
    private String[] menuItems = new String[Menu.MAX_ITEMS];

    public CommandDisplayMenu() {
        aggregator = Aggregator.getInstance();
    }

    public void execute() {
        menuItems = aggregator.getMenu().getMenuOutput();
        displayCommand();
    }

    public void displayCommand() {
        for (String s : menuItems) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}
