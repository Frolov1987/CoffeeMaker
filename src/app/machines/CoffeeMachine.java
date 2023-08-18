package app.machines;

import app.drinks.CoffeeDrink;

public class CoffeeMachine {
    private CoffeeDrink drink;
    public void setDrink(CoffeeDrink drink){this.drink = drink;}
    public void getDrink(){drink.prepare();}
}
