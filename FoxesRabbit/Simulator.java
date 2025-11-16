package FoxesRabbit;

import java.util.List;
import java.util.ArrayList;

public class Simulator {
    private Field field;
    private List<Animal> animals;

    public Simulator(int depth, int width) {
        field = new Field(depth, width);
        animals = new ArrayList<>();
        populate();
    }

    public void simulate(int steps){
        for (int step = 0; step < steps; step++) {
            List<Animal> newAnimals = new ArrayList<>();
            
            for (Animal animal : animals) {
                if (animal.isAlive()) {
                    animal.act(newAnimals);
                }
            }
            
            animals.removeIf(a -> !a.isAlive());
            
            animals.addAll(newAnimals);
            System.out.println("Step: " + (step + 1) + ", Animals: " + animals.size());

            field.printField();
        }
    }

    private void populate() {
        for (int row = 0; row < field.getDepth(); row++) {
            for (int col = 0; col < field.getWidth(); col++) {

                double rand = Math.random();

                Location location = new Location(row, col);

                if (rand < 0.10) {
                    animals.add(new Rabbit(field, location));
                }
                else if (rand < 0.15) { // 5% untuk fox
                    animals.add(new Fox(field, location));
                }
            }
        }
    }
}
