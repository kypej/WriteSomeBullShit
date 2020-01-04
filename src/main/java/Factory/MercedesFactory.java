package Factory;

public class MercedesFactory extends CarFactory {

    public Car createCar() {
        return new Mercedes();
    }
}
