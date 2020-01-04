package Factory;

public class HondaFactory extends CarFactory {
    public Car createCar() {
        return new Honda();
    }
}
