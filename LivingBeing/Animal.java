
class Animal extends LivingBeing {
    private String species;
    public Animal(String name, String species) {
        super(name);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public void breathe() {
        switch (species) {
            case "fish" -> System.out.println(getName() + " is breathing using gills.");
            case "bird" -> System.out.println(getName() + " is breathing using lungs and air sacs.");
            default -> System.out.println(getName() + " is breathing using lungs.");
        }
    }

    @Override
    public void move() {
        switch (species) {
            case "fish" -> System.out.println(getName() + " is swimming.");
            case "bird" -> System.out.println(getName() + " is flying.");
            default -> System.out.println(getName() + " is walking or running.");
        }
    }

    @Override
    public void reproduce() {
        switch (species) {
            case "fish" -> System.out.println(getName() + " reproduces by laying eggs in water.");
            case "bird" -> System.out.println(getName() + " reproduces by laying eggs in nests.");
            default -> System.out.println(getName() + " reproduces sexually.");
        }
    }

}
