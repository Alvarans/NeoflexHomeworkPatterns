package coffeefactory;

public class CoffeeFactory {

    public static Coffee getCoffee(CoffeeType coffeeType) {
        Coffee coffee;
        switch (coffeeType) {
            case ESPRESSO -> coffee = new Espresso();
            case AMERICANO -> coffee = new Americano();
            default -> throw new IllegalArgumentException("Wrong coffee type");
        }
        return coffee;
    }
}
