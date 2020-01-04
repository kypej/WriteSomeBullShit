package Decorator;


public class HomeDogDecorator extends AnimalDecorator {

    public HomeDogDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void go(){
        super.go();
    }

    @Override
    public void speak(){
        super.speak();
    }

    public void giveTapochki(){
        System.out.println("HomeDog give tapochki");
    }

}
