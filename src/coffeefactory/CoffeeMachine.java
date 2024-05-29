package coffeefactory;

public class CoffeeMachine {

    public void makeCoffee(CoffeeType coffeeType) {
        Coffee coffee = CoffeeFactory.getCoffee(coffeeType);
        addBeans();
        boilWater();
        addWater(coffee);
        System.out.println("Ваш кофе готов!");
    }

    private void addWater(Coffee coffee) {
        System.out.println("Добавляем " + coffee.addingWater() + "мл. воды в напиток");
    }

    private void addBeans() {
        System.out.println("Добавляем 8 грамм молотого кофе");
    }

    private void boilWater() {
        System.out.println("Кипятим воду");
    }
}
