package CoffeeMachine;


import java.util.ArrayList;

public class Menu {
    private ArrayList<Coffee> coffeeList;

    public Menu() {
        coffeeList = new ArrayList<>();
        coffeeList.add(new Coffee("Espresso", 8000));
        coffeeList.add(new Coffee("Cappuccino", 10000));
        coffeeList.add(new Coffee("Latte", 12000));
        coffeeList.add(new Coffee("Americano", 9000));
    }

    public void showMenu() {
        System.out.println("=".repeat(10) + " Menu Coffee " + "=".repeat(10));
        for (int i = 0; i < coffeeList.size(); i++) {
            System.out.println((i + 1) + ". " + coffeeList.get(i));
        }

        System.out.println("=".repeat(33));
    }

    public Coffee getCoffee(int index) {
        if (index >= 0 && index < coffeeList.size()) {
            return coffeeList.get(index);
        } else {
            return null;
        }
    }
}

