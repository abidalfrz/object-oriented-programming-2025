public class Main {
    public static void main(String[] args) {
        Animal fish = new Animal("Nemo", "fish");
        fish.breathe();
        fish.move();
        fish.reproduce();
        fish.grow();

        System.out.println();

        Animal bird = new Animal("Eagle", "bird");
        bird.breathe();
        bird.move();
        bird.reproduce();
        bird.grow();

        System.out.println();

        Plant rose = new Plant("Rose");
        rose.breathe();
        rose.move();
        rose.reproduce();
        rose.grow();

        System.out.println();

        Human human = new Human("Diraf");
        human.breathe();
        human.move();
        human.reproduce();
        human.grow();
    }
    
}
