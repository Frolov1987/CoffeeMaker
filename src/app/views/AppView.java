package app.views;

import app.drinks.Cappuccino;
import app.drinks.Espresso;
import app.drinks.Latte;
import app.machines.CoffeeMachine;
import app.utils.ChoiceValidator;

import java.util.Scanner;

public class AppView {
    public static void drinkSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose a drink:
                     1 - Espresso
                     2 - Cappuccino
                     3 - Latte""");
        int choice = ChoiceValidator.validateChoiceInput(scanner);

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        switch (choice) {
            case 1 -> {
                coffeeMachine.setDrink(new Espresso());
                coffeeMachine.getDrink();
            }
            case 2 -> {
                coffeeMachine.setDrink(new Cappuccino());
                coffeeMachine.getDrink();
            }
            case 3 -> {
                coffeeMachine.setDrink(new Latte());
                coffeeMachine.getDrink();
            }
        }
    }
}
