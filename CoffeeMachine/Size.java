package CoffeeMachine;

public enum Size {
    SMALL(1.0, 1.0),
    MEDIUM(1.5, 1.5),
    LARGE(2.0, 2.0);

    private double priceMultiplier;
    private double ingredientMultiplier;

    Size(double priceMultiplier, double ingredientMultiplier) {
        this.priceMultiplier = priceMultiplier;
        this.ingredientMultiplier = ingredientMultiplier;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }

    public double getIngredientMultiplier() {
        return ingredientMultiplier;
    }

    @Override
    public String toString() {
        switch (this) {
            case SMALL: return "Small";
            case MEDIUM: return "Medium";
            case LARGE: return "Large";
            default: return "Unknown";
        }
    }
}


