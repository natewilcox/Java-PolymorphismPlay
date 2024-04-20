public class PolymorphismPlay {

    public static void main(String[] args) {

        Animal duck = new Duck();
        Animal rubberDuck = new RubberDuck();
        Animal bear = new Bear();

        pokeAnimal(duck);
        pokeAnimal(rubberDuck);
        pokeAnimal(bear);
    }

    public static void pokeAnimal(Animal animal) {
        animal.talk();
    }
}