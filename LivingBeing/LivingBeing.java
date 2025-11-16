
abstract class LivingBeing {
    private String name;

    public LivingBeing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void breathe();
    abstract void move();
    abstract void reproduce();

    void grow() {
        System.out.println("The living being is growing.");
    }

}