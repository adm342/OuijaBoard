package OuijaBoardController;

import java.util.Scanner;

public class OuijaBoardApp {
    public static void main(String[] args) {
        String futureString = "Your future is unclear";
        String moneyString = "You will become rich";
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Ouija Board\n");
        while (isRunning) {
            System.out.println(
                    "---------------------------\n" +
                            "|       YES      NO       |\n" +
                            "|                         |\n" +
                            "|      ABCDEFGHIJKLM      |\n" +
                            "|      NOPQRSTUVWXYZ      |\n" +
                            "|                         |\n" +
                            "|       1234567890        |\n" +
                            "|                         |\n" +
                            "|      x GOOD BYE x       |\n" +
                            "---------------------------\n");

            boolean isQuestionAnswered = false;
            while (!isQuestionAnswered) {

                System.out.println("What would you like to ask the spirits?\nSay Goodbye to leave the board");
                String question = scanner.nextLine();

                if (question.toLowerCase().contains("goodbye")) {
                    isQuestionAnswered = true;
                    isRunning = false;
                }
                if (question.toLowerCase().contains("future")) {
                    for (int i = 0; i < futureString.length(); i++) {
                        System.out.print(futureString.charAt(i));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        if (i == futureString.length() - 1) {
                            System.out.println();
                        }
                    }
                    isQuestionAnswered = true;
                }
                if (question.contains("money") || question.contains("rich")) {
                    for (int i = 0; i < moneyString.length(); i++) {
                        System.out.print(moneyString.charAt(i));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        if (i == moneyString.length() - 1) {
                            System.out.println();
                        }
                    }
                    isQuestionAnswered = true;
                }
            }
        }
    }

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

