package Decorator;


public class HomelessDogDecorator extends AnimalDecorator {

    public HomelessDogDecorator(Animal animal) {
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

    public void bite(){
        System.out.println("homeless dog bit's you");
    }

}
