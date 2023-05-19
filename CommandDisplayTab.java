// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
public class CommandDisplayTab implements Command {
    private String[] tab;

    public CommandDisplayTab() {
    }

    public void execute() {
        Tab tab = new Tab();
        this.tab = tab.getTab();
        displayCommand();
    }

    public void displayCommand() {
        for (String s : tab) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}
