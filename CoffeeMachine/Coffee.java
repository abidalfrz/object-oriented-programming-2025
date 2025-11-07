package CoffeeMachine;

public class Coffee {
    private String name;
    private double price;

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice(Size size) {
        return price * size.getPriceMultiplier();
    }

    @Override
    public String toString() {
        return name + "\t|\tRp" + price;
    }
}



