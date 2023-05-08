
// Brendan Benlolo
// Andrew Rosscoe
// COSC436-002
// 04/12/2023
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Initialize menu and add "dummy" items to it.
        Menu fancyMenu = new Menu();
        fancyMenu.add(1, "Ribeye", 49.99);
        fancyMenu.add(2, "Flan", 8.50);
        fancyMenu.add(3, "Carbonara", 24.99);
        fancyMenu.add(4, "Lobster", 52.99);
        fancyMenu.add(5, "Salad", 7.99);
        fancyMenu.add(6, "Cheesecake", 9.00);
        fancyMenu.add(7, "Shrimp", 13.00);

        // Save String for menu tasks
        String menuTasks = "\n\tFANCY MENU CHOICES\n\n"
                + "1 - Display all menu items\n"
                + "2 - Submit an order\n"
                + "3 - Display tab\n"
                + "0 - EXIT\n";

        // Scanner userInput = new Scanner(System.in);
        boolean exit = false;
        MenuIterator iterator;

        do {
            int choice = menu(menuTasks, "Please enter an option number: ", 0, 8);
            switch (choice) {

                // Display all menu items
                case 1:
                    iterator = fancyMenu.getAllItemsIterator();
                    iteratorPrinter("ENTIRE MENU", iterator);
                    break;

                // EXIT PROGRAM
                case 0:
                    exit = true;
                    break;
            }
        } while (!exit);
    }

    private static int validateChoice(Scanner input, String prompt) {

        System.out.println(prompt);

        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Invalid Choice, Please enter a number from 0-8.");
            System.out.println(prompt);
        }
        return input.nextInt();
    }

    private static void iteratorPrinter(String display, MenuIterator itr) {
        System.out.println(display);
        MenuItem item;
        while (itr.hasNext()) {
            item = itr.next();
            System.out.println(item.toString());
        }
    }

    private static int menu(String menuTasks, String displayString, int min, int max) {

        System.out.println(menuTasks);

        Scanner scanner = new Scanner(System.in);

        int input = validateChoice(scanner, displayString);

        while (min > input || input > max) {
            System.out.println(input + " is not an option, Please input a number from 0-8");
            input = validateChoice(scanner, displayString);
        }

        return input;
    }
}