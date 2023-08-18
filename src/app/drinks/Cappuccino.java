package app.drinks;

public class Cappuccino implements CoffeeDrink {
    @Override
    public void prepare() {
        System.out.println("Your Cappuccino. Enjoy :)");
    }
}
