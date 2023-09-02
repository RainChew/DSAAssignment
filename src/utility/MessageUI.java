package utility;

import static utility.MessageUI.printFormattedText;
/**
 *
 * @author Chew Lip Sin
 */
public class MessageUI {

    public static void displayInvalidChoiceMessage() {
        printFormattedText("\nInvalid choice\n", ConsoleColor.RED);
    }

    public static void displayExitMessage() {
        printFormattedText("\nExiting system...", ConsoleColor.GREEN);

    }

    public static void askConfirmationMessage(String val) {
        printFormattedText("Are you sure to " + val + " it?(1 is Yes and 0 is No): ", ConsoleColor.BRIGHTBLUE);
    }

    public static void displaySuccessConfirmationMessage(String val) {
        printFormattedText(val + " Successfully!\n", ConsoleColor.GREEN);
    }

    public static void displayInvalidFormat() {
        printFormattedText("Your input is not in correct format: ", ConsoleColor.YELLOW);
    }

    public static void printFormattedText(String text, ConsoleColor color) {
        System.out.print(color + text + ConsoleColor.RESET);
    }
}
