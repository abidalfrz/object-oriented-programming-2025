
class Human extends LivingBeing {
    
    public Human(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing using lungs.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving using legs.");
    }

    @Override
    public void reproduce() {
        System.out.println(getName() + " reproduces sexually.");
    }
}
