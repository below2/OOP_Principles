// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 05/19/2023
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String menuTasks = "\n\tFANCY MENU CHOICES\n"
                + "1 - Display all menu items\n"
                + "2 - Submit an order\n"
                + "3 - Display tab\n"
                + "4 - Pay tab\n"
                + "5 - Show ordering stats\n"
                + "0 - EXIT\n";

        boolean exit = false;

        do {
            int choice = menu(menuTasks, "Please enter an option number: ", 0, 5);
            switch (choice) {
                case 1:
                    SystemInterface.displayMenu();
                    break;
                case 2:
                    System.out.print("Please enter the item number you would like to order: ");
                    Scanner cin = new Scanner(System.in);
                    int itemNum = cin.nextInt();

                    SystemInterface.submitOrder(itemNum);
                    break;
                case 3:
                    SystemInterface.displayTab();
                    break;
                case 4:
                    boolean paymentType = validatePayment("Would you like to pay with cash? (true/false): ");
                    SystemInterface.payTab(paymentType);
                    break;
                case 5:
                    SystemInterface.showStats();
                    break;
                case 0:
                    exit = true;
                    break;
            }
        } while (!exit);
    }

    private static boolean validatePayment(String prompt) {

        System.out.println("WARNING: Paying with card adds a 5% surcharge to your bill");
        System.out.print(prompt);

        Scanner input = new Scanner(System.in);
        while (!input.hasNextBoolean()) {
            input.next();
            System.out.println("Invalid Choice, Please enter true or false.");
            System.out.print(prompt);
        }
        return input.nextBoolean();
    }

    private static int validateChoice(Scanner input, String prompt) {

        System.out.print(prompt);

        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Invalid Choice, Please enter a number from 0-5.");
            System.out.print(prompt);
        }
        return input.nextInt();
    }

    private static int menu(String menuTasks, String displayString, int min, int max) {

        System.out.println(menuTasks);

        Scanner scanner = new Scanner(System.in);

        int input = validateChoice(scanner, displayString);

        while (min > input || input > max) {
            System.out.println(input + " is not an option, Please input a number from 0-5");
            input = validateChoice(scanner, displayString);
        }

        return input;
    }
}