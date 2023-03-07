import java.util.Scanner;

public class OuijaBoardApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Ouija Board\n" +
                "---------------------------\n" +
                "|       YES      NO       |\n" +
                "|                         |\n" +
                "|      ABCDEFGHIJKLM      |\n" +
                "|      NOPQRSTUVWXYZ      |\n" +
                "|                         |\n" +
                "|       1234567890        |\n" +
                "|                         |\n" +
                "|      x GOOD BYE x       |\n" +
                "---------------------------\n\n\n" +
                "What would you like to ask the spirits?");
        String question = scanner.nextLine();
        boolean questionAnswered = false;
            if (question.isBlank() || question.isEmpty()) {
                System.out.println("The spirits did not understand, please ask again.");
                question = scanner.nextLine();
            } else if (question.contains("future") || question.contains("Future")) {
                System.out.println("Your future is unclear");
                questionAnswered = true;
            } else if (question.contains("money")) {
                System.out.println("You will become rich");
                questionAnswered = true;
            } else System.out.println("The spirits did not understand, please ask again.");
            question = scanner.nextLine();
        }
    }


