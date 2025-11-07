package CoffeeMachine;

public class Inventory {
    private double coffeeBeans;
    private double milk;
    private double sugar;

    public Inventory(double coffeeBeans, double milk, double sugar) {
        this.coffeeBeans = coffeeBeans;
        this.milk = milk;
        this.sugar = sugar;
    }

    public boolean hasEnough(Size size, boolean addSugar, boolean addMilk) {
        double needed = 1 * size.getIngredientMultiplier();
        boolean enough = coffeeBeans >= needed;
        if (addMilk) enough = enough && milk >= needed;
        if (addSugar) enough = enough && sugar >= needed;
        return enough;
    }

    public void useIngredients(Size size, boolean addSugar, boolean addMilk) {
        double mult = size.getIngredientMultiplier();
        coffeeBeans -= 1 * mult;
        if (addMilk) milk -= 1 * mult;
        if (addSugar) sugar -= 1 * mult;
    }

    @Override
    public String toString() {
        return "Stok - Kopi: " + coffeeBeans + ", Susu: " + milk + ", Gula: " + sugar;
    }
}


