package app.drinks;

public class Espresso implements CoffeeDrink {
    @Override
    public void prepare() {
        System.out.println("Your Espresso. Enjoy :)");
    }
}
