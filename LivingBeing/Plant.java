
class Plant extends LivingBeing {
    public Plant(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing through stomata.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is stationary but can grow towards light.");
    }

    @Override
    public void reproduce() {
        System.out.println(getName() + " reproduces through seeds or spores.");
    }
}
