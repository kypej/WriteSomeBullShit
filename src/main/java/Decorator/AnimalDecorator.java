package Decorator;


public class AnimalDecorator implements Animal {
    private Animal animal;

    AnimalDecorator(Animal animal) {
        this.animal = animal;
    }

    public void go() {
        animal.go();
    }

    public void speak() {
        animal.speak();
    }
}
