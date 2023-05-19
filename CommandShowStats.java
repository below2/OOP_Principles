// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
import java.util.ArrayList;

public class CommandShowStats implements Command {
    private ArrayList<String> stats;

    public CommandShowStats() {
    }

    public void execute() {
        Tab tab = new Tab();
        stats = tab.showStats();
        displayCommand();
    }

    public void displayCommand() {
        for (String s : stats) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}
