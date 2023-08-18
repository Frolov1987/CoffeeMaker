package app.utils;

import java.util.Scanner;

public class ChoiceValidator {
    public static int validateChoiceInput(Scanner scanner) {
            int choice;
            do {
                System.out.println("Enter your choice(1 to 3): ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    if (choice > 0 && choice <= 3) {
                        break;
                    }
                } else {
                    scanner.next();
                }

                System.out.println("Wrong input, please try again.");

            } while (true);
            return choice;
        }
    }

