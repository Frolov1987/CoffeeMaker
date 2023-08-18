package app.drinks;

public class Latte implements CoffeeDrink {
    @Override
    public void prepare() {
        System.out.println("Your Latte. Enjoy :)");
    }
}
