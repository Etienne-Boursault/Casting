public class Casting {

    public static void main(String[] args) {
        Animal myAnimal = new Dog();

        doAnimalStuff(myAnimal);

        Cat cat = new Cat();
        doAnimalStuff(cat);
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();

        if (animal instanceof Dog) {
            Dog myDog = (Dog) animal;
            myDog.growl();
        }
    }
}
